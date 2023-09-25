/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Staff extends Person {
    private String wage;
   // private  int admin_id;

    public Staff() {
    }

    public Staff(String wage, int id, String full_name, String gender, String age, String phone, String password, int admin_id) {
        super(id, full_name, gender, age, phone, password);
        this.wage = wage;
       
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }
}
