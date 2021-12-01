/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;

//import java.awt.*;
//import javax.swing.*;
/**
 *
 * @author UMAM
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
   
    public Login() {
        
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

        ShowPassword = new javax.swing.JLabel();
        LatarBelakang = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 10, 1440, 1024));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(90, 90));
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        ShowPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ShowPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowPassword.setText("Show Password");
        ShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(ShowPassword);
        ShowPassword.setBounds(440, 720, 130, 20);

        LatarBelakang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Sign.png"))); // NOI18N
        getContentPane().add(LatarBelakang);
        LatarBelakang.setBounds(10, 0, 1440, 1024);

        Password.setBackground(java.awt.Color.gray);
        Password.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Password.setForeground(java.awt.SystemColor.controlLtHighlight);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(420, 630, 540, 80);

        Username.setBackground(java.awt.Color.gray);
        Username.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Username.setForeground(java.awt.SystemColor.controlLtHighlight);
        Username.setText("Masukan Username");
        Username.setDisabledTextColor(java.awt.Color.gray);
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username);
        Username.setBounds(420, 460, 540, 80);

        Login.setBackground(java.awt.Color.gray);
        Login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Login.setForeground(java.awt.SystemColor.controlLtHighlight);
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(590, 740, 200, 80);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String pass = "1234";
        if(Username.getText().equalsIgnoreCase("TIMSES")&& pass.equalsIgnoreCase(Password.getText())){
            HalamanAwal h1 =new HalamanAwal();
            h1.setVisible(true);
            dispose();
            
        }else{
            JOptionPane.showMessageDialog(null,"Username Atau Password yang anda masukan salah !!! \n"
                    +"Silahkan Coba Lagi");
            Username.setText("");
            Username.requestFocus();
            Password.setText("");
        
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameMouseClicked

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        // TODO add your handling code here:
        if(Username.getText().equals("Masukan Username")){
        Username.setText("");
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        // TODO add your handling code here:
        if(Username.getText().equals("")){
        Username.setText("Masukan Username");
        }
    }//GEN-LAST:event_UsernameFocusLost

    private void ShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordMouseClicked
        // TODO add your handling code here:
     if(ShowPassword.getText().equals("Show Password")){
            ShowPassword.setText("Hide Password");
            Password.setEchoChar((char)0);
        }else{
            ShowPassword.setText("Show Password");
            Password.setEchoChar('*');
        }   
     
    }//GEN-LAST:event_ShowPasswordMouseClicked

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:
        if(Password.getPassword().equals("")){
            Password.setText("Masukan Password");
        }
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        // TODO add your handling code here:
        if(Password.getPassword().equals("Masukan Password")){
            Password.setText("");
        }
    }//GEN-LAST:event_PasswordFocusLost

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        if(showPassword.getText().equals("Show Password")){
            showPassword.setText("Hide Password");
            password.setEchoChar((char)0);
        }else{
            showPassword.setText("Show Password");
            password.setEchoChar('*');
        }        // TODO add your handling code here:
    }//GEN-LAST:event_showPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
         //   public void run() {
           //     new Login().setVisible(true);
            }
       // });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LatarBelakang;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel ShowPassword;
    private javax.swing.JTextField Username;
    // End of variables declaration//GEN-END:variables
}
