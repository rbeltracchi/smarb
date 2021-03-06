/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.smartprice.views;

import java.awt.Color;

/**
 *
 * @author ze
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {

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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userLoginTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        loginButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        loginPassField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(75, 82, 97));

        jLabel4.setBackground(new java.awt.Color(220, 229, 236));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(220, 229, 236));
        jLabel4.setText("LOGIN");
        jLabel4.setToolTipText("");

        jLabel5.setBackground(new java.awt.Color(220, 229, 236));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 229, 236));
        jLabel5.setText("E-MAIL:");

        userLoginTextField.setBackground(new java.awt.Color(75, 82, 97));
        userLoginTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        userLoginTextField.setForeground(new java.awt.Color(0, 171, 170));
        userLoginTextField.setBorder(null);
        userLoginTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        userLoginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(220, 229, 236));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 229, 236));
        jLabel6.setText("CONTRASEÑA:");

        jSeparator1.setBackground(new java.awt.Color(0, 171, 170));
        jSeparator1.setForeground(new java.awt.Color(0, 171, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jSeparator2.setBackground(new java.awt.Color(0, 171, 170));
        jSeparator2.setForeground(new java.awt.Color(0, 171, 170));

        loginButton.setBackground(new java.awt.Color(0, 171, 170));
        loginButton.setForeground(new java.awt.Color(220, 229, 236));
        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.setFocusPainted(false);

        signInButton.setBackground(new java.awt.Color(0, 171, 170));
        signInButton.setForeground(new java.awt.Color(220, 229, 236));
        signInButton.setText("REGISTRARSE");
        signInButton.setToolTipText("");
        signInButton.setBorder(null);
        signInButton.setFocusPainted(false);
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        loginPassField.setBackground(new java.awt.Color(75, 82, 97));
        loginPassField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        loginPassField.setForeground(new java.awt.Color(0, 171, 170));
        loginPassField.setBorder(null);
        loginPassField.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 87, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userLoginTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginPassField)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(loginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userLoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userLoginTextFieldActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JButton loginButton;
    public javax.swing.JPasswordField loginPassField;
    public javax.swing.JButton signInButton;
    public javax.swing.JTextField userLoginTextField;
    // End of variables declaration//GEN-END:variables
}
