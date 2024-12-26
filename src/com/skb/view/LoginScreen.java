/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.skb.view;

/**
 *
 * @author shishir
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
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

        pnlLoginScreenForegroundWhiteRectangle = new javax.swing.JPanel();
        lblLoginScreenLoginText = new javax.swing.JLabel();
        lblLoginScreenUsername = new javax.swing.JLabel();
        lblLoginScreenPassword = new javax.swing.JLabel();
        textFieldLoginScreenUsername = new javax.swing.JTextField();
        textFieldLoginScreenPassword = new javax.swing.JTextField();
        btnLoginScreenLogin = new javax.swing.JButton();
        lblLoginScreenForgotPassword = new javax.swing.JLabel();
        lblLoginScreenBgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLoginScreenForegroundWhiteRectangle.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginScreenForegroundWhiteRectangle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoginScreenLoginText.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        lblLoginScreenLoginText.setText("Login");
        pnlLoginScreenForegroundWhiteRectangle.add(lblLoginScreenLoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        lblLoginScreenUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblLoginScreenUsername.setText("Username");
        pnlLoginScreenForegroundWhiteRectangle.add(lblLoginScreenUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        lblLoginScreenPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblLoginScreenPassword.setText("Password");
        pnlLoginScreenForegroundWhiteRectangle.add(lblLoginScreenPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        textFieldLoginScreenUsername.setText(" ");
        textFieldLoginScreenUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLoginScreenUsernameActionPerformed(evt);
            }
        });
        pnlLoginScreenForegroundWhiteRectangle.add(textFieldLoginScreenUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 260, 50));
        pnlLoginScreenForegroundWhiteRectangle.add(textFieldLoginScreenPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 260, 50));

        btnLoginScreenLogin.setText("LOGIN");
        pnlLoginScreenForegroundWhiteRectangle.add(btnLoginScreenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 250, 40));

        lblLoginScreenForgotPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblLoginScreenForgotPassword.setText("forgot password?");
        pnlLoginScreenForegroundWhiteRectangle.add(lblLoginScreenForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        getContentPane().add(pnlLoginScreenForegroundWhiteRectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 380, 530));

        lblLoginScreenBgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/skb/resoruces/loginScreenBgImage.jpg"))); // NOI18N
        lblLoginScreenBgImage.setText(" ");
        getContentPane().add(lblLoginScreenBgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldLoginScreenUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLoginScreenUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldLoginScreenUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginScreenLogin;
    private javax.swing.JLabel lblLoginScreenBgImage;
    private javax.swing.JLabel lblLoginScreenForgotPassword;
    private javax.swing.JLabel lblLoginScreenLoginText;
    private javax.swing.JLabel lblLoginScreenPassword;
    private javax.swing.JLabel lblLoginScreenUsername;
    private javax.swing.JPanel pnlLoginScreenForegroundWhiteRectangle;
    private javax.swing.JTextField textFieldLoginScreenPassword;
    private javax.swing.JTextField textFieldLoginScreenUsername;
    // End of variables declaration//GEN-END:variables
}
