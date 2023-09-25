/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;



/**
 *
 * @author Admin
 */
public class WatchDao extends Thread{
    private JTextField jTextField;
    String tempDate;
    String tempTime;

    public WatchDao(JTextField jTextField) {
        this.jTextField = jTextField;
    }
    public WatchDao(){
       
    }
    public WatchDao(String tempTime){
        this.tempTime = tempTime;
    }
    
     
    @Override
    public void run(){
        SimpleDateFormat sdf =new SimpleDateFormat("hh:mm:ss");
        
        while(true){
            Date now = new Date();
            
            String st = sdf.format(now);
            tempTime = st;
            jTextField.setText(st);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }
        }
    }
    
  
    
    public void runDate(){
        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.get(Calendar.DAY_OF_MONTH);
        
        Date t = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String st = sdf.format(t);
       jTextField.setText(st);
    }
    public void runDateIn(){
        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.get(Calendar.DAY_OF_MONTH);
        
        Date t = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String st = sdf.format(t);
        tempDate=st;
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
    
    
}
