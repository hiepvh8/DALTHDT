/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Sender;


/**
 *
 * @author Admin
 */
public class SenderDao {
    private int rsAdd;
    private int rsAddShort;
    private int rsDelete;
    private int rsUpdate;
    private int rsUpdateThongTin;
    private Sender sender = new Sender();
    public SenderDao(){
        
    }
    
    public List<Sender> getAllSender(){
        List<Sender> senders = new ArrayList<Sender>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM sender";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Sender sender = new Sender();
                
                sender.setId(rs.getInt("id"));
                sender.setFull_name(rs.getString("full_name"));
                sender.setGender(rs.getString("gender"));
                sender.setAge(rs.getString("age"));
                sender.setPhone(rs.getString("phone"));
                sender.setPassword(rs.getString("password"));
                sender.setLicense_Plate(rs.getString("license_plate"));
                senders.add(sender);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return senders;
    }
    
    public void addSender(Sender sender){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "INSERT INTO admin(`id`, `full_name`, `gender`, `age`,"
                + " `phone`, `password`, `license_plate`, `month_card_id`)  VALUE (NULL,?,?,?,?,?,?)" ;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }      
    }
    
    public void addSenderShort(String phone, String password){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "INSERT INTO `sender` (`id`, `full_name`, `gender`, `age`, `phone`, `password`, `license_plate`) VALUES (NULL, NULL, NULL, NULL,?,?, NULL)" ;
       
            
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,phone );
            preparedStatement.setString(2,password);
            
            rsAddShort = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }      
    }
    
    public void selectedSenderShortPhone(String phone){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM sender WHERE phone = '"+phone+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int ids = rs.getInt("id");
                String full_names = rs.getString("full_name");
                String genders = rs.getString("gender");
                String ages = rs.getString("age");
                String phones = rs.getString("phone");
                String passwords = rs.getString("password");
                String license_plates = rs.getString("license_plate");
                sender.setId(ids);
                sender.setFull_name(full_names);
                sender.setGender(genders);
                sender.setAge(ages);
                sender.setPhone(phones);
                sender.setPassword(passwords);
                sender.setLicense_Plate(license_plates);
             //   System.out.println(phones+"   "+passwords);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void selectedSenderShortLicense_Plate(String license_plate){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM sender WHERE license_plate = '"+license_plate+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String license_plates = rs.getString("license_plate");
                int ids = rs.getInt("id");
                sender.setLicense_Plate(license_plates);
                sender.setId(ids);
              //  System.out.println(sender.getLicense_Plate()+"  "+sender.getId());
                
                
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void deleteSender(String phone) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM sender where phone = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, phone);
            int rs = preparedStatement.executeUpdate();
            rsDelete = rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateSender(String phone, String password){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "UPDATE sender SET password = ? where phone = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,password );
            preparedStatement.setString(2, phone);
            
            int rs = preparedStatement.executeUpdate();
            rsUpdate = rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateSenderThongTin(String phone, String full_name,String gender, String age, String license_plate){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "UPDATE sender SET full_name = ?, gender = ?, age = ?, license_plate = ? where phone = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,full_name );
            preparedStatement.setString(2, gender);
            preparedStatement.setString(3, age);
            preparedStatement.setString(4, license_plate);
            preparedStatement.setString(5, phone);
            
            int rs = preparedStatement.executeUpdate();
            rsUpdateThongTin = rs;
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

    public int getRsAddShort() {
        return rsAddShort;
    }

    public void setRsAddShort(int rsAddShort) {
        this.rsAddShort = rsAddShort;
    }
   
    

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }

    public int getRsUpdate() {
        return rsUpdate;
    }

    public void setRsUpdate(int rsUpdate) {
        this.rsUpdate = rsUpdate;
    }

    public int getRsUpdateThongTin() {
        return rsUpdateThongTin;
    }

    public void setRsUpdateThongTin(int rsUpdateThongTin) {
        this.rsUpdateThongTin = rsUpdateThongTin;
    }
        
//    public static void main(String[] args) {
//      SenderDao senderDao = new SenderDao();
//      //senderDao.selectedSenderShortPhone("222");
//      senderDao.selectedSenderShortPhone("0921245828");
//        System.out.println(senderDao.getSender().getId());
//       // System.out.println(senderDao.getSender().getLicense_Plate());
//       // System.out.println(senderDao.sender.getId());
//    }
    
}
