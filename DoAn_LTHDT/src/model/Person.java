/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Person {
    private int id;
    private String full_name;
    private String gender;
    private String age;
    private String phone;
    private String password;
    private static int sId = 100000;

    public Person() {
    }

    public Person(int id, String full_name, String gender, String age, String phone, String password) {
        this.id = id;
        this.full_name = full_name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        Person.sId = sId;
    }

   
}
