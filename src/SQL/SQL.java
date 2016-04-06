package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klasecki
 */

public class SQL {
    static Connection con = Connect.ConnectDB();
    static ResultSet rs = null;
    static PreparedStatement pst = null;
    
    public static ResultSet run(String sql) {
           
        try {
            pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = pst.executeQuery();               
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return rs;
    }

    
    public static void update(String sql){
        
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();

            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }
    
}
