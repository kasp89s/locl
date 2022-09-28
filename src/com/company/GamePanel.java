package com.company;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends javax.swing.JFrame {

    /**
     * Creates new form GamePanel
     */
    public GamePanel() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenWidth = tk.getScreenSize().width;
        int screenHeight = tk.getScreenSize().height;
        getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setBounds(0,0,screenWidth, screenHeight / 40);

        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TimeLeftMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Залишок часу:");

        TimeLeftMessage.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TimeLeftMessage.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("хвилин");

        LogOutButton.setText("Закінчити сеанс");
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TimeLeftMessage)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)
                                .addGap(113, 113, 113)
                                .addComponent(LogOutButton)
                                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(LogOutButton)
                                        .addComponent(TimeLeftMessage))
                                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Main.showLockPanel();
    }

    public void setTimeLeft(String value) {
        TimeLeftMessage.setText(value);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel TimeLeftMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
