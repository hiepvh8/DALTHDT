/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class StaffDao {
    private int rsAdd;
    private int rsDelete;
    private Staff staff = new Staff();
    
    public StaffDao(){
        
    }
    public List<Staff> getAllStaff(){
        List<Staff> staffs = new ArrayList<>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = " SELECT * FROM staff";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while( rs.next()){
                Staff staff = new Staff();
                
                staff.setId(rs.getInt("id"));
                staff.setFull_name(rs.getString("full_name"));
                staff.setGender(rs.getString("gender"));
                staff.setAge(rs.getString("age"));
                staff.setPhone(rs.getString("phone"));
                staff.setPassword(rs.getString("password"));
                staff.setWage(rs.getString("wage"));
              //  staff.setAdmin_id(rs.getInt("admin_id"));
                
                staffs.add(staff);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffs;
    }
    
    public void addStaff(Staff staff){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = " INSERT INTO staff(id,full_name, gender, age, phone, password, wage)"
                + "  VALUE (NULL,?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, staff.getFull_name());
            preparedStatement.setString(2, staff.getGender());
            preparedStatement.setString(3, staff.getAge());
            preparedStatement.setString(4, staff.getPhone());
            preparedStatement.setString(5, staff.getPassword());
            preparedStatement.setString(6, staff.getWage());
           
            
            int rs = preparedStatement.executeUpdate();
            rsAdd = rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void selectedStaff(String phoneNv){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `staff` WHERE phone = '"+phoneNv+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int ids = rs.getInt("id");
                String full_names = rs.getString("full_name");
                String genders = rs.getString("gender");
                String ages = rs.getString("age");
                String phones = rs.getString("phone");
                String passwords = rs.getString("password");
                String wages = rs.getString("wage");
                staff.setId(ids);
                staff.setFull_name(full_names);
                staff.setGender(genders);
                staff.setAge(ages);
                staff.setPhone(phones);
                staff.setPassword(passwords);
                staff.setWage(wages);
               // System.out.println(phones+"   "+passwords);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
     public void selectedStaffShort(String phoneNv){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `staff` WHERE phone = '"+phoneNv+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String phones = rs.getString("phone");
                String passwords = rs.getString("password");
                staff.setPhone(phones);
                staff.setPassword(passwords);
               // System.out.println(phones+"   "+passwords);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
     
      public void updateStaff(Staff staff){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = " INSERT INTO staff(id,full_name, gender, age, phone, password, wage, admin_id)"
                + "  VALUE (NULL,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, staff.getFull_name());
            preparedStatement.setString(2, staff.getGender());
            preparedStatement.setString(3, staff.getAge());
            preparedStatement.setString(4, staff.getPhone());
            preparedStatement.setString(5, staff.getPassword());
            preparedStatement.setString(6, staff.getWage());
          //  preparedStatement.setInt(7, staff.getAdmin_id());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteStaff(String phone) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM staff where phone = ?";
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

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }
    
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getRsAdd() {
        return rsAdd;
    }

    public void setRsAdd(int rsAdd) {
        this.rsAdd = rsAdd;
    }
    
}
