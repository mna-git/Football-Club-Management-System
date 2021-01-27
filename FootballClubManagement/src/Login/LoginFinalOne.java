
package Login;


import Home.HomeFinalOne;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class LoginFinalOne extends javax.swing.JFrame {
   
    
    
    Connection conn=null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    
    public LoginFinalOne() {
        initComponents();
        
        conn=DbConnection.connect();
        
        
        uName.setBackground(new Color(255,255,255,0));
        uPassword.setBackground(new Color(255,255,255,0));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lgnBtnLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        uPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 730));
        setMinimumSize(new java.awt.Dimension(1100, 730));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("USERNAME");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(110, 240, 101, 22);

        uName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        uName.setForeground(new java.awt.Color(255, 255, 255));
        uName.setBorder(null);
        uName.setOpaque(false);
        uName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                uNameMouseMoved(evt);
            }
        });
        jPanel1.add(uName);
        uName.setBounds(110, 280, 280, 30);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(110, 310, 280, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(110, 410, 280, 10);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PASSWORD");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 340, 104, 22);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FORGOT PASSWORD?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 530, 153, 17);

        lgnBtnLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/LoginBttn.png"))); // NOI18N
        lgnBtnLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lgnBtnLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgnBtnLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgnBtnLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgnBtnLblMouseExited(evt);
            }
        });
        jPanel1.add(lgnBtnLbl);
        lgnBtnLbl.setBounds(120, 440, 247, 50);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CLUB MANAGEMENT SYSTEM");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 580, 208, 17);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/password2.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 380, 30, 40);

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
        jLabel4.setBounds(1000, 0, 50, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/username3.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 280, 30, 40);

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
        jLabel6.setBounds(1050, 0, 50, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/homelogo 5.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(830, 180, 220, 320);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UNITED FOOTBALL CLUB");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(820, 470, 230, 70);

        uPassword.setBackground(new java.awt.Color(102, 102, 102));
        uPassword.setForeground(new java.awt.Color(255, 255, 255));
        uPassword.setBorder(null);
        uPassword.setOpaque(false);
        jPanel1.add(uPassword);
        uPassword.setBounds(110, 382, 280, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/login wallpaper 14.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uNameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uNameMouseMoved

    }//GEN-LAST:event_uNameMouseMoved

    private void lgnBtnLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnBtnLblMouseClicked
        
        if(uName==null || uPassword==null){
            JOptionPane.showMessageDialog(null, " Some fields are empty..! ");
        }
        else{
            
            
            try{
                
                 pst=conn.prepareStatement("select * from admin where user_name=? and user_password=?");

                        pst.setString(1,uName.getText());
                        pst.setString(2,uPassword.getText());

                        rs=pst.executeQuery();
            
                    if(rs.next()){



                        JOptionPane.showMessageDialog(null, " Login Success ");
                        new HomeFinalOne().setVisible(true);
                        this.setVisible(false);

                    }else{
                        JOptionPane.showMessageDialog(null, " Incorrect Password Or User Name...! ");
                    }
                
            
            } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, ex);
                }
            
            
            
        }
        
        
        
        
    }//GEN-LAST:event_lgnBtnLblMouseClicked

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

    private void lgnBtnLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnBtnLblMouseEntered
        
    }//GEN-LAST:event_lgnBtnLblMouseEntered

    private void lgnBtnLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnBtnLblMouseExited
        
    }//GEN-LAST:event_lgnBtnLblMouseExited

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
            java.util.logging.Logger.getLogger(LoginFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFinalOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFinalOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lgnBtnLbl;
    private javax.swing.JTextField uName;
    private javax.swing.JPasswordField uPassword;
    // End of variables declaration//GEN-END:variables
}
