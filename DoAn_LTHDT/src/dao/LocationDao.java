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
import model.Location;


/**
 *
 * @author Admin
 */
public class LocationDao {
    private String type;
    private int rsDelete;
    private int ok=0;  //==1 tồn tại vị trí trống
    private int count=0;
    private int rsAdd;
    private int rsSelectedShort;
    private Location location = new Location();
    
    private int areaAXemay=0;
    private int areaBXemay=0;
    private int areaCXemay=0;
    private int areaDXemay=0;
    private int areaEXemay=0;
    
    private int areaAOto =0;
    private int areaBOto =0;
    private int areaCOto =0;
    private int areaDOto =0;
    private int areaEOto =0;

    public LocationDao(){
        
    }
    public List<Location> getAllLocation(){
        List<Location> locations = new ArrayList<Location>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM location";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Location location = new Location();
                
                location.setId(rs.getInt("id"));
                location.setArea(rs.getString("area"));
                location.setStatus(rs.getString("status"));
                location.setType(rs.getString("type"));
                
                locations.add(location);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return locations;
    }
    public void selectAllLocation(){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM location";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Location location = new Location();
                location.setId(rs.getInt("id"));
                location.setArea(rs.getString("area"));
                location.setStatus(rs.getString("status"));
                location.setType(rs.getString("type"));
                if(location.getType().equals("Xe Máy")&&location.getStatus().equals("true")){
                    String areaXemay = location.getArea();
                   // System.out.println(areaXemay);
                    switch(areaXemay){
                        case "A":
                            areaAXemay ++;
                            break;
                        case "B":
                            areaBXemay ++;
                            break;
                        case "C":
                            areaCXemay ++;
                            break;
                        case "D":
                            areaDXemay ++;
                            break;
                        case "E":
                            areaEXemay ++;
                            break;
                    }
                }else if(location.getType().equals("Ô Tô")&&location.getStatus().equals("true")){
                    String areaOto = location.getArea();
                    switch(areaOto){
                        case "A":
                            areaAOto ++;
                            break;
                        case "B":
                            areaBOto ++;
                            break;
                        case "C":
                            areaCOto ++;
                            break;
                        case "D":
                            areaDOto ++;
                            break;
                        case "E":
                            areaEOto ++;
                            break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    public void addLocation(Location location){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "INSERT INTO location(id, area, status, type )  VALUE (NULL,?,'false',?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, location.getArea());
            preparedStatement.setString(2, location.getType());
            
            int rs = preparedStatement.executeUpdate();
            rsAdd = rs;
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void selectedLocationShortType(String type){
        Connection connection = JDBCConnection.getJDBCConnection();
        List<Location> listLocations = new ArrayList<Location>();
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM location WHERE type = '"+type+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String types = rs.getString("type");
                String statuss = rs.getString("status");
                String areas = rs.getString("area");
                int ids = rs.getInt("id");
               // String passwords = rs.getString("password");
               if(types.equals(type)){
                   count++;
               }
               if(statuss.equals("false")){
                   ok=1;
                   location.setId(ids);
                   location.setArea(areas);
                   break;
               }
            //location.setStatus(statuss);
              //  sender.setPassword(passwords);
              //  System.out.println(phones+"   "+passwords);
            }
            
          //  System.out.println(rs);
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void updateLocationShortStatus(int id, String status){
        
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE location SET status = ? where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setInt(2, id);
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void selectedLocation(int id){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        try {
            Statement statement = connection.createStatement();   
            String sql = "SELECT * FROM `location` WHERE id = '"+id+"'" ;   
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int ids = rs.getInt("id");
                String areas = rs.getString("area");
                String statuss = rs.getString("status");
                String types = rs.getString("type");
                
                location.setId(ids);
                location.setArea(areas);
                location.setStatus(statuss);
                location.setType(types);
               
               // System.out.println(phones+"   "+passwords);
            }
          //  System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteLocation(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM location where id = ?";
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public int getRsSelectedShort() {
        return rsSelectedShort;
    }

    public void setRsSelectedShort(int rsSelectedShort) {
        this.rsSelectedShort = rsSelectedShort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getAreaAXemay() {
        return areaAXemay;
    }

    public void setAreaAXemay(int areaAXemay) {
        this.areaAXemay = areaAXemay;
    }

    public int getAreaBXemay() {
        return areaBXemay;
    }

    public void setAreaBXemay(int areaBXemay) {
        this.areaBXemay = areaBXemay;
    }

    public int getAreaCXemay() {
        return areaCXemay;
    }

    public void setAreaCXemay(int areaCXemay) {
        this.areaCXemay = areaCXemay;
    }

    public int getAreaDXemay() {
        return areaDXemay;
    }

    public void setAreaDXemay(int areaDXemay) {
        this.areaDXemay = areaDXemay;
    }

    public int getAreaEXemay() {
        return areaEXemay;
    }

    public void setAreaEXemay(int areaEXemay) {
        this.areaEXemay = areaEXemay;
    }

    public int getAreaAOto() {
        return areaAOto;
    }

    public void setAreaAOto(int areaAOto) {
        this.areaAOto = areaAOto;
    }

    public int getAreaBOto() {
        return areaBOto;
    }

    public void setAreaBOto(int areaBOto) {
        this.areaBOto = areaBOto;
    }

    public int getAreaCOto() {
        return areaCOto;
    }

    public void setAreaCOto(int areaCOto) {
        this.areaCOto = areaCOto;
    }

    public int getAreaDOto() {
        return areaDOto;
    }

    public void setAreaDOto(int areaDOto) {
        this.areaDOto = areaDOto;
    }

    public int getAreaEOto() {
        return areaEOto;
    }

    public void setAreaEOto(int areaEOto) {
        this.areaEOto = areaEOto;
    }
    
//    public static void main(String[] args) {
//        LocationDao locationDao = new LocationDao();
//        //locationDao.selectedLocationShortType("Xe Máy");
//       // System.out.println( locationDao.getLocation().getId());
//       locationDao.selectAllLocation();
//        System.out.println(locationDao.getAreaAOto());
//    }
    
}
