/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface;

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
        ButtonLaptop1 = new javax.swing.JButton();
        ButtonLaptop2 = new javax.swing.JButton();
        ButtonLaptop3 = new javax.swing.JButton();
        ButtonLaptop4 = new javax.swing.JButton();
        ButtonLaptop5 = new javax.swing.JButton();
        ButtonLaptop6 = new javax.swing.JButton();
        ButtonLaptop7 = new javax.swing.JButton();
        ButtonLaptop8 = new javax.swing.JButton();
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
        ButtonLaptop.setBounds(650, 440, 50, 50);

        ButtonLaptop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop1);
        ButtonLaptop1.setBounds(1330, 440, 50, 50);

        ButtonLaptop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop2ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop2);
        ButtonLaptop2.setBounds(460, 600, 50, 50);

        ButtonLaptop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop3ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop3);
        ButtonLaptop3.setBounds(650, 720, 50, 50);

        ButtonLaptop4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop4ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop4);
        ButtonLaptop4.setBounds(300, 720, 50, 50);

        ButtonLaptop5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop5ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop5);
        ButtonLaptop5.setBounds(990, 720, 50, 50);

        ButtonLaptop6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop6ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop6);
        ButtonLaptop6.setBounds(300, 440, 50, 50);

        ButtonLaptop7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop7ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop7);
        ButtonLaptop7.setBounds(1330, 720, 50, 50);

        ButtonLaptop8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button +.png"))); // NOI18N
        ButtonLaptop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptop8ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop8);
        ButtonLaptop8.setBounds(990, 440, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Tampilan Awal 1440 x 840.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptopActionPerformed

    private void ButtonLaptop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop1ActionPerformed

    private void ButtonLaptop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop2ActionPerformed

    private void ButtonLaptop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop3ActionPerformed

    private void ButtonLaptop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop4ActionPerformed

    private void ButtonLaptop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop5ActionPerformed

    private void ButtonLaptop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop6ActionPerformed

    private void ButtonLaptop7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop7ActionPerformed

    private void ButtonLaptop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptop8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptop8ActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLaptop;
    private javax.swing.JButton ButtonLaptop1;
    private javax.swing.JButton ButtonLaptop2;
    private javax.swing.JButton ButtonLaptop3;
    private javax.swing.JButton ButtonLaptop4;
    private javax.swing.JButton ButtonLaptop5;
    private javax.swing.JButton ButtonLaptop6;
    private javax.swing.JButton ButtonLaptop7;
    private javax.swing.JButton ButtonLaptop8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}