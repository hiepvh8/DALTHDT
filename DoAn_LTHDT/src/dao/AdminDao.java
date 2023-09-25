/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Admin
 */
public class AdminDao {
   // private ResultSet rsAdd;
    private Admin admin = new Admin();
    public AdminDao(){
        
    }
    public List<Admin> getAllAdmin(){
        List<Admin> admins = new ArrayList<Admin>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM admin";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Admin admin = new Admin();
                
                admin.setId(rs.getInt("id"));
                admin.setUser(rs.getString("user"));
                admin.setPassword(rs.getString("password"));
                
                admins.add(admin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admins;
    }
    
    public void addAdmin(Admin admin){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "INSERT INTO admin(id,user, password)  VALUE (NULL,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, admin.getUser());
            preparedStatement.setString(2, admin.getPassword());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateAdmin(String user, String password){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,password );
             preparedStatement.setString(2, user);
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteRecords(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM admin where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void selectedAdminShort(String user){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `admin` WHERE user = '"+user+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String users = rs.getString("user");
                String passwords = rs.getString("password");
                admin.setUser(users);
                admin.setPassword(passwords);
                System.out.println(users+"   "+passwords);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
}
