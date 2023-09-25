/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.TicketDao;
import java.util.List;
import model.Ticket;

/**
 *
 * @author Admin
 */
public class TicketController {
    int rsAdd;
    int checkFull;
    int checkType;
    int rsDelete;
    Ticket ticket = new Ticket();
    TicketDao ticketDao;
    
    public TicketController(){
        ticketDao =new TicketDao();
    }
    
    //Tra về Bảng
    public List<Ticket> getAllTicket(){
        TicketDao ticketDao = new TicketDao();
       return ticketDao.getAllTicket();
    }
    public void addTicketCTL(Ticket ticket){
        TicketDao ticketDao = new TicketDao();
       ticketDao.addTicket(ticket);
       this.checkFull = ticketDao.getCheckFull();
       this.checkType = ticketDao.getCheckType();
       this.rsAdd = ticketDao.getRsAdd();
    }
    
    public void selectedTicketShortCTL(String license_plate){
        TicketDao ticketDao = new TicketDao();
        ticketDao.selectedTicketShort(license_plate);
        ticket = ticketDao.getTicket();
    }
    public void selectedTicketShortPhoneCTL(String phone){
        TicketDao ticketDao = new TicketDao();
        ticketDao.selectedTicketShortPhone(phone);
        ticket = ticketDao.getTicket();
    }
    public void selectedTicketShortIdCTL(int id){
        TicketDao ticketDao = new TicketDao();
        ticketDao.selectedTicketShortId(id);
        ticket = ticketDao.getTicket();
    }
    public void deleteTicketCTL(String license_plate){
        TicketDao ticketDao = new TicketDao();
        ticketDao.deleteTicket(license_plate);
        rsDelete = ticketDao.getRsDelete();
    }
    public int getRsAdd() {
        return rsAdd;
    }

    public void setRsAdd(int rsAdd) {
        this.rsAdd = rsAdd;
    }

    public int getCheckFull() {
        return checkFull;
    }

    public void setCheckFull(int checkFull) {
        this.checkFull = checkFull;
    }

    public int getCheckType() {
        return checkType;
    }

    public void setCheckType(int checkType) {
        this.checkType = checkType;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }
    
//    public static void main(String[] args) {
//        TicketController ticketController = new TicketController();
//        
//        Ticket ticket = new Ticket("Xe Máy", "90B352440");
//        ticketController.addTicketCTL(ticket);
//    }
}
