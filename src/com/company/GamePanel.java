package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

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
        this.setBounds(0,0,screenWidth, screenHeight);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TimeLeftMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        // GAMES
        Csgo = new javax.swing.JLabel();
        Chrome = new javax.swing.JLabel();
        Fortnite = new javax.swing.JLabel();
        Pubg = new javax.swing.JLabel();
        Dota = new javax.swing.JLabel();
        Valorant = new javax.swing.JLabel();
        Apex = new javax.swing.JLabel();
        Lol = new javax.swing.JLabel();
        Overwatch = new javax.swing.JLabel();
        Genshen = new javax.swing.JLabel();
        Heartstone = new javax.swing.JLabel();
        StarCraft = new javax.swing.JLabel();
        Diablo = new javax.swing.JLabel();
        Crossout = new javax.swing.JLabel();
        WarThunder = new javax.swing.JLabel();
        WorldOfTanks = new javax.swing.JLabel();
        Warships = new javax.swing.JLabel();
        Blitz = new javax.swing.JLabel();
        Wow = new javax.swing.JLabel();
        Steam = new javax.swing.JLabel();
        EpicGames = new javax.swing.JLabel();
        BattleNet = new javax.swing.JLabel();

        Csgo.setBackground(new java.awt.Color(0, 0, 0));
        Csgo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Csgo.setForeground(new java.awt.Color(255, 255, 255));
        Csgo.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("csgo_128.png"))); // NOI18N
        Csgo.setText("CS:GO");
        Csgo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Csgo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Csgo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Csgo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Csgo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CsgoMouseClicked(evt);
            }
        });

        Chrome.setBackground(new java.awt.Color(0, 0, 0));
        Chrome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Chrome.setForeground(new java.awt.Color(255, 255, 255));
        Chrome.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("c_128_128.png"))); // NOI18N
        Chrome.setText("Chrome");
        Chrome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Chrome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Chrome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Chrome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Chrome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChromeMouseClicked(evt);
            }
        });

        Fortnite.setBackground(new java.awt.Color(0, 0, 0));
        Fortnite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Fortnite.setForeground(new java.awt.Color(255, 255, 255));
        Fortnite.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("fortnite_1298.png"))); // NOI18N
        Fortnite.setText("Fortnite");
        Fortnite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fortnite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fortnite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Fortnite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Fortnite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FortniteMouseClicked(evt);
            }
        });

        Pubg.setBackground(new java.awt.Color(0, 0, 0));
        Pubg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pubg.setForeground(new java.awt.Color(255, 255, 255));
        Pubg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("21520-128x128x32.png"))); // NOI18N
        Pubg.setText("PUBG");
        Pubg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pubg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pubg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pubg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pubg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PubgMouseClicked(evt);
            }
        });

        Dota.setBackground(new java.awt.Color(0, 0, 0));
        Dota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dota.setForeground(new java.awt.Color(255, 255, 255));
        Dota.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("dota_128.png"))); // NOI18N
        Dota.setText("Dota 2");
        Dota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Dota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DotaMouseClicked(evt);
            }
        });

        Valorant.setBackground(new java.awt.Color(0, 0, 0));
        Valorant.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Valorant.setForeground(new java.awt.Color(255, 255, 255));
        Valorant.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("valorant_128.png"))); // NOI18N
        Valorant.setText("VALORANT");
        Valorant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Valorant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Valorant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Valorant.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Valorant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorantMouseClicked(evt);
            }
        });

        Apex.setBackground(new java.awt.Color(0, 0, 0));
        Apex.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Apex.setForeground(new java.awt.Color(255, 255, 255));
        Apex.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("21509-128x128x32.png"))); // NOI18N
        Apex.setText("ApexLegends");
        Apex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Apex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Apex.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Apex.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Apex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApexMouseClicked(evt);
            }
        });

        Lol.setBackground(new java.awt.Color(0, 0, 0));
        Lol.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lol.setForeground(new java.awt.Color(255, 255, 255));
        Lol.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("21516-128x128x32.png"))); // NOI18N
        Lol.setText("LoL");
        Lol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Lol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lol.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Lol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LolMouseClicked(evt);
            }
        });
        Overwatch.setBackground(new java.awt.Color(0, 0, 0));
        Overwatch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Overwatch.setForeground(new java.awt.Color(255, 255, 255));
        Overwatch.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("21518-128x128x32.png"))); // NOI18N
        Overwatch.setText("Overwatch");
        Overwatch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Overwatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Overwatch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Overwatch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Overwatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OverwatchMouseClicked(evt);
            }
        });

        Genshen.setBackground(new java.awt.Color(0, 0, 0));
        Genshen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Genshen.setForeground(new java.awt.Color(255, 255, 255));
        Genshen.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("genshen_128.png"))); // NOI18N
        Genshen.setText("Genshin");
        Genshen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Genshen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Genshen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Genshen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Genshen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenshenMouseClicked(evt);
            }
        });
        Heartstone.setBackground(new java.awt.Color(0, 0, 0));
        Heartstone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Heartstone.setForeground(new java.awt.Color(255, 255, 255));
        Heartstone.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("heartstone_128.png"))); // NOI18N
        Heartstone.setText("Heartstone");
        Heartstone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Heartstone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Heartstone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heartstone.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Heartstone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeartstoneMouseClicked(evt);
            }
        });

        StarCraft.setBackground(new java.awt.Color(0, 0, 0));
        StarCraft.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StarCraft.setForeground(new java.awt.Color(255, 255, 255));
        StarCraft.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Starcraft_128.png"))); // NOI18N
        StarCraft.setText("StarCraft 2");
        StarCraft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StarCraft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StarCraft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StarCraft.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StarCraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StarCraftMouseClicked(evt);
            }
        });

        Diablo.setBackground(new java.awt.Color(0, 0, 0));
        Diablo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Diablo.setForeground(new java.awt.Color(255, 255, 255));
        Diablo.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("diablo_128.png"))); // NOI18N
        Diablo.setText("Diablo 2");
        Diablo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Diablo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Diablo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Diablo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Diablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiabloMouseClicked(evt);
            }
        });

        Crossout.setBackground(new java.awt.Color(0, 0, 0));
        Crossout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Crossout.setForeground(new java.awt.Color(255, 255, 255));
        Crossout.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("crossout_128.png"))); // NOI18N
        Crossout.setText("Crossout");
        Crossout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Crossout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Crossout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Crossout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Crossout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossoutMouseClicked(evt);
            }
        });

        WarThunder.setBackground(new java.awt.Color(0, 0, 0));
        WarThunder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        WarThunder.setForeground(new java.awt.Color(255, 255, 255));
        WarThunder.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("war_128.png"))); // NOI18N
        WarThunder.setText("WarThunder");
        WarThunder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        WarThunder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WarThunder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WarThunder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        WarThunder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WarThunderMouseClicked(evt);
            }
        });

        WorldOfTanks.setBackground(new java.awt.Color(0, 0, 0));
        WorldOfTanks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        WorldOfTanks.setForeground(new java.awt.Color(255, 255, 255));
        WorldOfTanks.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("21525-128x128x32.png"))); // NOI18N
        WorldOfTanks.setText("WoT");
        WorldOfTanks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        WorldOfTanks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WorldOfTanks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WorldOfTanks.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        WorldOfTanks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorldOfTanksMouseClicked(evt);
            }
        });

        Warships.setBackground(new java.awt.Color(0, 0, 0));
        Warships.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Warships.setForeground(new java.awt.Color(255, 255, 255));
        Warships.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("ship_128.png"))); // NOI18N
        Warships.setText("Warships");
        Warships.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Warships.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Warships.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Warships.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Warships.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WarshipsMouseClicked(evt);
            }
        });

        Blitz.setBackground(new java.awt.Color(0, 0, 0));
        Blitz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Blitz.setForeground(new java.awt.Color(255, 255, 255));
        Blitz.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("blitz_128.png"))); // NOI18N
        Blitz.setText("Blitz");
        Blitz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Blitz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Blitz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Blitz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Blitz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlitzMouseClicked(evt);
            }
        });

        Wow.setBackground(new java.awt.Color(0, 0, 0));
        Wow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Wow.setForeground(new java.awt.Color(255, 255, 255));
        Wow.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("21526-128x128x32.png"))); // NOI18N
        Wow.setText("WoW");
        Wow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Wow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Wow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Wow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Wow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WowMouseClicked(evt);
            }
        });

        Steam.setBackground(new java.awt.Color(0, 0, 0));
        Steam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Steam.setForeground(new java.awt.Color(255, 255, 255));
        Steam.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Steam_icon_logo_128.png"))); // NOI18N
        Steam.setText("Steam");
        Steam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Steam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Steam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Steam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Steam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SteamMouseClicked(evt);
            }
        });

        EpicGames.setBackground(new java.awt.Color(0, 0, 0));
        EpicGames.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EpicGames.setForeground(new java.awt.Color(255, 255, 255));
        EpicGames.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("epic_128.png"))); // NOI18N
        EpicGames.setText("Epic GAMES");
        EpicGames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EpicGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EpicGames.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EpicGames.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EpicGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EpicGamesMouseClicked(evt);
            }
        });

        BattleNet.setBackground(new java.awt.Color(0, 0, 0));
        BattleNet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BattleNet.setForeground(new java.awt.Color(255, 255, 255));
        BattleNet.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("battle_128.png"))); // NOI18N
        BattleNet.setText("Battle.net");
        BattleNet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BattleNet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BattleNet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BattleNet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BattleNet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BattleNetMouseClicked(evt);
            }
        });
//        Fortnite = new javax.swing.JLabel();
//        Fortnite.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("c_128_128.png"))); // NOI18N
//        Fortnite.setBorder(javax.swing.BorderFactory.createEtchedBorder());
//        Fortnite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        Fortnite.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                FortniteMouseClicked(evt);
//            }
//        });
        // GAMES

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(615, 615, 615)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(StarCraft)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Diablo))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Chrome)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(Csgo)))
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Fortnite)
                                                        .addComponent(Crossout))
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Pubg)
                                                        .addComponent(WarThunder))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(TimeLeftMessage)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(LogOutButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(WorldOfTanks)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(Warships))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Dota)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(Valorant)))
                                                .addGap(53, 53, 53)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Apex)
                                                        .addComponent(Blitz))
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Lol)
                                                        .addComponent(Wow))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Overwatch)
                                        .addComponent(Steam))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Heartstone)
                                                .addGap(41, 41, 41)
                                                .addComponent(Genshen))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(EpicGames)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BattleNet)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(LogOutButton)
                                        .addComponent(TimeLeftMessage))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Heartstone)
                                        .addComponent(Csgo)
                                        .addComponent(Chrome)
                                        .addComponent(Fortnite)
                                        .addComponent(Pubg)
                                        .addComponent(Dota)
                                        .addComponent(Valorant)
                                        .addComponent(Lol)
                                        .addComponent(Apex)
                                        .addComponent(Overwatch)
                                        .addComponent(Genshen))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(StarCraft)
                                        .addComponent(Diablo)
                                        .addComponent(Crossout)
                                        .addComponent(WarThunder)
                                        .addComponent(WorldOfTanks)
                                        .addComponent(Warships)
                                        .addComponent(Blitz)
                                        .addComponent(Wow)
                                        .addComponent(Steam)
                                        .addComponent(EpicGames)
                                        .addComponent(BattleNet))
                                .addGap(0, 56, Short.MAX_VALUE))
        );

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(750, 750, 750)
//                                .addComponent(jLabel1)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                .addComponent(TimeLeftMessage)
//                                .addGap(17, 17, 17)
//                                .addComponent(jLabel2)
//                                .addGap(113, 113, 113)
//                                .addComponent(LogOutButton)
//                                .addContainerGap(500, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jLabel1)
//                                        .addComponent(jLabel2)
//                                        .addComponent(LogOutButton)
//                                        .addComponent(TimeLeftMessage))
//                                .addGap(0, 12, Short.MAX_VALUE))
//        );
    }// </editor-fold>

    private void CsgoMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            java.net.URI url = new java.net.URI("steam://rungameid/730");
            java.awt.Desktop.getDesktop().browse(url);
        } catch (IOException exception) {
        } catch (URISyntaxException exception) {
        }
    }

    private void ChromeMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
            };
            Main.run(params);
        } catch (IOException exception) {

        } catch (InterruptedException exception) {

        }
    }

    private void PubgMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            java.net.URI url = new java.net.URI("steam://rungameid/578080");
            java.awt.Desktop.getDesktop().browse(url);
        } catch (IOException exception) {
        } catch (URISyntaxException exception) {
        }
    }

    private void DotaMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            java.net.URI url = new java.net.URI("steam://rungameid/570");
            java.awt.Desktop.getDesktop().browse(url);
        } catch (IOException exception) {
        } catch (URISyntaxException exception) {
        }
    }

    private void ValorantMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\Riot Games\\Riot Client\\RiotClientServices.exe",
                    "--launch-product=valorant",
                    "--launch-patchline=live"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void ApexMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            java.net.URI url = new java.net.URI("steam://rungameid/1172470");
            java.awt.Desktop.getDesktop().browse(url);
        } catch (IOException exception) {
        } catch (URISyntaxException exception) {
        }
    }

    private void LolMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\Riot Games\\Riot Client\\RiotClientServices.exe",
                    "--launch-product=league_of_legends",
                    "--launch-patchline=live"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void OverwatchMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\Overwatch\\Overwatch Launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void GenshenMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Windows\\System32\\runas.exe",
                    "/savecred",
                    "/user:DESKTOP-VK1BTGH\\Administrator",
                    "\"D:\\Genshin Impact\\launcher.exe\""
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }
    private void HeartstoneMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\Hearthstone\\Hearthstone Beta Launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }
    private void StarCraftMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\StarCraft II\\StarCraft II.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void DiabloMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\Diablo II Resurrected\\Diablo II Resurrected Launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void CrossoutMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Game\\Crossout\\launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void WarThunderMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\WarThunder\\launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void WorldOfTanksMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Windows\\System32\\runas.exe",
                    "/savecred",
                    "/user:DESKTOP-VK1BTGH\\Administrator",
                    "\"D:\\Games\\World_of_Tanks_EU\\wgc_api.exe --open\""
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void WarshipsMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Windows\\System32\\runas.exe",
                    "/savecred",
                    "/user:DESKTOP-VK1BTGH\\Administrator",
                    "\"D:\\World_of_Warships\\wgc_api.exe --open\""
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void BlitzMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Windows\\System32\\runas.exe",
                    "/savecred",
                    "/user:DESKTOP-VK1BTGH\\Administrator",
                    "\"D:\\World_of_Tanks_Blitz\\wgc_api.exe --open\""
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void WowMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\World of Warcraft\\World of Warcraft Launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void SteamMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\steam\\steam.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void EpicGamesMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Windows\\System32\\runas.exe",
                    "/savecred",
                    "/user:DESKTOP-VK1BTGH\\Administrator",
                    "\"D:\\EpicGames\\Epic Games\\Launcher\\Portal\\Binaries\\Win32\\EpicGamesLauncher.exe\""
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void BattleNetMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String[] params = {
                    "D:\\Battle.net\\Battle.net Launcher.exe"
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }
    private void FortniteMouseClicked(java.awt.event.MouseEvent evt) {

        // TODO add your handling code here:
        try {
            String[] params = {
                    "C:\\Windows\\System32\\runas.exe",
                    "/savecred",
                    "/user:DESKTOP-VK1BTGH\\Administrator",
                    "\"D:\\EpicGames\\Epic Games\\Launcher\\Portal\\Binaries\\Win32\\EpicGamesLauncher.exe\""
            };
            Main.run(params);
        } catch (IOException exception) {
        } catch (InterruptedException exception) {
        }
    }

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Main.showLockPanel();
    }

    public void setTimeLeft(String value) {
        TimeLeftMessage.setText(value);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Apex;
    private javax.swing.JLabel BattleNet;
    private javax.swing.JLabel Blitz;
    private javax.swing.JLabel Chrome;
    private javax.swing.JLabel Crossout;
    private javax.swing.JLabel Csgo;
    private javax.swing.JLabel Diablo;
    private javax.swing.JLabel Dota;
    private javax.swing.JLabel EpicGames;
    private javax.swing.JLabel Fortnite;
    private javax.swing.JLabel Genshen;
    private javax.swing.JLabel Genshen1;
    private javax.swing.JLabel Heartstone;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel Lol;
    private javax.swing.JLabel Overwatch;
    private javax.swing.JLabel Pubg;
    private javax.swing.JLabel StarCraft;
    private javax.swing.JLabel Steam;
    private javax.swing.JLabel TimeLeftMessage;
    private javax.swing.JLabel Valorant;
    private javax.swing.JLabel WarThunder;
    private javax.swing.JLabel Warships;
    private javax.swing.JLabel WorldOfTanks;
    private javax.swing.JLabel Wow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
