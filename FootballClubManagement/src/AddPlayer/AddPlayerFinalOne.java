/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddPlayer;

import Home.HomeFinalOne;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




public class AddPlayerFinalOne extends javax.swing.JFrame {
    
     Connection conn=null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    
    //j file chooser for image
    
    private final ImageIcon format = null;
    
    String filename=null;
    int s=0;
    byte[] person_image=null;

   
    public AddPlayerFinalOne() {
        initComponents();
        
        conn=DbConnection.connect();
    }
    
//    String imgPath = null;
// 
//    // Function To Resize The Image To Fit Into JLabel
//     public ImageIcon ResizeImage(String ImagePath, byte[] pic)
//    {
//        ImageIcon MyImage = null;
//        if(ImagePath != null)
//        {
//           MyImage = new ImageIcon(ImagePath);
//        }else
//        {
//            MyImage = new ImageIcon(pic);
//        }
//        Image img = MyImage.getImage();
//        Image newImg = img.getScaledInstance(lbl_Image.getWidth(), lbl_Image.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImg);
//        return image;
//    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel13 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_clubID = new javax.swing.JTextField();
        dollarValue = new javax.swing.JTextField();
        txt_phn = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        reg_combo = new javax.swing.JComboBox();
        agri_combo = new javax.swing.JComboBox();
        txt_hgt = new javax.swing.JTextField();
        txt_wgt = new javax.swing.JTextField();
        posi_combo = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        txt_addedDate = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        Side_Pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_jc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl_Image = new javax.swing.JLabel();
        imageChooser = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pacValue = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        shoValue = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        defValue = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        pasValue = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        driValue = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phyValue = new javax.swing.JTextField();
        ovrValue = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        calcBtn = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 901));
        setMinimumSize(new java.awt.Dimension(1250, 901));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 901));
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

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Is This Player Registered For The Team");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(220, 720, 253, 17);

        txt_address.setBackground(new java.awt.Color(71, 120, 197));
        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_address.setForeground(new java.awt.Color(255, 255, 255));
        txt_address.setOpaque(false);
        jPanel1.add(txt_address);
        txt_address.setBounds(390, 270, 340, 70);

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

        reg_combo.setBackground(new java.awt.Color(71, 120, 197));
        reg_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        reg_combo.setOpaque(false);
        jPanel1.add(reg_combo);
        reg_combo.setBounds(550, 710, 180, 30);

        agri_combo.setBackground(new java.awt.Color(71, 120, 197));
        agri_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1 ", "2 ", "3 ", "4 ", "5 ", "000", " " }));
        agri_combo.setOpaque(false);
        jPanel1.add(agri_combo);
        agri_combo.setBounds(490, 460, 240, 30);

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

        posi_combo.setBackground(new java.awt.Color(71, 120, 197));
        posi_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forward", "Midfielder", "Right wing", "Left wing", "Defence", "Goal Keeper" }));
        posi_combo.setOpaque(false);
        jPanel1.add(posi_combo);
        posi_combo.setBounds(490, 510, 240, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Player Position");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(220, 520, 94, 17);

        txt_addedDate.setBackground(new java.awt.Color(71, 120, 197));
        txt_addedDate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_addedDate.setForeground(new java.awt.Color(255, 255, 255));
        txt_addedDate.setOpaque(false);
        txt_addedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addedDateActionPerformed(evt);
            }
        });
        jPanel1.add(txt_addedDate);
        txt_addedDate.setBounds(390, 860, 340, 30);

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
        jLabel24.setText("Add Player");
        btn_1.add(jLabel24);
        jLabel24.setBounds(46, 16, 70, 15);

        Side_Pane.add(btn_1);
        btn_1.setBounds(0, 80, 190, 44);

        jPanel1.add(Side_Pane);
        Side_Pane.setBounds(0, 0, 190, 900);

        jPanel3.setBackground(new java.awt.Color(120, 168, 252));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGE PLAYER");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 210, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(190, 30, 570, 50);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Jersey Number");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(220, 820, 94, 17);

        txt_jc.setBackground(new java.awt.Color(71, 120, 197));
        txt_jc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_jc.setForeground(new java.awt.Color(255, 255, 255));
        txt_jc.setOpaque(false);
        txt_jc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jcActionPerformed(evt);
            }
        });
        jPanel1.add(txt_jc);
        txt_jc.setBounds(390, 810, 90, 30);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Today's Date");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(220, 870, 84, 17);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 900);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        lbl_Image.setBackground(new java.awt.Color(246, 240, 240));
        lbl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddPlayer/chooseImage2.png"))); // NOI18N
        lbl_Image.setOpaque(true);
        jPanel4.add(lbl_Image);
        lbl_Image.setBounds(40, 30, 250, 250);

        imageChooser.setBackground(new java.awt.Color(255, 255, 255));
        imageChooser.setText("Choose Image");
        imageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageChooserActionPerformed(evt);
            }
        });
        jPanel4.add(imageChooser);
        imageChooser.setBounds(330, 250, 120, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 120, 197));
        jLabel14.setText("PLAYER ABILITY DETAILS");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(40, 340, 306, 29);

        jLabel15.setText("PAC");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(40, 390, 30, 16);

        pacValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(pacValue);
        pacValue.setBounds(40, 420, 60, 50);

        jLabel18.setText("SHO");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(40, 490, 30, 16);

        shoValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shoValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(shoValue);
        shoValue.setBounds(40, 520, 60, 50);

        jLabel16.setText("DEF");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(170, 390, 30, 16);

        defValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        defValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(defValue);
        defValue.setBounds(170, 420, 60, 50);

        jLabel19.setText("PAS");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(170, 490, 30, 16);

        pasValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pasValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(pasValue);
        pasValue.setBounds(170, 520, 60, 50);

        jLabel17.setText("DRI");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(300, 390, 30, 16);

        driValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        driValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(driValue);
        driValue.setBounds(300, 420, 60, 50);

        jLabel20.setText("PHY");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(300, 490, 30, 16);

        phyValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phyValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(phyValue);
        phyValue.setBounds(300, 520, 60, 50);

        ovrValue.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ovrValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ovrValue);
        ovrValue.setBounds(40, 620, 100, 50);

        jLabel21.setText("OVR");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(40, 590, 30, 16);

        jLabel22.setForeground(new java.awt.Color(71, 120, 197));
        jLabel22.setText("Make sure the details provided above are 100% at this time");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(40, 750, 341, 16);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(300, 790, 110, 35);

        AddBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel4.add(AddBtn);
        AddBtn.setBounds(40, 790, 110, 35);

        calcBtn.setBackground(new java.awt.Color(255, 255, 255));
        calcBtn.setText("Calculate");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });
        jPanel4.add(calcBtn);
        calcBtn.setBounds(190, 630, 170, 40);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/minimize2.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        jPanel4.add(jLabel29);
        jLabel29.setBounds(390, 0, 50, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/close2.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel4.add(jLabel28);
        jLabel28.setBounds(440, 0, 50, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(170, 790, 110, 35);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(760, 0, 490, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void txt_addedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addedDateActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        

    }//GEN-LAST:event_btn_1MousePressed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        try{
            
         //   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_management?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            
            
            String query;
           
            
            query= "INSERT INTO `players`(`txt_name`, `txt_NIC`, `txt_clubID`, `txt_address`, `txt_phn`, `txt_mail`, `agri_combo`, `posi_combo`, `txt_hgt`, `txt_wgt`, `txt_dob`, `reg_combo`,`dollar_value`,`jersey_number`,`txt_addDate`, `pacValue`, `driValue`, `shoValue`, `defValue`, `pasValue`, `phyValue`, `ovrValue`, `image`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
            
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
            pst.setString(14,txt_jc.getText());
            pst.setString(15,txt_addedDate.getText());
            pst.setString(16,pacValue.getText());
            pst.setString(17,driValue.getText());
            pst.setString(18,shoValue.getText());
            pst.setString(19,defValue.getText());
            pst.setString(20,pasValue.getText());
            pst.setString(21,phyValue.getText());
            pst.setString(22,ovrValue.getText());
            
            
            pst.setBytes(23, person_image);
            
//            InputStream img = new FileInputStream(new File(imgPath));
//            pst.setBlob(23, img);
            
            
            pst.executeUpdate();
            
            pst.close();
            JOptionPane.showMessageDialog(null,"Addedd !");
        
        }catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null, ex);
        
        }
        
        
    }//GEN-LAST:event_AddBtnActionPerformed

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeFinalOne().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Login/closeIn.jpg"));
        jLabel28.setIcon(II);
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Login/close2.png"));
        jLabel28.setIcon(II);
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimizeIn.jpg"));
        jLabel29.setIcon(II2);
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimize2.png"));
        jLabel29.setIcon(II2);
    }//GEN-LAST:event_jLabel29MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
            txt_name.setText("");
            txt_NIC.setText("");
            txt_clubID.setText("");
            txt_address.setText("");
            txt_phn.setText("");
            txt_mail.setText("");
            agri_combo.setSelectedItem("");
            posi_combo.setSelectedItem("");
            txt_hgt.setText("");
            txt_wgt.setText("");
            txt_dob.setText("");
            reg_combo.setSelectedItem("");
            dollarValue.setText("");
            txt_jc.setText("");
            txt_addedDate.setText("");
            pacValue.setText("");
            driValue.setText("");
            shoValue.setText("");
            defValue.setText("");
            pasValue.setText("");
            phyValue.setText("");
            ovrValue.setText("");
            
            
            lbl_Image.setIcon(null);
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_jcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jcActionPerformed

    private void imageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageChooserActionPerformed
       
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename =f.getAbsolutePath();
        ImageIcon imageicon= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_Image.getWidth(), lbl_Image.getHeight(), Image.SCALE_SMOOTH));
        lbl_Image.setIcon(imageicon);
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
        // browse image
        
//        JFileChooser file = new JFileChooser();
//        file.setCurrentDirectory(new File(System.getProperty("user.home")));
//        //filter the files
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
//        file.addChoosableFileFilter(filter);
//        int result = file.showSaveDialog(null);
//        //if the user click on save in Jfilechooser
//        if(result == JFileChooser.APPROVE_OPTION){
//            
//            File selectedFile = file.getSelectedFile();
//            String path = selectedFile.getAbsolutePath();
//            lbl_Image.setIcon(ResizeImage(path,null));
//            
//            imgPath = path;
//        }
//        //if the user click on save in Jfilechooser
//
//        else if(result == JFileChooser.CANCEL_OPTION){
//            System.out.println("No File Select");
//        }
//    
        
        
        
    }//GEN-LAST:event_imageChooserActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

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
            java.util.logging.Logger.getLogger(AddPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlayerFinalOne().setVisible(true);
            }
        });
    }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel Side_Pane;
    private javax.swing.JComboBox agri_combo;
    private javax.swing.JPanel btn_1;
    private javax.swing.JButton calcBtn;
    private javax.swing.JTextField defValue;
    private javax.swing.JTextField dollarValue;
    private javax.swing.JTextField driValue;
    private javax.swing.JButton imageChooser;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lbl_Image;
    private javax.swing.JTextField ovrValue;
    private javax.swing.JTextField pacValue;
    private javax.swing.JTextField pasValue;
    private javax.swing.JTextField phyValue;
    private javax.swing.JComboBox posi_combo;
    private javax.swing.JComboBox reg_combo;
    private javax.swing.JTextField shoValue;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_addedDate;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_clubID;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_hgt;
    private javax.swing.JTextField txt_jc;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phn;
    private javax.swing.JTextField txt_wgt;
    // End of variables declaration//GEN-END:variables
}
