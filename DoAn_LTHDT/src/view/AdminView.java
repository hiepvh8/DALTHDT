/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.NextWindowAdmin;
import java.util.ArrayList;
import java.util.List;
import view.DangNhap;


/**
 *
 * @author Admin
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form AdminView
     */
    public AdminView() {
        initComponents();
      //  setTitle("Chao mung Admin");
        
        //NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        
        //nextWindowController.setView();
      //  nextWindowController.setEvent("hello");
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtQuanLyNhanVien = new javax.swing.JButton();
        jbtQuanLyBaiXe = new javax.swing.JButton();
        jbtQuanLyNguoiGui = new javax.swing.JButton();
        jbtQuanLyTheThang = new javax.swing.JButton();
        jbtThongKe = new javax.swing.JButton();
        jbtKhacPhucSuCo = new javax.swing.JButton();
        jbtThietLap = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jpnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setText("Chào Mừng Admin");

        jbtQuanLyNhanVien.setBackground(new java.awt.Color(255, 255, 0));
        jbtQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtQuanLyNhanVien.setText("Quản Lý nhân Viên");
        jbtQuanLyNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuanLyNhanVienActionPerformed(evt);
            }
        });

        jbtQuanLyBaiXe.setBackground(new java.awt.Color(255, 255, 0));
        jbtQuanLyBaiXe.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtQuanLyBaiXe.setText("Quản Lý Bãi Xe");
        jbtQuanLyBaiXe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtQuanLyBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuanLyBaiXeActionPerformed(evt);
            }
        });

        jbtQuanLyNguoiGui.setBackground(new java.awt.Color(255, 255, 0));
        jbtQuanLyNguoiGui.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtQuanLyNguoiGui.setText("Quản Lý Người Gửi");
        jbtQuanLyNguoiGui.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtQuanLyNguoiGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuanLyNguoiGuiActionPerformed(evt);
            }
        });

        jbtQuanLyTheThang.setBackground(new java.awt.Color(255, 255, 0));
        jbtQuanLyTheThang.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtQuanLyTheThang.setText("Quản Lý  Thẻ Tháng");
        jbtQuanLyTheThang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtQuanLyTheThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuanLyTheThangActionPerformed(evt);
            }
        });

        jbtThongKe.setBackground(new java.awt.Color(255, 255, 0));
        jbtThongKe.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtThongKe.setText("Thống Kê");
        jbtThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThongKeActionPerformed(evt);
            }
        });

        jbtKhacPhucSuCo.setBackground(new java.awt.Color(255, 255, 0));
        jbtKhacPhucSuCo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtKhacPhucSuCo.setText("Khắc Phục Sự Cố");
        jbtKhacPhucSuCo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtKhacPhucSuCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtKhacPhucSuCoActionPerformed(evt);
            }
        });

        jbtThietLap.setBackground(new java.awt.Color(255, 255, 0));
        jbtThietLap.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jbtThietLap.setText("Thiết lập");
        jbtThietLap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbtThietLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThietLapActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/font/Close-Window-icon.png"))); // NOI18N
        jButton1.setText("Thoát");
        jButton1.setMargin(new java.awt.Insets(2, 0, 3, -12));
        jButton1.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtQuanLyNguoiGui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtQuanLyBaiXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtQuanLyTheThang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtKhacPhucSuCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtThietLap, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtQuanLyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtQuanLyBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtQuanLyNguoiGui, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtQuanLyTheThang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtKhacPhucSuCo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtThietLap, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThongKeActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("ThongKe");
    }//GEN-LAST:event_jbtThongKeActionPerformed

    private void jbtKhacPhucSuCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtKhacPhucSuCoActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("KhacPhucSuCo");
    }//GEN-LAST:event_jbtKhacPhucSuCoActionPerformed

    private void jbtQuanLyNguoiGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuanLyNguoiGuiActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("QuanLyNguoiGui");
    }//GEN-LAST:event_jbtQuanLyNguoiGuiActionPerformed

    private void jbtQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("QuanLyNhanVien");
    }//GEN-LAST:event_jbtQuanLyNhanVienActionPerformed

    private void jbtQuanLyBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuanLyBaiXeActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("QuanLyBaiXe");
    }//GEN-LAST:event_jbtQuanLyBaiXeActionPerformed

    private void jbtThietLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThietLapActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("ThietLap");
    }//GEN-LAST:event_jbtThietLapActionPerformed

    private void jbtQuanLyTheThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuanLyTheThangActionPerformed
        // TODO add your handling code here:
        NextWindowAdmin nextWindowController= new NextWindowAdmin(jpnView);
        nextWindowController.setEvent("QuanLyTheThang");
    }//GEN-LAST:event_jbtQuanLyTheThangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DangNhap dangNhap = new DangNhap();
        dangNhap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtKhacPhucSuCo;
    private javax.swing.JButton jbtQuanLyBaiXe;
    private javax.swing.JButton jbtQuanLyNguoiGui;
    private javax.swing.JButton jbtQuanLyNhanVien;
    private javax.swing.JButton jbtQuanLyTheThang;
    private javax.swing.JButton jbtThietLap;
    private javax.swing.JButton jbtThongKe;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
