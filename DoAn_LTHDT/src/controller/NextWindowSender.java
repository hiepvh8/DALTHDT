/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.SenderDao;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import model.Sender;
import view.CapNhatThongTinJPanel;
import view.DangKyTheThangJPanel;
import view.DoiMatKhauJPanel;
import view.NapTienJPanel;
import view.ThongTinVeXeJPanel;
import view.TraCuuXeJPanel;

/**
 *
 * @author Admin
 */
public class NextWindowSender {
   private JPanel root;
    
    private List<String> listItem = null;
    
    public NextWindowSender(JPanel jPanelRoot){
        this.root = jPanelRoot;
    }
    
    public void setView(){
        root.setLayout(new BorderLayout());
        root.add(new DangKyTheThangJPanel());
        root.validate();
        root.repaint();
        
    }
    
    public void setEvent(String x,String Data){
        //this.listItem = listItem;
        JPanel node;
       // for(String item : listItem){
         switch(x){
               case "DangKyTheThang":
                   node = new DangKyTheThangJPanel();
                   break;
                case "NapTien":
                   node = new NapTienJPanel();
                   break;
                case "ThongTinVeXe":
                   ThongTinVeXeJPanel thongTinVeXeJPanel = new ThongTinVeXeJPanel(Data);
                  // thongTinVeXeJPanel.setData(Data);
                   node = thongTinVeXeJPanel;
                   break;
                case "QuanLyTheThang":
                   node = new TraCuuXeJPanel();
                   break;
                case "CapNhatThongTin":
                  node = new CapNhatThongTinJPanel();
                   break;
                   
                case "DoiMatKhau":
                   node = new DoiMatKhauJPanel();
                   break;
                
                default:
                    node = new DangKyTheThangJPanel();
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
        
        }
}
