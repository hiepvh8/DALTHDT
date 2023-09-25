/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Ticket {
    private int id;
    private int sender_id;
    private String type;
    private String area;
    private String license_plate;
    private String time_create;
    private String pay;
    private String status_month_card;
    private int location_id;
    
    
   

    public Ticket() {
    }

    public Ticket(int id, int sender_id, String type, String area, String license_plate, String time_create, String pay, String status_month_card, int location_id) {
        this.id = id;
        this.sender_id = sender_id;
        this.type = type;
        this.area = area;
        this.license_plate = license_plate;
        this.time_create = time_create;
        this.status_month_card = status_month_card;
        this.location_id = location_id;
    }

    

    public Ticket(String type, String area, String license_plate) {
        this.type = type;
        this.area = area;
        this.license_plate = license_plate;
    }

    public Ticket(String type, String license_plate) {
        this.type = type;
        this.license_plate = license_plate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getTime_create() {
        return time_create;
    }

    public void setTime_create(String time_create) {
        this.time_create = time_create;
    }

    public String getStatus_month_card() {
        return status_month_card;
    }

    public void setStatus_month_card(String status_month_card) {
        this.status_month_card = status_month_card;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
    
   
    
}
