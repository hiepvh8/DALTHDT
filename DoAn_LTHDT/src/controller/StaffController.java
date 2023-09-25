/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.StaffDao;
import java.util.List;
import model.Staff;

/**
 *
 * @author Admin
 */
public class StaffController {
    private int ctlAdd;
    private int rsDelete;
    private  StaffDao staffDao;
    private Staff staff = new Staff();
    public StaffController(){
        staffDao = new StaffDao();
    }
    
     public List<Staff> getAllStaff(){
         StaffDao staffDao = new StaffDao();
         return staffDao.getAllStaff();
     }
    
     public void selectedStaffCTL(String phone){
         StaffDao staffDao = new StaffDao();
         staffDao.selectedStaff(phone);
         staff = staffDao.getStaff();
     }
    public void selectedStaffShortCTL(String phone){
      staffDao.selectedStaffShort(phone);
      staff = staffDao.getStaff();
    }
    public void addStaffCTL(Staff staff){
        staffDao.addStaff(staff);
       ctlAdd =  staffDao.getRsAdd();
    }
    
    public void deleteStaffCTL(String phone){
        StaffDao staffDao = new StaffDao();
        this.staffDao.deleteStaff(phone);
        rsDelete = this.staffDao.getRsDelete();
    }
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getCtlAdd() {
        return ctlAdd;
    }

    public void setCtlAdd(int ctlAdd) {
        this.ctlAdd = ctlAdd;
    }

    public int getRsDelete() {
        return rsDelete;
    }

    public void setRsDelete(int rsDelete) {
        this.rsDelete = rsDelete;
    }
    
    
//    public static void main(String[] args) {
//        String phone ="1980";
//        StaffController staffController = new StaffController();
//       // Staff staff = new Staff("123", 32, "hiephhg", "nam", "12", "jh3gfmm", "gh", 87);
//      // staffController.addStaffCTL(staff);
//      staffController.deleteStaffCTL(phone);
//        System.out.println(staffController.getRsDelete());
//       // System.out.println(staffController.getCtlAdd()); 
//    }
}
