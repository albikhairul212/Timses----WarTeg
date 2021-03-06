/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface;
import StrukConfirm.*;
import Barang.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author nabil
 */
public class HalamanAwal extends javax.swing.JFrame {

    /**
     * Creates new form HalamanAwal
     */
    public HalamanAwal() {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonLaptop = new javax.swing.JButton();
        ButtonIphone = new javax.swing.JButton();
        ButtonPs = new javax.swing.JButton();
        ButtonJam = new javax.swing.JButton();
        ButtonIpad = new javax.swing.JButton();
        ButtonUsb = new javax.swing.JButton();
        ButtonKamera = new javax.swing.JButton();
        ButtonKomputer = new javax.swing.JButton();
        Profil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        ButtonLaptop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptopActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop);
        ButtonLaptop.setBounds(300, 440, 50, 50);

        ButtonIphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonIphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIphoneActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIphone);
        ButtonIphone.setBounds(650, 440, 50, 50);

        ButtonPs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPsActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonPs);
        ButtonPs.setBounds(990, 440, 50, 50);

        ButtonJam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonJamActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonJam);
        ButtonJam.setBounds(1330, 440, 50, 50);

        ButtonIpad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonIpad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIpadActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIpad);
        ButtonIpad.setBounds(300, 720, 50, 50);

        ButtonUsb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonUsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUsbActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonUsb);
        ButtonUsb.setBounds(650, 720, 50, 50);

        ButtonKamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonKamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKameraActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonKamera);
        ButtonKamera.setBounds(990, 720, 50, 50);

        ButtonKomputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonKomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKomputerActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonKomputer);
        ButtonKomputer.setBounds(1330, 720, 50, 50);

        Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pp.png"))); // NOI18N
        Profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfilActionPerformed(evt);
            }
        });
        getContentPane().add(Profil);
        Profil.setBounds(1310, 120, 110, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Tampilan Awal 1440 x 840.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIphoneActionPerformed
        // TODO add your handling code here:
       new Iphone().setVisible(true);
       dispose();
    }//GEN-LAST:event_ButtonIphoneActionPerformed

    private void ButtonJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonJamActionPerformed
        // TODO add your handling code here:
        new Sw().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonJamActionPerformed

    private void ButtonUsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUsbActionPerformed
        // TODO add your handling code here:
        new Usb().setVisible(true);
        dispose();
      
    }//GEN-LAST:event_ButtonUsbActionPerformed

    private void ButtonIpadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIpadActionPerformed
        // TODO add your handling code here:
        new Ipad().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonIpadActionPerformed

    private void ButtonKameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKameraActionPerformed
        // TODO add your handling code here:
        new Kamera().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonKameraActionPerformed

    private void ButtonLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptopActionPerformed
        // TODO add your handling code here:
        new Laptop().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ButtonLaptopActionPerformed

    private void ButtonKomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKomputerActionPerformed
        // TODO add your handling code here:
        new Pc().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ButtonKomputerActionPerformed

    private void ButtonPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPsActionPerformed
        // TODO add your handling code here:
        new Ps().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonPsActionPerformed

    private void ProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfilActionPerformed
        // TODO add your handling code here:
        new ProfilUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_ProfilActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIpad;
    private javax.swing.JButton ButtonIphone;
    private javax.swing.JButton ButtonJam;
    private javax.swing.JButton ButtonKamera;
    private javax.swing.JButton ButtonKomputer;
    private javax.swing.JButton ButtonLaptop;
    private javax.swing.JButton ButtonPs;
    private javax.swing.JButton ButtonUsb;
    private javax.swing.JButton Profil;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
