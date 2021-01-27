/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferPlayer;

import Home.HomeFinalOne;
import RemovePlayer.RemovePlayerFinalOne;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class TransferPlayerFinalOne extends javax.swing.JFrame {

     Connection conn=null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    public TransferPlayerFinalOne() {
        initComponents();
        
        conn=DbConnection.connect();
    }

     static int daysBetween(Date d1,Date d2){
       
            return (int)((d1.getTime()-d2.getTime())/(1000*60*60*24));
         }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Side_Pane = new javax.swing.JPanel();
        btn_2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        pId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_val = new javax.swing.JTextField();
        txt_posi = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_hgt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_wgt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_ovr = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_image = new javax.swing.JLabel();
        transferBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_agri = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_addDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1130, 892));
        setMinimumSize(new java.awt.Dimension(1130, 892));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1130, 892));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1130, 890));
        jPanel1.setMinimumSize(new java.awt.Dimension(1130, 890));
        jPanel1.setLayout(null);

        Side_Pane.setBackground(new java.awt.Color(23, 35, 51));
        Side_Pane.setLayout(null);

        btn_2.setBackground(new java.awt.Color(41, 57, 80));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });
        btn_2.setLayout(null);

        jPanel13.setPreferredSize(new java.awt.Dimension(3, 44));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        btn_2.add(jPanel13);
        jPanel13.setBounds(0, 0, 3, 44);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Search Player");
        btn_2.add(jLabel25);
        jLabel25.setBounds(46, 16, 100, 15);

        Side_Pane.add(btn_2);
        btn_2.setBounds(0, 80, 190, 44);

        jPanel1.add(Side_Pane);
        Side_Pane.setBounds(0, 0, 190, 890);

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(120, 168, 252));
        jPanel4.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TRANSFER PLAYER");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 240, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 30, 370, 50);

        check.setBackground(new java.awt.Color(71, 120, 197));
        check.setText("Check For Availability");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel3.add(check);
        check.setBounds(30, 210, 170, 30);

        jLabel28.setForeground(new java.awt.Color(0, 0, 153));
        jLabel28.setText("Message will appear here if the Player is Available");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(30, 180, 290, 16);

        pId.setBackground(new java.awt.Color(71, 120, 197));
        pId.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        pId.setForeground(new java.awt.Color(255, 255, 255));
        pId.setText("Player ID");
        pId.setOpaque(false);
        pId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIdActionPerformed(evt);
            }
        });
        jPanel3.add(pId);
        pId.setBounds(30, 140, 310, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(23, 35, 51));
        jLabel17.setText("Who wants to be transfer");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(30, 90, 230, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(190, 0, 370, 890);

        jLabel30.setForeground(new java.awt.Color(71, 120, 197));
        jLabel30.setText("Make sure the details provided above are 100% at this time");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(590, 790, 341, 16);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("Player Value");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(590, 260, 120, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Player Position");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(590, 430, 100, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("DOB");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(590, 480, 100, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Height");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(590, 530, 100, 20);

        txt_val.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txt_val.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_val.setOpaque(false);
        jPanel1.add(txt_val);
        txt_val.setBounds(590, 290, 250, 40);

        txt_posi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_posi.setOpaque(false);
        jPanel1.add(txt_posi);
        txt_posi.setBounds(760, 420, 340, 30);

        txt_dob.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_dob.setOpaque(false);
        jPanel1.add(txt_dob);
        txt_dob.setBounds(760, 470, 340, 30);

        txt_hgt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_hgt.setOpaque(false);
        jPanel1.add(txt_hgt);
        txt_hgt.setBounds(760, 520, 340, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Weight");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(590, 580, 100, 20);

        txt_wgt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_wgt.setOpaque(false);
        jPanel1.add(txt_wgt);
        txt_wgt.setBounds(760, 570, 340, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("OVR Value");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(590, 630, 100, 20);

        txt_ovr.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_ovr.setOpaque(false);
        jPanel1.add(txt_ovr);
        txt_ovr.setBounds(760, 620, 340, 30);

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("Player Name");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(590, 380, 90, 20);

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_name.setOpaque(false);
        jPanel1.add(txt_name);
        txt_name.setBounds(760, 370, 340, 30);

        lbl_image.setBackground(new java.awt.Color(246, 240, 240));
        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddPlayer/chooseImage2.png"))); // NOI18N
        lbl_image.setOpaque(true);
        jPanel1.add(lbl_image);
        lbl_image.setBounds(860, 80, 250, 250);

        transferBtn.setBackground(new java.awt.Color(255, 255, 255));
        transferBtn.setText("Transfer");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });
        jPanel1.add(transferBtn);
        transferBtn.setBounds(590, 820, 110, 35);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(850, 820, 110, 35);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(720, 820, 110, 35);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/minimize2.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1030, 0, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/close2.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1080, 0, 50, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Agrement Duration");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(590, 680, 130, 20);

        txt_agri.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_agri.setOpaque(false);
        jPanel1.add(txt_agri);
        txt_agri.setBounds(760, 670, 340, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Added Date");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(590, 730, 130, 20);

        txt_addDate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_addDate.setOpaque(false);
        jPanel1.add(txt_addDate);
        txt_addDate.setBounds(760, 720, 340, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 890);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2MousePressed

    private void pIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIdActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
      
        
         InputStream input;
        FileOutputStream output;
        
        try{
            
       // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_management?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); 
            
         // int pId = Integer.parseInt(playerId.getText());

           String viewQuery;   //`player_id`='"+pId+"'
           
           viewQuery= "SELECT `txt_name`, `dollar_value`, `posi_combo`,`txt_dob`,`txt_hgt`,`txt_wgt`,`ovrValue`,`agri_combo`,`txt_addDate`,`image` FROM `players` WHERE `player_id`="+pId.getText()+" ";
            
           pst = conn.prepareStatement(viewQuery);

           ResultSet rs = pst.executeQuery(viewQuery);
           
           File thefile=new File("Mr mna.png");
           output =new FileOutputStream(thefile);

           if(rs.next()){
           
               txt_val.setText(rs.getString("dollar_value"));
               txt_name.setText(rs.getString("txt_name"));      
               txt_posi.setText(rs.getString("posi_combo"));
               txt_dob.setText(rs.getString("txt_dob"));
               txt_hgt.setText(rs.getString("txt_hgt"));
               txt_wgt.setText(rs.getString("txt_wgt"));
               txt_ovr.setText(rs.getString("ovrValue"));
               txt_agri.setText(rs.getString("agri_combo"));
               txt_addDate.setText(rs.getString("txt_addDate"));
               
    
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
                
           }else{
               JOptionPane.showMessageDialog(null, "Data not found please input a valid ID");
           }
             
           
            
        }catch(SQLException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Pls");
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RemovePlayerFinalOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RemovePlayerFinalOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_checkActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new HomeFinalOne().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimizeIn.jpg"));
        jLabel4.setIcon(II2);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimize2.png"));
        jLabel4.setIcon(II2);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Login/closeIn.jpg"));
        jLabel6.setIcon(II);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Login/close2.png"));
        jLabel6.setIcon(II);
    }//GEN-LAST:event_jLabel6MouseExited


    
    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
      
        // if agrement duration ==0 just do the transfer(working)
        //|| agri==1 || agri==2 || agri==3 || agri==4 || agri==5 || agri==10
        
        int agri=Integer.parseInt(txt_agri.getText());
        
        //if agreement duration =0
        
        if(agri==0){
            
             try{
                 
                 String transferQuery;
                 
                 transferQuery=" INSERT INTO `income`(`incAmount`) VALUES (?) ";
                 
                 pst=conn.prepareStatement(transferQuery);
                 
                 pst.setString(1,txt_val.getText());
                 
                 pst.executeUpdate();
                 
       
            String deleteQuery;
            
            deleteQuery = "DELETE FROM `players` WHERE `player_id`="+pId.getText()+"";
            
            pst = conn.prepareStatement(deleteQuery);

            pst.executeUpdate();
            
            pst.close();
            
           JOptionPane.showMessageDialog(null, "Player is transfered and Deleted From System Database !");
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
                  
        }else{
        
        //if agreement duration =1
        
        if(agri==1){
            
           ZoneId z=ZoneId.of("Asia/Colombo");
        LocalDate today=LocalDate.now(z);
        
        String currentDate=today.toString();
        
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
        
        String firstDate1 =txt_addDate.getText();
        String secondDate1 =currentDate;
        
        try{
            
            java.util.Date firstDate = myformat.parse(firstDate1);
            java.util.Date secondDate = myformat.parse(secondDate1);
            
            long dif = secondDate.getTime()- firstDate.getTime();
            
            int daysBetween =(int) (dif/(1000*60*60*24));
            
            
            //answer wil be the difference between your current date and the date you provided in the jTextField1
           // System.out.println(daysBetween);
            
            if(daysBetween>=365){
                
                try{
                 
                 String transferQuery1;
                 
                 transferQuery1=" INSERT INTO `income`(`incAmount`) VALUES (?) ";
                 
                 pst=conn.prepareStatement(transferQuery1);
                 
                 pst.setString(1,txt_val.getText());
                 
                 pst.executeUpdate();
                 
       
                        String deleteQuery1;

                        deleteQuery1 = "DELETE FROM `players` WHERE `player_id`="+pId.getText()+"";

                        pst = conn.prepareStatement(deleteQuery1);

                        pst.executeUpdate();

                        pst.close();

                       JOptionPane.showMessageDialog(null, "Player is transfered and Deleted From System Database !");
        
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                
            
            }else{
            
                System.out.print("agrimrnt still on process");
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
          
        }
        else{
    
        //if agriment duration =2
        
         if(agri==2){
            
           ZoneId z2=ZoneId.of("Asia/Colombo");
        LocalDate today2=LocalDate.now(z2);
        
        String currentDate2=today2.toString();
        
        SimpleDateFormat myformat2=new SimpleDateFormat("yyyy-MM-dd");
        
        String firstDate12 =txt_addDate.getText();
        String secondDate12 =currentDate2;
        
        try{
            
            java.util.Date firstDate2 = myformat2.parse(firstDate12);
            java.util.Date secondDate2 = myformat2.parse(secondDate12);
            
            long dif = secondDate2.getTime()- firstDate2.getTime();
            
            int daysBetween =(int) (dif/(1000*60*60*24));
            
            
            //answer wil be the difference between your current date and the date you provided in the jTextField1
           // System.out.println(daysBetween);
            
            if(daysBetween>=730){
                
                try{
                 
                 String transferQuery1;
                 
                 transferQuery1=" INSERT INTO `income`(`incAmount`) VALUES (?) ";
                 
                 pst=conn.prepareStatement(transferQuery1);
                 
                 pst.setString(1,txt_val.getText());
                 
                 pst.executeUpdate();
                 
       
                        String deleteQuery1;

                        deleteQuery1 = "DELETE FROM `players` WHERE `player_id`="+pId.getText()+"";

                        pst = conn.prepareStatement(deleteQuery1);

                        pst.executeUpdate();

                        pst.close();

                       JOptionPane.showMessageDialog(null, "Player is transfered and Deleted From System Database !");
        
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                
            
            }else{
            //System.out.print("agrimrnt still on process");
                JOptionPane.showMessageDialog(null, "The Player Cannot Be transfered Until the Agreement get Expire");
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
                 
            
        }
         else{
         
         //if agreement duration =3
         
          if(agri==3){
            
           ZoneId z3=ZoneId.of("Asia/Colombo");
        LocalDate today3=LocalDate.now(z3);
        
        String currentDate3=today3.toString();
        
        SimpleDateFormat myformat3=new SimpleDateFormat("yyyy-MM-dd");
        
        String firstDate13 =txt_addDate.getText();
        String secondDate13 =currentDate3;
        
        try{
            
            java.util.Date firstDate3 = myformat3.parse(firstDate13);
            java.util.Date secondDate3 = myformat3.parse(secondDate13);
            
            long dif = secondDate3.getTime()- firstDate3.getTime();
            
            int daysBetween =(int) (dif/(1000*60*60*24));
            
            
            //answer wil be the difference between your current date and the date you provided in the jTextField1
           // System.out.println(daysBetween);
            
            if(daysBetween>=1095){
                
                try{
                 
                 String transferQuery1;
                 
                 transferQuery1=" INSERT INTO `income`(`incAmount`) VALUES (?) ";
                 
                 pst=conn.prepareStatement(transferQuery1);
                 
                 pst.setString(1,txt_val.getText());
                 
                 pst.executeUpdate();
                 
       
                        String deleteQuery1;

                        deleteQuery1 = "DELETE FROM `players` WHERE `player_id`="+pId.getText()+"";

                        pst = conn.prepareStatement(deleteQuery1);

                        pst.executeUpdate();

                        pst.close();

                       JOptionPane.showMessageDialog(null, "Player is transfered and Deleted From System Database !");
        
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                
            
            }else{
            
                JOptionPane.showMessageDialog(null, "The Player Cannot Be transfered Until the Agreement get Expire");
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
          }else{
        //agremment duration =4
        
         if(agri==4){
            
           ZoneId z4=ZoneId.of("Asia/Colombo");
        LocalDate today4=LocalDate.now(z4);
        
        String currentDate4=today4.toString();
        
        SimpleDateFormat myformat4=new SimpleDateFormat("yyyy-MM-dd");
        
        String firstDate14 =txt_addDate.getText();
        String secondDate14 =currentDate4;
        
        try{
            
            java.util.Date firstDate4 = myformat4.parse(firstDate14);
            java.util.Date secondDate4 = myformat4.parse(secondDate14);
            
            long dif = secondDate4.getTime()- firstDate4.getTime();
            
            int daysBetween =(int) (dif/(1000*60*60*24));
            
            
            //answer wil be the difference between your current date and the date you provided in the jTextField1
           // System.out.println(daysBetween);
            
            if(daysBetween>=1460){
                
                try{
                 
                 String transferQuery1;
                 
                 transferQuery1=" INSERT INTO `income`(`incAmount`) VALUES (?) ";
                 
                 pst=conn.prepareStatement(transferQuery1);
                 
                 pst.setString(1,txt_val.getText());
                 
                 pst.executeUpdate();
                 
       
                        String deleteQuery1;

                        deleteQuery1 = "DELETE FROM `players` WHERE `player_id`="+pId.getText()+"";

                        pst = conn.prepareStatement(deleteQuery1);

                        pst.executeUpdate();

                        pst.close();

                       JOptionPane.showMessageDialog(null, "Player is transfered and Deleted From System Database !");
        
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                
            
            }else{
            
                JOptionPane.showMessageDialog(null, "The Player Cannot Be transfered Until the Agreement get Expire");
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
         }else{
        //if agrement duration =5
        
         if(agri==5){
            
           ZoneId z5=ZoneId.of("Asia/Colombo");
        LocalDate today5=LocalDate.now(z5);
        
        String currentDate5=today5.toString();
        
        SimpleDateFormat myformat5=new SimpleDateFormat("yyyy-MM-dd");
        
        String firstDate15 =txt_addDate.getText();
        String secondDate15 =currentDate5;
        
        try{
            
            java.util.Date firstDate5 = myformat5.parse(firstDate15);
            java.util.Date secondDate5 = myformat5.parse(secondDate15);
            
            long dif = secondDate5.getTime()- firstDate5.getTime();
            
            int daysBetween =(int) (dif/(1000*60*60*24));
            
            
            //answer wil be the difference between your current date and the date you provided in the jTextField1
           // System.out.println(daysBetween);
            
            if(daysBetween>=1825){
                
                try{
                 
                 String transferQuery1;
                 
                 transferQuery1=" INSERT INTO `income`(`incAmount`) VALUES (?) ";
                 
                 pst=conn.prepareStatement(transferQuery1);
                 
                 pst.setString(1,txt_val.getText());
                 
                 pst.executeUpdate();
                 
       
                        String deleteQuery1;

                        deleteQuery1 = "DELETE FROM `players` WHERE `player_id`="+pId.getText()+"";

                        pst = conn.prepareStatement(deleteQuery1);

                        pst.executeUpdate();

                        pst.close();

                       JOptionPane.showMessageDialog(null, "Player is transfered and Deleted From System Database !");
        
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                
            
            }else{
            
                JOptionPane.showMessageDialog(null, "The Player Cannot Be transfered Until the Agreement get Expire");
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
    }else{ 
             if(agri==000){
             
            JOptionPane.showMessageDialog(null, "Player is a club life time agreement holder");
         }
         }
    }//GEN-LAST:event_transferBtnActionPerformed
          }
         }
        }
        }
        
        
        
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(TransferPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferPlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferPlayerFinalOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Side_Pane;
    private javax.swing.JPanel btn_2;
    private javax.swing.JButton check;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField pId;
    private javax.swing.JButton transferBtn;
    private javax.swing.JTextField txt_addDate;
    private javax.swing.JTextField txt_agri;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_hgt;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_ovr;
    private javax.swing.JTextField txt_posi;
    private javax.swing.JTextField txt_val;
    private javax.swing.JTextField txt_wgt;
    // End of variables declaration//GEN-END:variables
}
