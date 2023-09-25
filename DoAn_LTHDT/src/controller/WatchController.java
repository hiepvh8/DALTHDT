/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.WatchDao;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class WatchController {
    private String tempDate;
    private  String tempTime;
    public WatchController(){
        
    }
   
    public void Run(JTextField jTextField){
        WatchDao watchDao = new WatchDao(jTextField);
        
        watchDao.start();
    }
    public void RunDate(JTextField jTextField){
        WatchDao watchDao = new WatchDao(jTextField);
        
        watchDao.runDate();
    }
    public void RunDateIn(){
        WatchDao watchDao = new WatchDao();
        watchDao.runDateIn();
       tempDate = watchDao.getTempDate();
    }
    public void RunIn(String temp){
        WatchDao watchDao = new WatchDao(tempTime);
        watchDao.start();
       tempTime = watchDao.getTempTime();
    }

    public String getTempDate() {
        return tempDate;
    }

    public void setTempDate(String temp) {
        this.tempDate = temp;
    }

    public String getTempTime() {
        return tempTime;
    }

    public void setTempTime(String tempTime) {
        this.tempTime = tempTime;
    }
    
//    public static void main(String[] args) {
//        WatchController watchController = new WatchController();
//        String temp="";
//        watchController.RunDateIn();
//        System.out.println(watchController.getTempDate());
//    }
}
