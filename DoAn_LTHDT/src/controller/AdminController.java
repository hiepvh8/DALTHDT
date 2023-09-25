/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AdminDao;
import java.util.List;
import model.Admin;

/**
 *
 * @author Admin
 */
public class AdminController {
    private AdminDao adminDao;
    Admin admin = new Admin();
    
    public AdminController() {
        adminDao = new AdminDao();
    }
   
    public List<Admin> getAllAdmin(){
        return getAllAdmin();
    }
    
    public void addAdmin(Admin admin){
        adminDao.addAdmin(admin);
    }
    
    public void selectedAdminShortCTL(String user){
      adminDao.selectedAdminShort(user);
      admin = adminDao.getAdmin();
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
//    public static void main(String[] args) {
//        AdminController adminController = new AdminController();
//        adminController.selectedAdminShortCTL("hiep");
//    }
}
