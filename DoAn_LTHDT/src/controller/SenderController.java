/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.SenderDao;
import java.util.List;
import model.Sender;

/**
 *
 * @author Admin
 */
public class SenderController {
    private int ctlAddShort;
    private int ctlAdd;
    private int rsDelete;
    private int rsUpdate;
    private int rsUpdateThongTin;
    private SenderDao senderDao;
    Sender sender = new Sender();

    public SenderController() {
        senderDao = new SenderDao();
    }
    
    public List<Sender> getAllSenderCTL(){
        SenderDao senderDao = new SenderDao();
        return senderDao.getAllSender();
    }
    public void addSenderCTL(Sender sender){
        senderDao.addSender(sender);
    }
    
    public void addSenderShortCTL(String phone, String password){
        senderDao.addSenderShort(phone,password);
        ctlAddShort = senderDao.getRsAddShort();
    }
    public void selectedSenderShortPhoneCTL(String phone){
        
      senderDao.selectedSenderShortPhone(phone);
      sender = senderDao.getSender();
     
    }
    public void selectedSenderShortLicense_PlateCTL(String license_plate){
        
      senderDao.selectedSenderShortLicense_Plate(license_plate);
      sender = senderDao.getSender();
     
    }
    
    public void deleteSenderCTL(String phone){
        SenderDao senderDao = new SenderDao();
        senderDao.deleteSender(phone);
        rsDelete = senderDao.getRsDelete();
    }
    public int getCtlAddShort() {
        return ctlAddShort;
    }

    public void setCtlAddShort(int ctlAddShort) {
        this.ctlAddShort = ctlAddShort;
    }
    public void updateSenderCTL(String phone, String password){
        SenderDao senderDao = new SenderDao();
        senderDao.updateSender(phone, password);
        rsUpdate = senderDao.getRsUpdate();
    }
    public void updateSenderThongTinCTL(String phone, String full_name,String gender, String age, String license_plate){
        SenderDao senderDao =new SenderDao();
        senderDao.updateSenderThongTin(phone, full_name, gender, age, license_plate);
        rsUpdateThongTin = senderDao.getRsUpdateThongTin();
    }
    public int getCtlAdd() {
        return ctlAdd;
    }

    public void setCtlAdd(int ctlAdd) {
        this.ctlAdd = ctlAdd;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }

    public int getRsUpdate() {
        return rsUpdate;
    }

    public void setRsUpdate(int rsUpdate) {
        this.rsUpdate = rsUpdate;
    }

    public int getRsUpdateThongTin() {
        return rsUpdateThongTin;
    }

    public void setRsUpdateThongTin(int rsUpdateThongTin) {
        this.rsUpdateThongTin = rsUpdateThongTin;
    }
    
//    public static void main(String[] args) {
//        SenderController senderController = new SenderController();
//        senderController.selectedSenderShortPhoneCTL("0921245828");
//        System.out.println(senderController.getSender().getId());
//       // System.out.println(senderController.getSender().getId());
//    }
}
