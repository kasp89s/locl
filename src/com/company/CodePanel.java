package com.company;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;

public class CodePanel extends javax.swing.JPanel {

    /**
     * Creates new form CodePanel
     */
    public CodePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1 = new javax.swing.JLabel();
        CodeInput = new javax.swing.JTextField();
        CodeButton = new javax.swing.JButton();
        SwitchLoginButton = new javax.swing.JButton();
        CodeErrorMessage = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Код активації");

        CodeInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CodeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CodeButton.setForeground(new java.awt.Color(255, 255, 255));
        CodeButton.setContentAreaFilled(false);
        CodeButton.setText("Активувати");
        CodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeButtonActionPerformed(evt);
            }
        });

        SwitchLoginButton.setText("Увійти в аккаунт");
        SwitchLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        SwitchLoginButton.setContentAreaFilled(false);
        SwitchLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchLoginButtonActionPerformed(evt);
            }
        });

        CodeErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(CodeErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(CodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(SwitchLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(CodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodeErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SwitchLoginButton)
                                .addGap(16, 16, 16))
        );
    }// </editor-fold>

    private void CodeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String jsonString = new JSONObject()
                .put("code", CodeInput.getText())
                .toString();

        try {
            String response = Main.httpPostRequest(Main.CodeLoginEndpoint, jsonString);

            try {
                JSONObject out = new JSONObject(response);

                int timeLeft = (int) out.get("timeLeft");

                if (timeLeft == 0) {
                    CodeErrorMessage.setText("Час гры вичерпано");
                }

                Main.processCodeAuthResponse(out);
            } catch (JSONException e) {
                CodeErrorMessage.setText("Помилковий код");
            }
//            System.out.println(out.get("timeLeft"));
        } catch (IOException e) {
            CodeErrorMessage.setText(e.getMessage());
        } catch (InterruptedException e) {
            CodeErrorMessage.setText(e.getMessage());
        }


    }

    private void SwitchLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Main.lock.closeCodePanel();
        Main.lock.displayLoginPanel();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton CodeButton;
    private javax.swing.JLabel CodeErrorMessage;
    private javax.swing.JTextField CodeInput;
    private javax.swing.JButton SwitchLoginButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}
