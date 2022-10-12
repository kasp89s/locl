package com.company;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    private JButton button = new JButton("press");
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("w1.png"));

    GroupLayout layout;

    CodePanel codePanel1;
    LoginPanel loginPanel1;
    RegisterForm registerForm1;
    RecoveryPanel recoveryPanel1;
    DepositPanel depositPanel1;

    public Gui () {
        super("lock");
        getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // Important line!!!
        initComponents();
        this.displayCodePanel();
    }

    private void initComponents() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenWidth = tk.getScreenSize().width;
        int screenHeight = tk.getScreenSize().height;
        System.out.println(screenWidth);
        JLabel label = new JLabel(logo);
        getContentPane().add(label).setBounds((screenWidth / 2) - 250,screenHeight / 15,457,301);
    }

    public void closeCodePanel()
    {
        this.codePanel1.setVisible(false);
    }

    public void displayCodePanel()
    {
        this.codePanel1 = new CodePanel();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.codePanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.codePanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 334, Short.MAX_VALUE))
        );
    }

    public void closeLoginPanel()
    {
        this.loginPanel1.setVisible(false);
    }

    public void displayLoginPanel(String login)
    {
        this.loginPanel1 = new LoginPanel();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.loginPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.loginPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 209, Short.MAX_VALUE))
        );

        this.loginPanel1.LoginInput.setText(login);
    }

    public void displayRegisterPanel()
    {
        this.registerForm1 = new RegisterForm();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.registerForm1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.registerForm1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 185, Short.MAX_VALUE))
        );
    }

    public void closeRegisterPanel()
    {
        this.registerForm1.setVisible(false);
    }

    public void displayRecoveryPanel()
    {
        this.recoveryPanel1 = new RecoveryPanel();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.recoveryPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.recoveryPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 213, Short.MAX_VALUE))
        );
    }

    public void closeRecoveryPanel()
    {
        this.recoveryPanel1.setVisible(false);
    }

    public void displayDepositPanel()
    {
        this.depositPanel1 = new DepositPanel();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.depositPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(171, Short.MAX_VALUE)
                                .addComponent(this.depositPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 213, Short.MAX_VALUE))
        );
    }

    public void closeDepositPanel()
    {
        this.depositPanel1.setVisible(false);
    }

    // Variables declaration - do not modify
    private JTextField Code;
    private JLabel jLabel1;
    // End of variables declaration
}
