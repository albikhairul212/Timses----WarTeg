/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Barang;
import StrukConfirm.*;
import Interface.*;


/**
 *
 * @author UMAM
 */
public class Ipad extends javax.swing.JFrame {

    /**
     * Creates new form Ipad
     */
    public Ipad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kembali = new javax.swing.JButton();
        Cek = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 840));
        getContentPane().setLayout(null);

        Kembali.setBackground(java.awt.Color.gray);
        Kembali.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Kembali.setForeground(java.awt.SystemColor.controlLtHighlight);
        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali);
        Kembali.setBounds(1160, 760, 73, 30);

        Cek.setBackground(java.awt.Color.gray);
        Cek.setForeground(java.awt.SystemColor.controlLtHighlight);
        Cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Ceklis.png"))); // NOI18N
        Cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekActionPerformed(evt);
            }
        });
        getContentPane().add(Cek);
        Cek.setBounds(1260, 700, 110, 110);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Beliipad.png"))); // NOI18N
        getContentPane().add(BackGround);
        BackGround.setBounds(0, 0, 1440, 850);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekActionPerformed
        // TODO add your handling code here:
        new Struk5().setVisible(true);
        dispose();
    }//GEN-LAST:event_CekActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        new HalamanAwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Ipad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ipad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ipad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ipad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ipad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton Cek;
    private javax.swing.JButton Kembali;
    // End of variables declaration//GEN-END:variables
}
