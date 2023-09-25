/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.WatchController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.MonthCard;


/**
 *
 * @author Admin
 */
public class MonthCardDao {
    private int rsSelected;
     private int rsAdd;
     private int count=0;
     private int rsDelete;
    MonthCard monthCard = new MonthCard();
    
    public MonthCardDao(){
        
    }
    public List<MonthCard> getAllMonthCard(){
        List<MonthCard> monthcards = new ArrayList<MonthCard>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM month_card";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                MonthCard monthcard = new MonthCard();
                
                monthcard.setId(rs.getInt("id"));
                monthcard.setType(rs.getString("type"));
                monthcard.setPhone(rs.getString("phone"));
                monthcard.setDate_initialization(rs.getString("date_initialization"));
                monthcard.setLicense_plate(rs.getString("license_plate"));
                monthcard.setDate_expiration(rs.getString("date_expiration"));
                monthcards.add(monthcard);
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(monthCard.getDate_initialization());
        return monthcards;
    }
    
    public void addMonthCard(MonthCard monthCard){
        Connection connection = JDBCConnection.getJDBCConnection();
        WatchController watchController = new WatchController();
        //String temp="";
        watchController.RunDateIn();
        String t = watchController.getTempDate();
        LocalDate localDate = LocalDate.now();
        
        String sql = "INSERT INTO `month_card` (`id`, `type`, `phone`, `date_initialization`, `license_plate`,`date_expiration`) VALUES(NULL,?,?,'"+t+"',?,'"+localDate.plusMonths(1)+ "')";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, monthCard.getType()); 
           // preparedStatement.setString(2, monthCard.getDate_nitialization());
            preparedStatement.setString(2, monthCard.getPhone());
            preparedStatement.setString(3, monthCard.getLicense_plate());
            
            
            int rs = preparedStatement.executeUpdate();
            rsAdd =rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void selectedMonthCardShort(String license_plate){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `month_card` WHERE license_plate = '"+license_plate+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
              //  System.out.println(rs);
                String license_plates = rs.getString("license_plate");
                String date_initializations = rs.getString("date_initialization");
                monthCard.setLicense_plate(license_plates);
                monthCard.setDate_initialization(date_initializations);
                System.out.println(license_plates);
              //  System.out.println(license_plates);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
     public void selectedMonthCardShortId(int id){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `month_card` WHERE id = '"+id+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
              //  System.out.println(rs);
                int ids = rs.getInt("id");
                String types = rs.getString("type");
                String phones = rs.getString("phone");
                String date_initializations = rs.getString("date_initialization");
                String license_plates = rs.getString("license_plate");
                String date_expirations = rs.getString("date_expiration");
                
                monthCard.setId(ids);
                monthCard.setType(types);
                monthCard.setPhone(phones);
                monthCard.setDate_initialization(date_initializations);
                monthCard.setLicense_plate(license_plates);
                monthCard.setDate_expiration(date_expirations);
              
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
      //  MonthCard monthCard = new MonthCard("oto","0914", "bt65437");
        MonthCardDao monthCarDao= new MonthCardDao();
       // monthCarDao.selectedMonthCardShort("90B352440");
        
        monthCarDao.getAllMonthCard();
        System.out.println(monthCarDao.getCount());
      //  System.out.println(monthCarDao.getMonthCard().getDate_initialization());
    }
    
    public void deleteMonthCard(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM month_card where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            rsDelete = rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getRsAdd() {
        return rsAdd;
    }

    public void setRsAdd(int rsAdd) {
        this.rsAdd = rsAdd;
    }

    public MonthCard getMonthCard() {
        return monthCard;
    }

    public void setMonthCard(MonthCard monthCard) {
        this.monthCard = monthCard;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }
    
    
    
}
