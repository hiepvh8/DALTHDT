/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.KhacPhucSuCoJPanel;
import view.QuanLyBaiXeJPanel;
import view.QuanLyNguoiGuiJPanel;
import view.QuanLyNhanVienJPanel;
import view.QuanLyTheThangJPanel;
import view.ThietLapJPanel;
import view.ThongKeJPanel;

/**
 *
 * @author Admin
 */
public class NextWindowAdmin {
    private JPanel root;
    
    private List<String> listItem = null;
    
    public NextWindowAdmin(JPanel jPanelRoot){
        this.root = jPanelRoot;
    }
    
    public void setView(){
      //  kinSelected = "thong ke";
      //  root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new QuanLyNhanVienJPanel());
        root.validate();
        root.repaint();
        
    }
    
    public void setEvent(String x){
        //this.listItem = listItem;
        JPanel node;
       // for(String item : listItem){
         switch(x){
               case "QuanLyNhanVien":
                   node = new QuanLyNhanVienJPanel();
                   break;
                case "QuanLyBaiXe":
                   node = new QuanLyBaiXeJPanel();
                   break;
                case "QuanLyNguoiGui":
                   node = new QuanLyNguoiGuiJPanel();
                   break;
                case "QuanLyTheThang":
                   node = new QuanLyTheThangJPanel();
                   break;
                case "ThongKe":
                   node = new ThongKeJPanel();
                   break;
                case "KhacPhucSuCo":
                   node = new KhacPhucSuCoJPanel();
                   break;
                case "ThietLap":
                   node = new ThietLapJPanel();
                   break;
                default:
                    node = new QuanLyNhanVienJPanel();
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
         // item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb());
        }
    }
    
  
