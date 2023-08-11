/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuxuan.quanlyquancafe.from_main;

import Dialogchek.KIEMTRANGUOIDUNGHELPER;
import Dialogchek.MessageHerr;
import Dialogchek.sheardatta;
import com.phuxuan.quanlycoffee.dao.Lichsudangnhapdao;
import com.phuxuan.quanlycoffee.dao.Nhanviendao;
import com.phuxuan.quanlycoffee.model.Lichsudangnhapmodel;
import com.phuxuan.quanlycoffee.model.Nhanvienmodel;
import com.phuxuan.quanlyquancafe.connectJDBC.Databaseee;
import com.phuxuan.quanlyquancafe.from_main.Dangnhap;
import com.phuxuan.quanlyquancafe.from_main.Quanlybanhang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ME1
 */
public class Dangnhapp extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Dangnhapp() {
        initComponents();
        
    }

    private void showdate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String dat = s.format(d);
        lbtDate.setText(dat);

    }

    private void lulsdangnhap() throws ClassNotFoundException {
        try {
            /// cập nhật trạng thái hoá đơn
            String sql = "select * from NHAN_VIEN where tendangnhap =N'" + txttendangnhap.getText() + "'";
            Connection conn = Databaseee.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Lichsudangnhapmodel h = new Lichsudangnhapmodel();
                h.setManv(rs.getString("manv"));
                h.setNgaydangnhap(java.sql.Date.valueOf(lbtDate.getText()));
                Lichsudangnhapdao dao = new Lichsudangnhapdao();
                dao.insert(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dangnhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lbtDate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttendangnhap = new javax.swing.JTextField();
        txtmk = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lbtDate.setText("jLabel6");
        jFrame1.getContentPane().add(lbtDate, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(171, 104, 50));
        jLabel1.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 22, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(171, 104, 50));
        jLabel2.setText("Tên đăng nhập:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(171, 104, 50));
        jLabel3.setText("Mật khẩu:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, -1));

        txttendangnhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttendangnhap.setForeground(new java.awt.Color(171, 104, 50));
        jPanel1.add(txttendangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 71, 140, -1));

        txtmk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmk.setForeground(new java.awt.Color(171, 104, 50));
        jPanel1.add(txtmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 115, 140, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(171, 104, 50));
        jButton1.setText("Đăng nhập");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 171, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(171, 104, 50));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phuxuan/quanlycoffee/image/nencafe.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 498, 310));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(500, 312));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StringBuilder sb = new StringBuilder();
        KIEMTRANGUOIDUNGHELPER.validateEmpty(txttendangnhap, sb, "no");
        KIEMTRANGUOIDUNGHELPER.validateEmpty(txtmk, sb, "no");
        if (sb.length() > 0) {
            MessageHerr.showErrorDialog(this, sb.toString(), "Lỗi ");
            return;
        }
        try {
            Nhanviendao dao = new Nhanviendao();
            Nhanvienmodel nd = dao.checkLogin(txttendangnhap.getText(), new String(txtmk.getPassword()));
            if (nd == null) {
                MessageHerr.showErrorDialog(this, "ten dang nhap sai hay mk sai", "Tên đăng nhập hoặc mật khẩu bị sai !!");
            } else {
                lulsdangnhap();
                sheardatta.nguoiDangNhap = nd;
                Quanlybanhang h = new Quanlybanhang();
                h.setVisible(true);
                this.dispose();
            }
        } catch (ClassNotFoundException | SQLException e) {
            MessageHerr.showErrorDialog(this, e.getMessage(), "Tên đăng nhập hoặc mật khẩu bị sai !!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Dangnhapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dangnhapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dangnhapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dangnhapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dangnhapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbtDate;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txttendangnhap;
    // End of variables declaration//GEN-END:variables
}