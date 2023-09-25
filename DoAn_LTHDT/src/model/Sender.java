/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Sender extends Person {
    private String License_Plate;

    public Sender() {
    }

    public Sender(String License_Plate, int id, String full_name, String gender, String age, String phone, String password) {
        super(id, full_name, gender, age, phone, password);
        this.License_Plate = License_Plate;
    }

    public String getLicense_Plate() {
        return License_Plate;
    }

    public void setLicense_Plate(String License_Plate) {
        this.License_Plate = License_Plate;
    }
  
    

}
