/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import controller.LocationController;
import controller.MonthCardController;
import controller.SenderController;
import model.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import controller.WatchController;
import java.util.ArrayList;
import java.util.List;

import model.Location;

/**
 *
 * @author Admin
 */
public class TicketDao {
    private int rsDelete;
    private int checkMonth_Card=0;
    private int checkSender=0;
    private int checkFull;// ==1: bãi xe đầy
    private int checkType;//
    int kt=0;
    private String sender_id;
    private int rsAdd;
    private Ticket ticket = new Ticket();
    String status;
    Location location = new Location();
    public TicketDao(){
        
    }
    
    public List<Ticket> getAllTicket(){
        List<Ticket> tickets = new ArrayList<Ticket>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM ticket";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Ticket ticket = new Ticket();
                
                ticket.setId(rs.getInt("id"));
                ticket.setSender_id(rs.getInt("sender_id"));
                ticket.setType(rs.getString("type"));
                ticket.setArea(rs.getString("area"));
                ticket.setLicense_plate(rs.getString("license_plate"));
                ticket.setTime_create(rs.getString("time_create"));
                ticket.setStatus_month_card(rs.getString("status_month_card"));
                ticket.setLocation_id(rs.getInt("location_id"));
                tickets.add(ticket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tickets;
    }
    
    public void addTicket(Ticket ticket){
        //Xu ly khoi tao thời gian
        Connection connection = JDBCConnection.getJDBCConnection();
        WatchController watchController = new WatchController();
        watchController.RunDateIn();
        String t = watchController.getTempDate();
        
        //check the thang
        //kiem tra ve thang có tồn tại ko
        try {
        MonthCardController monthCardController = new MonthCardController();
        monthCardController.selectedMonthCardCTL(ticket.getLicense_plate());
        
        if(ticket.getLicense_plate().equals(monthCardController.getMonthCard().getLicense_plate())){
            this.status = "true";
            checkMonth_Card=1;
        }
        } catch (Exception e) { 
        
        }
        //check sender
        //String sender_id;
        try{
        SenderController senderController = new SenderController();
        senderController.selectedSenderShortLicense_PlateCTL(ticket.getLicense_plate());
        if(ticket.getLicense_plate().equals(senderController.getSender().getLicense_Plate())){
             this.sender_id =String.valueOf( senderController.getSender().getId());
             checkSender = 1;
        }
        }catch(Exception e){
                
        }
        
        //
       
        //
         try {
            
            LocationController locationController = new LocationController();
            locationController.selectedLocationShortTypeCTL(ticket.getType());
            //Kiem tra xem co vi trí kiểu type trong bãi không
            //ok ==1 nếu tồn tại vị trí kiểu type và có chỗ trống để gửi
            if(locationController.getCount() == 0){
               this.checkType = 1;
            }
            
           //this.ok =  locationController.getOk();
        } catch (Exception e) {
        }
         
        try {
            
            LocationController locationController = new LocationController();
            locationController.selectedLocationShortTypeCTL(ticket.getType());
            //Kiem tra xem co vi trí kiểu type trong bãi không
            //ok ==1 nếu tồn tại vị trí kiểu type và có chỗ trống để gửi
            if(locationController.getCount() != 0){
                //ok==1 : Tồn tại vị trí trống đẻ gửi xe
                this.checkFull =  locationController.getOk();
                this.location.setId(locationController.getLocation().getId()); 
                this.location.setArea(locationController.getLocation().getArea());
            }
            
           //this.ok =  locationController.getOk();
        } catch (Exception e) {
        }
        //Cau truy van
          String sql="";
        if(checkSender==1&&checkMonth_Card==1){
            sql = "INSERT INTO `ticket`(`id`, `sender_id`, `type`, `area`, `license_plate`, `time_create`, `status_month_card`,`location_id`)  VALUE (NULL,'"+sender_id+"' ,?,'"+location.getArea()+"',?,'"+t+"','"+status+"','"+location.getId()+"')";
        }else if(checkSender == 1||checkMonth_Card ==1){
            if(checkSender == 1){
                
                sql = "INSERT INTO `ticket`(`id`, `sender_id`, `type`, `area`, `license_plate`, `time_create`, `status_month_card`,`location_id`)  VALUE (NULL,'"+sender_id+"' ,?,'"+location.getArea()+"',?,'"+t+"','false','"+location.getId()+"')";
              
            }else if(checkMonth_Card == 1){
                sql = "INSERT INTO `ticket`(`id`, `sender_id`, `type`, `area`, `license_plate`, `time_create`, `status_month_card`,`location_id`)  VALUE (NULL,NULL ,?,'"+location.getArea()+"',?,'"+t+"','"+status+"','"+location.getId()+"')";
            }
        }else{
            sql = "INSERT INTO `ticket`(`id`, `sender_id`, `type`, `area`, `license_plate`, `time_create`, `status_month_card`,`location_id`)  VALUE (NULL,NULL ,?,'"+location.getArea()+"',?,'"+t+"','false','"+location.getId()+"')";
        }
        //System.out.println(sql);
        try {
           // System.out.println(ok+"  "+kt);
            if(checkFull==1&&kt!=1){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ticket.getType() );
               
            preparedStatement.setString(2, ticket.getLicense_plate());
          //  preparedStatement.setInt(4, ticket.getLocation_id());
            int rs = preparedStatement.executeUpdate();
            rsAdd = rs;
            //System.out.println(rs);
//             if(ok!=1){
//                    //Bai Xe Dâ Đầy
//                    this.checkFull = 1;
//                }
//                if(kt==1){
//                    //Bai Xe khong có cho gui xe kieu nay
//                    this.checkType = 1;
//                }
            }
               //  System.out.println(ticket.getType());
              //  System.out.println("Không thành công");
               
            
            if(rsAdd!=0){
                LocationController locationController = new LocationController();
                locationController.updateLocationCTL(this.location.getId(), "true");
               // locationDao.updateLocationShortStatus(8, "true");
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    public void selectedTicketShort(String license_plate){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `ticket` WHERE license_plate = '"+license_plate+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int ids = rs.getInt("id");
                int sender_ids = rs.getInt("sender_id");
                String types = rs.getString("type");
                String areas = rs.getString("area");
                String license_plates = rs.getString("license_plate");
                String time_creates = rs.getString("time_create");
                String status_month_cards = rs.getString("status_month_card");
                int location_ids = rs.getInt("location_id");
                
                ticket.setId(ids);
                ticket.setSender_id(sender_ids);
                ticket.setType(types);
                ticket.setArea(areas);
                ticket.setLicense_plate(license_plates);
                ticket.setTime_create(time_creates);
                ticket.setStatus_month_card(status_month_cards);
                ticket.setLocation_id(location_ids);
                
                System.out.println(ids+" "+types+  " "+sender_ids +" "+areas+" "+time_creates);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void selectedTicketShortPhone(String phone){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `ticket` WHERE phone = '"+phone+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int ids = rs.getInt("id");
                int sender_ids = rs.getInt("sender_id");
                String types = rs.getString("type");
                String areas = rs.getString("area");
                String license_plates = rs.getString("license_plate");
                String time_creates = rs.getString("time_create");
                String status_month_cards = rs.getString("status_month_card");
                int location_ids = rs.getInt("location_id");
                
                ticket.setId(ids);
                ticket.setSender_id(sender_ids);
                ticket.setType(types);
                ticket.setArea(areas);
                ticket.setLicense_plate(license_plates);
                ticket.setTime_create(time_creates);
                ticket.setStatus_month_card(status_month_cards);
                ticket.setLocation_id(location_ids);
                
             //   System.out.println(ids+" "+types+  " "+sender_ids +" "+areas+" "+time_creates);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void selectedTicketShortId(int id){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `ticket` WHERE sender_id = '"+id+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int ids = rs.getInt("id");
                int sender_ids = rs.getInt("sender_id");
                String types = rs.getString("type");
                String areas = rs.getString("area");
                String license_plates = rs.getString("license_plate");
                String time_creates = rs.getString("time_create");
                String status_month_cards = rs.getString("status_month_card");
                int location_ids = rs.getInt("location_id");
                
                ticket.setId(ids);
                ticket.setSender_id(sender_ids);
                ticket.setType(types);
                ticket.setArea(areas);
                ticket.setLicense_plate(license_plates);
                ticket.setTime_create(time_creates);
                ticket.setStatus_month_card(status_month_cards);
                ticket.setLocation_id(location_ids);
                
             //   System.out.println(ids+" "+types+  " "+sender_ids +" "+areas+" "+time_creates);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void deleteTicket(String license_place) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM ticket where license_plate = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, license_place);
            int rs = preparedStatement.executeUpdate();
            rsDelete = rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getCheckFull() {
        return checkFull;
    }

    public void setCheckFull(int checkFull) {
        this.checkFull = checkFull;
    }

    public int getCheckType() {
        return checkType;
    }

    public void setCheckType(int checkType) {
        this.checkType = checkType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getRsAdd() {
        return rsAdd;
    }

    public void setRsAdd(int rsAdd) {
        this.rsAdd = rsAdd;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }
    
//    public static void main(String[] args) {
//        Ticket ticket = new Ticket("Xe Máy", "90B352440");
//        TicketDao ticketDao = new TicketDao();
//        ticketDao.selectedTicketShort("LLM");
//      //  System.out.println(ticketDao.rsAdd);
//       // System.out.println();
//    }
}
