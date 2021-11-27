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
        ButtonIphone = new javax.swing.JButton();
        ButtonWatch = new javax.swing.JButton();
        ButtonKomputer = new javax.swing.JButton();
        ButtonFlash = new javax.swing.JButton();
        ButtonIpad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        ButtonLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLaptopActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLaptop);
        ButtonLaptop.setBounds(390, 500, 60, 60);

        ButtonIphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIphoneActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIphone);
        ButtonIphone.setBounds(850, 500, 60, 60);

        ButtonWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWatchActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonWatch);
        ButtonWatch.setBounds(1320, 500, 60, 60);

        ButtonKomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKomputerActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonKomputer);
        ButtonKomputer.setBounds(1320, 860, 60, 60);

        ButtonFlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFlashActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonFlash);
        ButtonFlash.setBounds(850, 860, 60, 60);

        ButtonIpad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIpadActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIpad);
        ButtonIpad.setBounds(390, 850, 60, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/HalamanAwal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLaptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLaptopActionPerformed

    private void ButtonIphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonIphoneActionPerformed

    private void ButtonWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonWatchActionPerformed

    private void ButtonKomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKomputerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonKomputerActionPerformed

    private void ButtonFlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFlashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFlashActionPerformed

    private void ButtonIpadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIpadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonIpadActionPerformed

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
    private javax.swing.JButton ButtonFlash;
    private javax.swing.JButton ButtonIpad;
    private javax.swing.JButton ButtonIphone;
    private javax.swing.JButton ButtonKomputer;
    private javax.swing.JButton ButtonLaptop;
    private javax.swing.JButton ButtonWatch;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
