/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.plaf.RootPaneUI;
import view.DangKyTheThangJPanel;
import view.NhanXeJPanel;
import view.TraCuuBaiXeJPanel;
import view.TraXeJPanel;

/**
 *
 * @author Admin
 */
public class NextWindowStaff {
    private JPanel root;
    
    private List<String> listItem = null;
    
    public NextWindowStaff(JPanel jPanelRoot){
        this.root = jPanelRoot;
    }
    
    public void setView(){
        root.setLayout(new BorderLayout());
        root.add(new NhanXeJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEven(String x){
        JPanel node;
        
        switch (x) {
            case "NhanXe":
                node = new NhanXeJPanel();
                break;
            case "TraXe":
                node = new TraXeJPanel();
                break;
            case "TraCuuBaiXe":
                node = new TraCuuBaiXeJPanel();
                break;
            case "DangKyTheThang":
                node = new DangKyTheThangJPanel();
                break;
            default:
                node = new NhanXeJPanel();
                break;
        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
    }
    
}
