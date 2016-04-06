package SQL;
import Login.LoginGui;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Kamil
 */
public class Connect {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
        public static Connection ConnectDB(){
        try {
            Connection con=DriverManager.getConnection("jdbc:ucanaccess://Users.accdb");       
            return con;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        
    }
    }
        
   
    
}
