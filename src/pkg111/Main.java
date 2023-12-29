/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg111;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param
     */
    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt ){
        
        String un=user.getText();
        String p=pass.getText();
                try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","#Iamthe5"); 
            Statement st=(Statement) con.createStatement();
            String sql="Select * from user-login";
            
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                String username = rs.getString("username");
                String password=rs.getString("password");
                
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    
    
    
    
   public static void main(String[] args) {
        
   
    }
   
   
   
   
   
}
