/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author M.N.Ahmad Ashfaq
 */
public class DbConnection {
    
    public static Connection connect(){
    
        Connection conn=null;
        
        try{
            
            //manual driver installion is unwanted
           // Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_management?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            
            Component rootPane=null;
            
            //JOptionPane.showDialogMessage(null);
            System.out.print("Connected");
        
        
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        
        
        return conn;
        
    }
    
}
