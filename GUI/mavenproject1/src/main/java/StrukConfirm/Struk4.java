/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StrukConfirm;

import SHarga1.Per4;
import SHarga2.Permanen4;
import javax.swing.JOptionPane;

/**
 *
 * @author UMAM
 */
public class Struk4 extends javax.swing.JFrame {

    /**
     * Creates new form Struk4
     */
    public Struk4() {
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

        Harga = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        Plus = new javax.swing.JButton();
        Cod = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Harga.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(Harga);
        Harga.setBounds(980, 500, 300, 50);

        Jumlah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });
        getContentPane().add(Jumlah);
        Jumlah.setBounds(720, 500, 120, 60);

        Plus.setBackground(java.awt.Color.gray);
        Plus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Plus.setForeground(java.awt.SystemColor.controlLtHighlight);
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });
        getContentPane().add(Plus);
        Plus.setBounds(840, 500, 50, 60);

        Cod.setBackground(java.awt.Color.gray);
        Cod.setForeground(java.awt.SystemColor.controlLtHighlight);
        Cod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Cod.png"))); // NOI18N
        Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodActionPerformed(evt);
            }
        });
        getContentPane().add(Cod);
        Cod.setBounds(1070, 660, 150, 150);

        Transfer.setBackground(java.awt.Color.gray);
        Transfer.setForeground(java.awt.SystemColor.controlLtHighlight);
        Transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Tf.png"))); // NOI18N
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });
        getContentPane().add(Transfer);
        Transfer.setBounds(780, 660, 150, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/konfirmasi sw.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        // TODO add your handling code here:
         int a1 = Integer.valueOf(Jumlah.getText());
        int a2 = 8_400_000; // harga awal barang
        int hasil = a1 * a2 ;
        //input nilai
        Harga.setText(String.valueOf(hasil));
        if(a1 == 3){
            JOptionPane.showMessageDialog(null,"Mohon Maaf jumlah barang yang anda input tidak cukup \n"
                    +"Silahkan Coba Lagi");
        }else;
    }//GEN-LAST:event_PlusActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
        // TODO add your handling code here:
        int a1 = Integer.valueOf(Jumlah.getText());
        
        if( a1 == 1){
        new Per4().setVisible(true);
        dispose();
        }else if( a1 == 2){
        new Permanen4().setVisible(true);
        dispose();    
        }else;
    }//GEN-LAST:event_TransferActionPerformed

    private void CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodActionPerformed
        // TODO add your handling code here:
        int a1 = Integer.valueOf(Jumlah.getText());
        
        if( a1 == 1){
        new Per4().setVisible(true);
        dispose();
        }else if( a1 == 2){
        new Permanen4().setVisible(true);
        dispose();    
        }else;
    }//GEN-LAST:event_CodActionPerformed

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahActionPerformed

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
            java.util.logging.Logger.getLogger(Struk4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Struk4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Struk4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Struk4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Struk4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cod;
    private javax.swing.JLabel Harga;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Transfer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
