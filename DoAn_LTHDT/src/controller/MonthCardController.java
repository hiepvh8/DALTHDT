/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.MonthCardDao;
import java.util.List;
import model.MonthCard;

/**
 *
 * @author Admin
 */
public class MonthCardController {
    private MonthCardDao monthCardDao;
    private int ctlAdd;
    private int count;
    private int rsDelete;
    MonthCard monthCard = new MonthCard();
    
    public MonthCardController(){
        monthCardDao = new MonthCardDao();
    }
    
    public List<MonthCard> getAllMonthCardCTL(){
        monthCardDao = new MonthCardDao();
        monthCardDao.getAllMonthCard();
        count = monthCardDao.getCount();
        return monthCardDao.getAllMonthCard();  
    }
    public void deleteMonthCardCTL(int id){
        MonthCardDao monthCardDao = new MonthCardDao();
        monthCardDao.deleteMonthCard(id);
        rsDelete = monthCardDao.getRsDelete();
    }
    public void selectedMonthCardShortId(int id){
        MonthCardDao monthCardDao = new MonthCardDao();
        monthCardDao.selectedMonthCardShortId(id);
        monthCard = monthCardDao.getMonthCard();
    }
    public void addMonthCardCTL(MonthCard monthCard){
        monthCardDao.addMonthCard(monthCard);
       ctlAdd = monthCardDao.getRsAdd();
    }
    
     public void selectedMonthCardCTL(String license_plate){
        MonthCardDao monthCardDao = new MonthCardDao();
        monthCardDao.selectedMonthCardShort(license_plate);
        monthCard.setLicense_plate(monthCardDao.getMonthCard().getLicense_plate());
    }
     
    public int getCtlAdd() {
        return ctlAdd;
    }

    public void setCtlAdd(int ctlAdd) {
        this.ctlAdd = ctlAdd;
    }

    public MonthCard getMonthCard() {
        return monthCard;
    }

    public void setMonthCard(MonthCard monthCard) {
        this.monthCard = monthCard;
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
    
//    public static void main(String[] args) {
//        MonthCard monthCard = new MonthCard("Xe Máy","023u8","2308kkfsdf");
//        MonthCardController monthCardController = new MonthCardController();
//        monthCardController.selectedMonthCardCTL("90B352440");
//        System.out.println(monthCardController.getMonthCard().getLicense_plate());
//       // monthCardController.selectedMonthCardCTL("b52234");
//       
//    }
   
}
