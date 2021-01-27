
package UpdatePlayer;

import Home.HomeFinalOne;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class UpdatePlayerFinalOne extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    
    //j file chooser for image
    
    private final ImageIcon format = null;
    
    String filename=null;
    int s=0;
    byte[] person_image=null;
    
    
    
    public UpdatePlayerFinalOne() {
        initComponents();
        
        conn=DbConnection.connect();
    }
    
    String imgPath = null;
 
    // Function To Resize The Image To Fit Into JLabel
     public ImageIcon ResizeImage(String ImagePath, byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
           MyImage = new ImageIcon(ImagePath);
        }else
        {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        txt_jc = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        pId = new javax.swing.JTextField();
        txt_clubID = new javax.swing.JTextField();
        dollarValue = new javax.swing.JTextField();
        txt_phn = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_hgt = new javax.swing.JTextField();
        txt_wgt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        Side_Pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_jc1 = new javax.swing.JTextField();
        agri_combo = new javax.swing.JComboBox();
        posi_combo = new javax.swing.JComboBox();
        reg_combo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        pacValue = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        shoValue = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        defValue = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        pasValue = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        driValue = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        phyValue = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ovrValue = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        calcBtn = new javax.swing.JButton();

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Jersey Number");

        txt_jc.setBackground(new java.awt.Color(71, 120, 197));
        txt_jc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_jc.setForeground(new java.awt.Color(255, 255, 255));
        txt_jc.setOpaque(false);
        txt_jc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jcActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 879));
        setMinimumSize(new java.awt.Dimension(1250, 879));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 879));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(71, 120, 197));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 130, 75, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 280, 52, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Club ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 230, 46, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone Number");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 370, 94, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 420, 31, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agreement Duration");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 470, 127, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Market Value For Player");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 770, 153, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hieght");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(220, 570, 40, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Wieght");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 620, 44, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("D.O.B");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(220, 670, 38, 17);

        txt_address.setBackground(new java.awt.Color(71, 120, 197));
        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_address.setForeground(new java.awt.Color(255, 255, 255));
        txt_address.setOpaque(false);
        jPanel1.add(txt_address);
        txt_address.setBounds(390, 270, 340, 70);

        pId.setBackground(new java.awt.Color(71, 120, 197));
        pId.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        pId.setForeground(new java.awt.Color(255, 255, 255));
        pId.setOpaque(false);
        pId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIdActionPerformed(evt);
            }
        });
        jPanel1.add(pId);
        pId.setBounds(390, 70, 170, 30);

        txt_clubID.setBackground(new java.awt.Color(71, 120, 197));
        txt_clubID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_clubID.setForeground(new java.awt.Color(255, 255, 255));
        txt_clubID.setOpaque(false);
        jPanel1.add(txt_clubID);
        txt_clubID.setBounds(390, 220, 340, 30);

        dollarValue.setBackground(new java.awt.Color(71, 120, 197));
        dollarValue.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dollarValue.setForeground(new java.awt.Color(255, 255, 255));
        dollarValue.setOpaque(false);
        dollarValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollarValueActionPerformed(evt);
            }
        });
        jPanel1.add(dollarValue);
        dollarValue.setBounds(390, 760, 340, 30);

        txt_phn.setBackground(new java.awt.Color(71, 120, 197));
        txt_phn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_phn.setForeground(new java.awt.Color(255, 255, 255));
        txt_phn.setOpaque(false);
        txt_phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phnActionPerformed(evt);
            }
        });
        jPanel1.add(txt_phn);
        txt_phn.setBounds(390, 360, 340, 30);

        txt_mail.setBackground(new java.awt.Color(71, 120, 197));
        txt_mail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setOpaque(false);
        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_mail);
        txt_mail.setBounds(390, 410, 340, 30);

        txt_hgt.setBackground(new java.awt.Color(71, 120, 197));
        txt_hgt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_hgt.setForeground(new java.awt.Color(255, 255, 255));
        txt_hgt.setOpaque(false);
        txt_hgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hgtActionPerformed(evt);
            }
        });
        jPanel1.add(txt_hgt);
        txt_hgt.setBounds(390, 560, 340, 30);

        txt_wgt.setBackground(new java.awt.Color(71, 120, 197));
        txt_wgt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_wgt.setForeground(new java.awt.Color(255, 255, 255));
        txt_wgt.setOpaque(false);
        txt_wgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_wgtActionPerformed(evt);
            }
        });
        jPanel1.add(txt_wgt);
        txt_wgt.setBounds(390, 610, 340, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Player Position");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(220, 520, 94, 17);

        txt_dob.setBackground(new java.awt.Color(71, 120, 197));
        txt_dob.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_dob.setForeground(new java.awt.Color(255, 255, 255));
        txt_dob.setOpaque(false);
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        jPanel1.add(txt_dob);
        txt_dob.setBounds(390, 660, 340, 30);

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("NIC Number");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(220, 180, 75, 20);

        txt_NIC.setBackground(new java.awt.Color(71, 120, 197));
        txt_NIC.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_NIC.setForeground(new java.awt.Color(255, 255, 255));
        txt_NIC.setOpaque(false);
        jPanel1.add(txt_NIC);
        txt_NIC.setBounds(390, 170, 340, 30);

        Side_Pane.setBackground(new java.awt.Color(23, 35, 51));
        Side_Pane.setLayout(null);

        btn_1.setBackground(new java.awt.Color(41, 57, 80));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });
        btn_1.setLayout(null);

        jPanel12.setPreferredSize(new java.awt.Dimension(3, 44));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        btn_1.add(jPanel12);
        jPanel12.setBounds(0, 0, 3, 44);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Update Player");
        btn_1.add(jLabel24);
        jLabel24.setBounds(46, 16, 100, 15);

        Side_Pane.add(btn_1);
        btn_1.setBounds(0, 80, 190, 44);

        jPanel1.add(Side_Pane);
        Side_Pane.setBounds(0, 0, 190, 880);

        jPanel3.setBackground(new java.awt.Color(120, 168, 252));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGE PLAYER");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 210, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(190, 0, 570, 50);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Jersey Number");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(220, 820, 94, 17);

        txt_jc1.setBackground(new java.awt.Color(71, 120, 197));
        txt_jc1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_jc1.setForeground(new java.awt.Color(255, 255, 255));
        txt_jc1.setOpaque(false);
        txt_jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jc1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_jc1);
        txt_jc1.setBounds(390, 810, 90, 30);

        agri_combo.setBackground(new java.awt.Color(71, 120, 197));
        agri_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1 ", "2 ", "3 ", "4 ", "5 ", "000", " " }));
        agri_combo.setOpaque(false);
        agri_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agri_comboActionPerformed(evt);
            }
        });
        jPanel1.add(agri_combo);
        agri_combo.setBounds(490, 460, 240, 30);

        posi_combo.setBackground(new java.awt.Color(71, 120, 197));
        posi_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forward", "Midfielder", "Right wing", "Left wing", "Defence", "Goal Keeper" }));
        posi_combo.setOpaque(false);
        jPanel1.add(posi_combo);
        posi_combo.setBounds(490, 510, 240, 30);

        reg_combo.setBackground(new java.awt.Color(71, 120, 197));
        reg_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        reg_combo.setOpaque(false);
        jPanel1.add(reg_combo);
        reg_combo.setBounds(550, 710, 180, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Is This Player Registered For The Team");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(220, 720, 253, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search By ID To Update");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 70, 170, 19);

        txt_name.setBackground(new java.awt.Color(71, 120, 197));
        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setOpaque(false);
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name);
        txt_name.setBounds(390, 120, 340, 30);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn);
        searchBtn.setBounds(590, 70, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 880);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        lbl_image.setBackground(new java.awt.Color(246, 240, 240));
        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddPlayer/chooseImage2.png"))); // NOI18N
        lbl_image.setOpaque(true);
        jPanel4.add(lbl_image);
        lbl_image.setBounds(40, 30, 250, 250);

        jButton4.setText("Choose Image");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(330, 250, 120, 30);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(71, 120, 197));
        jLabel28.setText("PLAYER ABILITY DETAILS");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(40, 340, 306, 29);

        jLabel29.setText("PAC");
        jPanel4.add(jLabel29);
        jLabel29.setBounds(40, 390, 30, 16);

        pacValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(pacValue);
        pacValue.setBounds(40, 420, 60, 50);

        jLabel30.setText("SHO");
        jPanel4.add(jLabel30);
        jLabel30.setBounds(40, 490, 30, 16);

        shoValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shoValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(shoValue);
        shoValue.setBounds(40, 520, 60, 50);

        jLabel31.setText("DEF");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(170, 390, 30, 16);

        defValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        defValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(defValue);
        defValue.setBounds(170, 420, 60, 50);

        jLabel32.setText("PAS");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(170, 490, 30, 16);

        pasValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pasValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(pasValue);
        pasValue.setBounds(170, 520, 60, 50);

        jLabel33.setText("DRI");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(300, 390, 30, 16);

        driValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        driValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(driValue);
        driValue.setBounds(300, 420, 60, 50);

        jLabel34.setText("PHY");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(300, 490, 30, 16);

        phyValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phyValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(phyValue);
        phyValue.setBounds(300, 520, 60, 50);

        jLabel36.setForeground(new java.awt.Color(71, 120, 197));
        jLabel36.setText("Make sure the details provided above are 100% at this time");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(40, 740, 341, 16);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(300, 780, 110, 35);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(170, 780, 110, 35);

        UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel4.add(UpdateBtn);
        UpdateBtn.setBounds(40, 780, 110, 35);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/minimize2.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel4.add(jLabel16);
        jLabel16.setBounds(390, 0, 50, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/close2.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel4.add(jLabel15);
        jLabel15.setBounds(440, 0, 50, 30);

        ovrValue.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ovrValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ovrValue);
        ovrValue.setBounds(40, 620, 100, 50);

        jLabel21.setText("OVR");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(40, 590, 30, 16);

        calcBtn.setBackground(new java.awt.Color(255, 255, 255));
        calcBtn.setText("Calculate");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });
        jPanel4.add(calcBtn);
        calcBtn.setBounds(190, 630, 170, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(760, 0, 490, 880);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIdActionPerformed

    private void dollarValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollarValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dollarValueActionPerformed

    private void txt_phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phnActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void txt_hgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hgtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hgtActionPerformed

    private void txt_wgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_wgtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_wgtActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed

    }//GEN-LAST:event_btn_1MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new HomeFinalOne().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
      
       

       
 
        
        try{
  
            String query;
           
            
            query= "UPDATE `players` SET `txt_name`=?,`txt_NIC`=?,`txt_clubID`=?,`txt_address`=?,`txt_phn`=?,`txt_mail`=?,`agri_combo`=?,`posi_combo`=?,`txt_hgt`=?,`txt_wgt`=?,`txt_dob`=?,`reg_combo`=?,`dollar_value`=?,`jersey_number`=?,`pacValue`=?,`driValue`=?,`shoValue`=?,`defValue`=?,`pasValue`=?,`phyValue`=?,`ovrValue`=? WHERE `player_id`="+pId.getText()+" " ;
            
            pst=conn.prepareStatement(query);
            
            pst.setString(1,txt_name.getText());
            pst.setString(2,txt_NIC.getText());
            pst.setString(3,txt_clubID.getText());
            pst.setString(4,txt_address.getText());
            pst.setString(5,txt_phn.getText());
            pst.setString(6,txt_mail.getText());
            pst.setString(7,agri_combo.getSelectedItem().toString());
            pst.setString(8,posi_combo.getSelectedItem().toString());
            pst.setString(9,txt_hgt.getText());
            pst.setString(10,txt_wgt.getText());
            pst.setString(11,txt_dob.getText());
            pst.setString(12,reg_combo.getSelectedItem().toString());
            pst.setString(13,dollarValue.getText());
            pst.setString(14,txt_jc1.getText());
            pst.setString(15,pacValue.getText());
            pst.setString(16,driValue.getText());
            pst.setString(17,shoValue.getText());
            pst.setString(18,defValue.getText());
            pst.setString(19,pasValue.getText());
            pst.setString(20,phyValue.getText());
            pst.setString(21,ovrValue.getText());
            

            
            pst.executeUpdate();
            
            pst.close();
            
            JOptionPane.showMessageDialog(null,"Updated Successfully !");
        
        
        
        }catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null, ex);
        
        }
        
        try{
            
            File file=new File(filename);
            FileInputStream fis=new FileInputStream(file);
            byte[] image =new byte[(int)file.length()];
            fis.read(image);
            
            String Image_Sql="UPDATE `players` SET `image`=? WHERE `player_id`="+pId.getText()+" ";
            pst =conn.prepareStatement(Image_Sql);
            
            pst.setBytes(1, image);
            pst.executeUpdate();
            pst.close();
        
        
        }catch(Exception ex){
             //JOptionPane.showMessageDialog(null, ex);
        }
            
        
        
        
        
        
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Login/closeIn.jpg"));
        jLabel15.setIcon(II);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Login/close2.png"));
        jLabel15.setIcon(II);
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimizeIn.jpg"));
        jLabel16.setIcon(II2);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimize2.png"));
        jLabel16.setIcon(II2);
    }//GEN-LAST:event_jLabel16MouseExited

    private void txt_jcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jcActionPerformed

    private void txt_jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jc1ActionPerformed

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed

        int pac=Integer.parseInt(pacValue.getText());
        int dri=Integer.parseInt(driValue.getText());
        int sho=Integer.parseInt(shoValue.getText());
        int def=Integer.parseInt(defValue.getText());
        int pas=Integer.parseInt(pasValue.getText());
        int phy=Integer.parseInt(phyValue.getText());

        int average= pac+dri+sho+def+pas+phy;
        int averageOvr=average/6;
        ovrValue.setText(Integer.toString(averageOvr));

    }//GEN-LAST:event_calcBtnActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
       
        InputStream input;
        FileOutputStream output;
        
        try{


           String upViewQuery; 
           
           upViewQuery= "SELECT `player_id`,`txt_name`, `txt_NIC`, `txt_clubID`, `txt_address`, `txt_phn`, `txt_mail`, `agri_combo`, `posi_combo`, `txt_hgt`, `txt_wgt`, `txt_dob`, `reg_combo`,`dollar_value`,`jersey_number`,`pacValue`, `driValue`, `shoValue`, `defValue`, `pasValue`, `phyValue`, `ovrValue`, `image` FROM `players` WHERE `player_id`="+pId.getText()+" ";
            
           pst = conn.prepareStatement(upViewQuery);

           ResultSet rs = pst.executeQuery(upViewQuery);
           
           File thefile=new File("image");
           output =new FileOutputStream(thefile);
        
     

           if(rs.next()){
           
               txt_name.setText(rs.getString("txt_name"));
               txt_NIC.setText(rs.getString("txt_NIC"));
               txt_clubID.setText(rs.getString("txt_clubID"));
               txt_address.setText(rs.getString("txt_address"));
               txt_phn.setText(rs.getString("txt_phn"));
               txt_mail.setText(rs.getString("txt_mail"));
               agri_combo.setSelectedIndex(rs.getInt("agri_combo"));
               posi_combo.setSelectedItem(rs.getString("posi_combo"));
               txt_hgt.setText(rs.getString("txt_hgt"));
               txt_wgt.setText(rs.getString("txt_wgt"));
               txt_dob.setText(rs.getString("txt_dob"));
               reg_combo.setSelectedItem(rs.getString("reg_combo"));
               dollarValue.setText(rs.getString("dollar_value"));
               txt_jc1.setText(rs.getString("jersey_number"));
               pacValue.setText(rs.getString("pacValue"));
               driValue.setText(rs.getString("driValue"));
               shoValue.setText(rs.getString("shoValue"));
               defValue.setText(rs.getString("defValue"));
               pasValue.setText(rs.getString("pasValue"));
               phyValue.setText(rs.getString("phyValue"));
               ovrValue.setText(rs.getString("ovrValue"));
                              
               //image is retriving 
               
              input= rs.getBinaryStream("image");
               byte buffer[]=new byte[10024];
               
               while(input.read(buffer)>0){
                   output.write(buffer);
               }
               
               String path=thefile.getAbsolutePath();
               ImageIcon myImage=new ImageIcon(path);
               Image img=myImage.getImage();
               Image newImg=img.getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon image=new ImageIcon(newImg);
               lbl_image.setIcon(image);
               
               pst.close();
       
           }else{
               JOptionPane.showMessageDialog(null, "Data not found please input a valid ID");
           }
             
           
            
        }catch(SQLException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Pls");
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdatePlayerFinalOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UpdatePlayerFinalOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed
       
   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename =f.getAbsolutePath();
        ImageIcon imageicon= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH));
        lbl_image.setIcon(imageicon);
        try{
            
            File image =new File(filename);
            FileInputStream fis =new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf = new byte[10024];
            
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            
            person_image=bos.toByteArray();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void agri_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agri_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agri_comboActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdatePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePlayerFinalOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Side_Pane;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JComboBox agri_combo;
    private javax.swing.JPanel btn_1;
    private javax.swing.JButton calcBtn;
    private javax.swing.JTextField defValue;
    private javax.swing.JTextField dollarValue;
    private javax.swing.JTextField driValue;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField ovrValue;
    private javax.swing.JTextField pId;
    private javax.swing.JTextField pacValue;
    private javax.swing.JTextField pasValue;
    private javax.swing.JTextField phyValue;
    private javax.swing.JComboBox posi_combo;
    private javax.swing.JComboBox reg_combo;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField shoValue;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_clubID;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_hgt;
    private javax.swing.JTextField txt_jc;
    private javax.swing.JTextField txt_jc1;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phn;
    private javax.swing.JTextField txt_wgt;
    // End of variables declaration//GEN-END:variables
}
