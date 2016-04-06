package Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import main.*;
import SQL.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Kamil
 */
public class LoginGui extends javax.swing.JFrame {

    /**
     * Creates new form LoginGui
     */
    public LoginGui() {
        initComponents();
        //This would be better:
         this.setLocationRelativeTo(null);
        // Determine the new location of the window
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //int w = this.getSize().width;
        //int h = this.getSize().height;
       // int x = (dim.width-w)/2;
        //int y = (dim.height-h)/2;
        // Move the window
        //this.setLocation(x, y);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();
        BTlogin = new javax.swing.JButton();
        LBwarning = new javax.swing.JLabel();
        bAddUser = new javax.swing.JButton();
        PFpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(525, 310));
        setMinimumSize(new java.awt.Dimension(525, 310));
        setPreferredSize(new java.awt.Dimension(20, 32));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 80, 60, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 110, 60, 20);

        TFusername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TFusername);
        TFusername.setBounds(180, 80, 87, 20);

        BTlogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTlogin.setText("Login");
        BTlogin.setMaximumSize(new java.awt.Dimension(600, 300));
        BTlogin.setMinimumSize(new java.awt.Dimension(600, 300));
        BTlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTloginMouseClicked(evt);
            }
        });
        BTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTloginActionPerformed(evt);
            }
        });
        BTlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTloginKeyPressed(evt);
            }
        });
        getContentPane().add(BTlogin);
        BTlogin.setBounds(180, 140, 70, 23);

        LBwarning.setForeground(new java.awt.Color(240, 240, 240));
        LBwarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBwarning);
        LBwarning.setBounds(80, 170, 264, 25);

        bAddUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bAddUser.setText("New User");
        bAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddUserActionPerformed(evt);
            }
        });
        getContentPane().add(bAddUser);
        bAddUser.setBounds(417, 238, 90, 23);

        PFpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(PFpassword);
        PFpassword.setBounds(180, 110, 87, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/login.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 520, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened
    
    public void setWarningLabel(String statusLabel) {
        this.LBwarning.setText(statusLabel);
    }
    
    private void openMainWindow() {
        String sql = "SELECT * FROM tb_login l, UDetails d WHERE l.username='" + TFusername.getText() + "' and password='" + new String(PFpassword.getPassword()) + "' AND  l.username = d.username";
       
        //execute sql query 
        ResultSet rs = SQL.run(sql);
        try {
            
            if (rs.next()) {
                //set a new user object
                User usr = new User();
                //assign a properties of user from the query
                usr.setLogin(TFusername.getText());
                usr.setPassword(new String(PFpassword.getPassword()));
                usr.setAccess(rs.getString("acceslvl"));
                usr.setName(rs.getString("name"));
                usr.setAddress(rs.getString("address"));
                usr.setEmail(rs.getString("email"));
                usr.setPhone(rs.getString("phone"));
                    
                //clear the warning label and open main window
                LBwarning.setText("");
                
                //create new object mainGUI
                mainGUI mainGUI = new mainGUI();
                //inject user object to the main window
                mainGUI.setUser(usr);
                //set the main window visible
                mainGUI.setVisible(true);
                //mek the login window gone
                this.setVisible(false);
            } else {
                //in no results from query show warning on the label
                setWarningLabel("Invalid username or password!");
            }  
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    //Login button has been clicked
    private void BTloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTloginMouseClicked
      openMainWindow();
    }//GEN-LAST:event_BTloginMouseClicked

    //add new user button has beed clicked
    private void bAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddUserActionPerformed
        NewUser NewUser =  new NewUser();
        NewUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bAddUserActionPerformed

    //enter key has been hit in password2 field
    private void PFpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFpasswordActionPerformed
        openMainWindow();
    }//GEN-LAST:event_PFpasswordActionPerformed

    //space ot enter has been pressed when focused on Login button
    private void BTloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTloginKeyPressed
       if (evt.isActionKey() | evt.getKeyCode() == 10) {
        openMainWindow();
       }
    }//GEN-LAST:event_BTloginKeyPressed

    private void BTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTloginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTlogin;
    private javax.swing.JLabel LBwarning;
    private javax.swing.JPasswordField PFpassword;
    private javax.swing.JTextField TFusername;
    private javax.swing.JButton bAddUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
