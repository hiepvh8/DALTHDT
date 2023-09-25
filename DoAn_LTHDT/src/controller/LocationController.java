/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.LocationDao;
import java.util.List;
import model.Location;

/**
 *
 * @author Admin
 */
public class LocationController {
    private int ok = 0;
    private int ctlAdd;
    private int count;
    private int rsDelete;
    
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
  //  private LocationDao locationDao;
    private Location location = new Location();

    public LocationController() {
       LocationDao locationDao = new LocationDao();
    }
    
    public List<Location> getAllLocation(){
       LocationDao locationDao = new LocationDao();
        return locationDao.getAllLocation();
    }
    public void selectedAllLocationCTL(){
        LocationDao locationDao = new LocationDao();
        locationDao.selectAllLocation();
      areaAXemay = locationDao.getAreaAXemay();
      areaBXemay = locationDao.getAreaBXemay();
      areaCXemay = locationDao.getAreaCXemay();
      areaDXemay = locationDao.getAreaDXemay();
      areaEXemay = locationDao.getAreaEXemay();
    
      areaAOto = locationDao.getAreaAOto();
      areaBOto = locationDao.getAreaBOto();
      areaCOto = locationDao.getAreaCOto();
      areaDOto = locationDao.getAreaDOto();
      areaEOto = locationDao.getAreaEOto();
        
    }
    public void selectedLocationShortTypeCTL(String type){
        LocationDao locationDao = new LocationDao();
        locationDao.selectedLocationShortType(type);
        location = locationDao.getLocation();
        
        this.count = locationDao.getCount();
        ok = locationDao.getOk();
    }
    public void updateLocationCTL(int id, String status){
        LocationDao locationDao = new LocationDao();
        locationDao.updateLocationShortStatus(id, status);
                
    }
    public void addLocationCTL(Location location){
       LocationDao locationDao = new LocationDao();
       locationDao.addLocation(location);
        ctlAdd = locationDao.getRsAdd();
    }
    
    public void selectedLocationCTL(int id){
        LocationDao locationDao = new LocationDao();
        locationDao.selectedLocation(id);
        
    }
    
    public void deleteLocationCTL(int id){
        LocationDao locationDao = new LocationDao();
        locationDao.deleteLocation(id);
        rsDelete = locationDao.getRsDelete();
    }
    public int getCtlAdd() {
        return ctlAdd;
    }

    public void setCtlAdd(int ctlAdd) {
        this.ctlAdd = ctlAdd;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public int getCount() {
        return count;
    }

    public void setCount(String type) {
        this.count = count;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
//     //   Location location = new Location(1,"A",true,"Xe Máy");
//        LocationController locationController = new LocationController();
//       locationController.selectedAllLocationCTL();
//        System.out.println(locationController.getAreaAOto());
//    }
//    
}
