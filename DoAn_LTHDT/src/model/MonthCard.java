/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class MonthCard {
    private int id;
    private String type;
    private String phone;
    private String date_initialization;
    private String license_plate;
    private String date_expiration;

    public MonthCard() {
        
    }

    public MonthCard(int id, String type, String phone, String date_initialization,String date_expiration, String license_plate) {
        this.id = id;
        this.type = type;
        this.phone = phone;
        this.date_initialization = date_initialization;
        this.license_plate = license_plate;
        this.date_expiration = date_expiration;
    }
    public MonthCard( String type, String phone, String license_plate) {
        this.id = id;
        this.type = type;
        this.phone = phone;
    
        this.license_plate = license_plate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate_initialization() {
        return date_initialization;
    }

    public void setDate_initialization(String date_initialization) {
        this.date_initialization = date_initialization;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(String date_expiration) {
        this.date_expiration = date_expiration;
    }

    
}
