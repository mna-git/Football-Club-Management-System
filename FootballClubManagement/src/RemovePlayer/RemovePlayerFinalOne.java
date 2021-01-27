
package RemovePlayer;

import Home.HomeFinalOne;
import java.awt.Image;
import java.io.File;
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
import javax.swing.JOptionPane;


public class RemovePlayerFinalOne extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    
    public RemovePlayerFinalOne() {
        initComponents();
        
        conn=DbConnection.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Side_Pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_nic = new javax.swing.JTextField();
        txt_pId = new javax.swing.JTextField();
        txt_posi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txt_sho = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_pac = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_dri = new javax.swing.JTextField();
        txt_def = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_pas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_phy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ovr = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1220, 810));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        jLabel24.setText("Player Data");
        btn_1.add(jLabel24);
        jLabel24.setBounds(46, 16, 100, 15);

        Side_Pane.add(btn_1);
        btn_1.setBounds(0, 310, 190, 44);

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
        btn_2.setBounds(0, 110, 190, 44);

        jPanel1.add(Side_Pane);
        Side_Pane.setBounds(0, 0, 190, 810);

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(120, 168, 252));
        jPanel4.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REMOVE PLAYER");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 210, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 30, 570, 50);

        jPanel5.setBackground(new java.awt.Color(84, 127, 206));
        jPanel5.setLayout(null);

        txt_nic.setBackground(new java.awt.Color(71, 120, 197));
        txt_nic.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_nic.setForeground(new java.awt.Color(255, 255, 255));
        txt_nic.setOpaque(false);
        jPanel5.add(txt_nic);
        txt_nic.setBounds(200, 440, 340, 30);

        txt_pId.setBackground(new java.awt.Color(71, 120, 197));
        txt_pId.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_pId.setForeground(new java.awt.Color(255, 255, 255));
        txt_pId.setOpaque(false);
        jPanel5.add(txt_pId);
        txt_pId.setBounds(200, 390, 340, 30);

        txt_posi.setBackground(new java.awt.Color(71, 120, 197));
        txt_posi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_posi.setForeground(new java.awt.Color(255, 255, 255));
        txt_posi.setOpaque(false);
        jPanel5.add(txt_posi);
        txt_posi.setBounds(200, 340, 340, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Player Position");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(30, 350, 100, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Player ID");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(30, 400, 100, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NIC Number");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(30, 450, 100, 20);

        txt_name.setBackground(new java.awt.Color(71, 120, 197));
        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setOpaque(false);
        jPanel5.add(txt_name);
        txt_name.setBounds(200, 290, 340, 30);

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Player Name");
        jPanel5.add(jLabel27);
        jLabel27.setBounds(30, 300, 90, 20);

        lbl_image.setBackground(new java.awt.Color(71, 120, 197));
        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddPlayer/chooseImage3.png"))); // NOI18N
        lbl_image.setOpaque(true);
        jPanel5.add(lbl_image);
        lbl_image.setBounds(290, 20, 250, 250);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(0, 310, 570, 500);

        jPanel6.setBackground(new java.awt.Color(84, 127, 206));
        jPanel6.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(23, 35, 51));
        jLabel29.setText("Who wants to be remove");
        jPanel6.add(jLabel29);
        jLabel29.setBounds(20, 10, 230, 40);

        txtPid.setBackground(new java.awt.Color(71, 120, 197));
        txtPid.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPid.setForeground(new java.awt.Color(255, 255, 255));
        txtPid.setOpaque(false);
        txtPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPidActionPerformed(evt);
            }
        });
        jPanel6.add(txtPid);
        txtPid.setBounds(20, 60, 310, 30);

        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("Please Use a valid Players ID");
        jPanel6.add(jLabel30);
        jLabel30.setBounds(20, 100, 290, 16);

        btnSearch.setBackground(new java.awt.Color(71, 120, 197));
        btnSearch.setText("Check For Availability");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel6.add(btnSearch);
        btnSearch.setBounds(20, 130, 170, 30);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(0, 110, 570, 170);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(190, 0, 570, 810);

        txt_sho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_sho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_sho);
        txt_sho.setBounds(800, 330, 60, 50);

        jLabel19.setText("SHO");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(800, 300, 30, 16);

        txt_pac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_pac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_pac);
        txt_pac.setBounds(800, 230, 60, 50);

        jLabel18.setText("PAC");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(800, 200, 30, 16);

        jLabel22.setText("DEF");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(930, 200, 30, 16);

        jLabel23.setText("DRI");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1060, 200, 30, 16);

        txt_dri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_dri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_dri);
        txt_dri.setBounds(1060, 230, 60, 50);

        txt_def.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_def.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_def);
        txt_def.setBounds(930, 230, 60, 50);

        jLabel20.setText("PAS");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(930, 300, 30, 16);

        txt_pas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_pas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_pas);
        txt_pas.setBounds(930, 330, 60, 50);

        jLabel26.setText("PHY");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(1090, 300, 30, 16);

        txt_phy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_phy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_phy);
        txt_phy.setBounds(1060, 330, 60, 50);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(71, 120, 197));
        jLabel16.setText("PLAYER ABILITY DETAILS");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(800, 150, 306, 29);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1060, 660, 110, 35);

        jLabel28.setForeground(new java.awt.Color(71, 120, 197));
        jLabel28.setText("Make sure the details provided above are 100% at this time");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(800, 620, 341, 16);

        removeBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(removeBtn);
        removeBtn.setBounds(800, 660, 110, 35);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(930, 660, 110, 35);

        jLabel1.setBackground(new java.awt.Color(71, 120, 197));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 20, 250, 250);

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
        jLabel6.setBounds(1170, 0, 50, 30);

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
        jLabel4.setBounds(1120, 0, 50, 30);

        txt_ovr.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txt_ovr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_ovr);
        txt_ovr.setBounds(800, 430, 100, 50);

        jLabel21.setText("OVR");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(800, 400, 30, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1220, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed

    }//GEN-LAST:event_btn_1MousePressed

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HomeFinalOne().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        
        // remove code
        
        
        
        try{
            
         //   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_management?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            
            
            
            String deleteQuery;
            
            deleteQuery = "DELETE FROM `players` WHERE `player_id`="+txtPid.getText()+"";
            
            pst = conn.prepareStatement(deleteQuery);

            pst.executeUpdate();
            
            
           JOptionPane.showMessageDialog(null, "Player Details are Deleted !");
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }//GEN-LAST:event_removeBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               txt_name.setText("");
               txt_pId.setText("");
               txt_posi.setText("");
               txt_nic.setText("");
               
               txt_pac.setText("");
               txt_dri.setText("");
               txt_sho.setText("");
               txt_def.setText("");
               txt_pas.setText("");
               txt_phy.setText("");
               
               txt_ovr.setText("");
               
               lbl_image.setIcon(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPidActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
        InputStream input;
        FileOutputStream output;
        
        try{
            
       // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_management?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); 
            
         // int pId = Integer.parseInt(playerId.getText());

           String viewQuery;   //`player_id`='"+pId+"'
           
           viewQuery= "SELECT `txt_name`, `txt_clubID`, `posi_combo`,`txt_NIC`,`pacValue`, `driValue`, `shoValue`, `defValue`, `pasValue`, `phyValue`, `ovrValue`,`image` FROM `players` WHERE `player_id`="+txtPid.getText()+" ";
            
           pst = conn.prepareStatement(viewQuery);

           ResultSet rs = pst.executeQuery(viewQuery);
           
           File thefile=new File("Mr mna.png");
           output =new FileOutputStream(thefile);

           if(rs.next()){
           
               txt_name.setText(rs.getString("txt_name"));
               txt_pId.setText(rs.getString("txt_clubID"));
               txt_posi.setText(rs.getString("posi_combo"));
               txt_nic.setText(rs.getString("txt_NIC"));
               
               txt_pac.setText(rs.getString("pacValue"));
               txt_dri.setText(rs.getString("driValue"));
               txt_sho.setText(rs.getString("shoValue"));
               txt_def.setText(rs.getString("defValue"));
               txt_pas.setText(rs.getString("pasValue"));
               txt_phy.setText(rs.getString("phyValue"));
               
               txt_ovr.setText(rs.getString("ovrValue"));
               
               
               //image is not retriving 
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
        
        
        
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

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

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimizeIn.jpg"));
        jLabel4.setIcon(II2);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        ImageIcon II2 = new ImageIcon(getClass().getResource("/Login/minimize2.png"));
        jLabel4.setIcon(II2);
    }//GEN-LAST:event_jLabel4MouseExited

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
            java.util.logging.Logger.getLogger(RemovePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemovePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemovePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemovePlayerFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemovePlayerFinalOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Side_Pane;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txt_def;
    private javax.swing.JTextField txt_dri;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_ovr;
    private javax.swing.JTextField txt_pId;
    private javax.swing.JTextField txt_pac;
    private javax.swing.JTextField txt_pas;
    private javax.swing.JTextField txt_phy;
    private javax.swing.JTextField txt_posi;
    private javax.swing.JTextField txt_sho;
    // End of variables declaration//GEN-END:variables
}
