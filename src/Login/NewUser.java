
package Login;

import SQL.SQL;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author klasecki
 */
public class NewUser extends javax.swing.JFrame {
    //message on label generated when typed passwords match
    String pwdok = "OK";
    //message on label generated when typed passwords doesn'tmatch
    String pwdno = "Passwords doesn't match!";
    //message when not all fields are populated
    String error1 = "Please fill in all fields.";
    //message when password doesnt match and register button is hit
    String error2 = "Please provide matching passwords";
    //message displayed on succesful new user creation
    String usrAdded = "New user has been created.";
       
    //setting new user object
    public static User usr = new User();
  
    // Creates new form NewUser
      public NewUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBpassword2 = new javax.swing.JLabel();
        BTregister = new javax.swing.JButton();
        LBusername = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();
        LBname = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        LBemail = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        LBpassword1 = new javax.swing.JLabel();
        LBpwdcheck = new javax.swing.JLabel();
        PFpassword1 = new javax.swing.JPasswordField();
        PFpassword2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBpassword2.setText("Confirm password:");

        BTregister.setText("Register");
        BTregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregisterActionPerformed(evt);
            }
        });

        LBusername.setText("Username:");

        LBname.setText("Name:");
        LBname.setToolTipText("");

        LBemail.setText("Email:");

        LBpassword1.setText("Password:");

        LBpwdcheck.setForeground(new java.awt.Color(204, 0, 0));
        LBpwdcheck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        PFpassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PFpassword1KeyReleased(evt);
            }
        });

        PFpassword2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PFpassword2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBusername)
                            .addComponent(LBname)
                            .addComponent(LBemail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBpassword2)
                            .addComponent(BTregister)
                            .addComponent(LBpassword1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBpwdcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PFpassword2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(PFpassword1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBusername)
                    .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBname)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBemail)
                    .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpassword1)
                    .addComponent(PFpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpassword2)
                    .addComponent(PFpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(BTregister))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBpwdcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//The user hits the Register button
    private void BTregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregisterActionPerformed
        
    //check if user provided the data in all fields
        if (PFpassword1.getPassword().length == 0 |
            TFusername.getText().isEmpty() | 
            TFname.getText().isEmpty() | 
            TFemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, error1);
            //check if both new passwords match
        } else if (!LBpwdcheck.getText().equals(pwdok)) {
            JOptionPane.showMessageDialog(null, error2);
        } else {
            Date c = new Date();
            java.sql.Date sqldate = new java.sql.Date(c.getTime());
           
                //assign fields values to user object
                usr.setLogin(TFusername.getText());
                usr.setName(TFname.getText());
                usr.setPassword(new String(PFpassword1.getPassword()));
                usr.setEmail(TFemail.getText());
                usr.setAccess("Student");
                usr.setRegistred(sqldate);
     
            try {
                //create a query to update login table
                String sql = "INSERT INTO tb_login (username, password, acceslvl) values ('"
                        + usr.getLogin() + "', '"
                        + usr.getPassword() + "', '"
                        + usr.getAccess() + "')";

                //execute the query
                SQL.update(sql);

            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);                                   
            } 

            try {
                //create a query to update user details table
                String sql = "INSERT INTO UDetails (username, name, registred, email) values ('"
                        + usr.getLogin() + "', '"
                        + usr.getName()+ "', #"
                        + usr.getRegistred()+ "#, '"
                        + usr.getEmail()+"')";

               //execute the query
                SQL.update(sql);

                //show message that new user has been added
                JOptionPane.showMessageDialog(null, usrAdded);

                //set NewUserGui visible to false
                this.setVisible(false);

                //create new instance of loginGui and mekie it visible
                LoginGui myGUI = new LoginGui();  
                myGUI.setVisible(true);

            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
                String sql = "DELETE FROM tb_login where username='" + usr.getLogin() + "'";
                SQL.update(sql);
            }     
        }
    }//GEN-LAST:event_BTregisterActionPerformed

    //New character typed into password 1
    private void PFpassword1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PFpassword1KeyReleased
        //perform comparesing on password1 and password2 and update the lbel in real time
        if(new String(PFpassword1.getPassword()).equals(new String(PFpassword2.getPassword()))) {
            LBpwdcheck.setText(pwdok);
        } else {
            LBpwdcheck.setText(pwdno);
        }
    }//GEN-LAST:event_PFpassword1KeyReleased

    //New character typed into password 1
    private void PFpassword2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PFpassword2KeyReleased
        //perform comparesing on password1 and password2 and update the lbel in real time
        if(new String(PFpassword1.getPassword()).equals(new String(PFpassword2.getPassword()))) {
            LBpwdcheck.setText(pwdok);
        } else {
            LBpwdcheck.setText(pwdno);
        }
    }//GEN-LAST:event_PFpassword2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTregister;
    private javax.swing.JLabel LBemail;
    private javax.swing.JLabel LBname;
    private javax.swing.JLabel LBpassword1;
    private javax.swing.JLabel LBpassword2;
    private javax.swing.JLabel LBpwdcheck;
    private javax.swing.JLabel LBusername;
    private javax.swing.JPasswordField PFpassword1;
    private javax.swing.JPasswordField PFpassword2;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFusername;
    // End of variables declaration//GEN-END:variables
}
