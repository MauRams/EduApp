/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package User;

import Login.User;
import SQL.SQL;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author klasecki
 */
public class EditOtherUsrGUI extends javax.swing.JPanel {
    User tempUser = new User();


 
    public EditOtherUsrGUI() {
        initComponents();
        FillCombo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBuser = new javax.swing.JLabel();
        CBusrs = new javax.swing.JComboBox();
        BTload = new javax.swing.JToggleButton();
        LBname = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        LBcourse = new javax.swing.JLabel();
        LByear = new javax.swing.JLabel();
        CByear = new javax.swing.JComboBox();
        LBdob = new javax.swing.JLabel();
        LBaddress = new javax.swing.JLabel();
        TFaddress = new javax.swing.JTextField();
        LBaccess = new javax.swing.JLabel();
        CBaccess = new javax.swing.JComboBox();
        LBphone = new javax.swing.JLabel();
        TFphone = new javax.swing.JTextField();
        BTsave = new javax.swing.JButton();
        LBemail = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        DCdob = new com.toedter.calendar.JDateChooser();
        CBcourse = new javax.swing.JComboBox();
        LBresetpassword = new javax.swing.JLabel();
        LBnewpwd = new javax.swing.JLabel();
        TFpwd = new javax.swing.JTextField();
        BTremove = new javax.swing.JButton();
        LBregisterd = new javax.swing.JLabel();
        TFregistred = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        LBuser.setText("Load user:");

        BTload.setText("Load");
        BTload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTloadActionPerformed(evt);
            }
        });

        LBname.setText("Name:");

        LBcourse.setText("Course:");

        LByear.setText("Course Year:");

        CByear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "1", "2", "3", "4" }));

        LBdob.setText("DoB:");

        LBaddress.setText("Address:");

        LBaccess.setText("Access:");

        CBaccess.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Admin", "Student", "Teacher" }));

        LBphone.setText("Phone no.:");

        BTsave.setText("Save");
        BTsave.setToolTipText("");
        BTsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsaveActionPerformed(evt);
            }
        });

        LBemail.setText("Email:");

        CBcourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Math", "Science", "Engineering" }));

        LBresetpassword.setText("Reset the password");

        LBnewpwd.setText("New password:");

        TFpwd.setToolTipText("");

        BTremove.setText("Remove user");
        BTremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTremoveActionPerformed(evt);
            }
        });

        LBregisterd.setText("Registred on:");

        TFregistred.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBresetpassword)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBnewpwd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(BTsave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTremove))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LByear)
                                .addComponent(LBdob)
                                .addComponent(LBaddress)
                                .addComponent(LBaccess)
                                .addComponent(LBphone)
                                .addComponent(LBemail)
                                .addComponent(LBcourse))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CByear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFaddress)
                                    .addComponent(CBaccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFphone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DCdob, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LBregisterd)
                            .addGap(18, 18, 18)
                            .addComponent(TFregistred, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBuser)
                                .addComponent(LBname))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CBusrs, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BTload))))))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBuser)
                    .addComponent(CBusrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBname))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBregisterd)
                    .addComponent(TFregistred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBcourse)
                    .addComponent(CBcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LByear)
                    .addComponent(CByear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBdob)
                    .addComponent(DCdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBaddress)
                    .addComponent(TFaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBaccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBaccess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBphone)
                    .addComponent(TFphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBemail)
                    .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBresetpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBnewpwd)
                    .addComponent(TFpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTsave)
                    .addComponent(BTremove))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void BTloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTloadActionPerformed
       String sql = "SELECT * FROM tb_login l, UDetails d WHERE l.username='" + CBusrs.getSelectedItem()  + "' AND  l.username = d.username";
       
            try {
                ResultSet rs = SQL.run(sql);
                if (rs.next()) {
                    tempUser.setLogin(rs.getString("username"));
                    tempUser.setPassword(rs.getString("password"));
                    tempUser.setAccess(rs.getString("acceslvl"));
                    tempUser.setName(rs.getString("name"));
                    tempUser.setAddress(rs.getString("address"));
                    tempUser.setEmail(rs.getString("email"));
                    tempUser.setPhone(rs.getString("phone"));
                    tempUser.setCourse(rs.getString("course"));                    
                    tempUser.setCouseYear(Integer.valueOf(rs.getString("courseyear")));
                    tempUser.setDob(rs.getDate("dob"));
                    tempUser.setRegistred(rs.getDate("registred"));
                    
                   
                } 
                } catch(Exception e) {
                       JOptionPane.showMessageDialog(null, e);
                } 
            
            TFname.setText(tempUser.getName());
            if(tempUser.getRegistred() == null) {
                TFregistred.setText("");
            } else {
                TFregistred.setText(tempUser.getRegistred().toString());
            }
            if (tempUser.getCourse() == null) {
                CBcourse.setSelectedIndex(0);
            } else if (tempUser.getCourse().equals("Math")) {
                CBcourse.setSelectedIndex(1);
            } else if (tempUser.getCourse().equals("Science")) {
                CBcourse.setSelectedIndex(2);
            } else if (tempUser.getCourse().equals("Engineering")) {
                CBcourse.setSelectedIndex(3);
            } else {
                CBcourse.setSelectedIndex(0);
            }
            CByear.setSelectedIndex(tempUser.getCouseYear());
            DCdob.setDate(tempUser.getDob());
            TFaddress.setText(tempUser.getAddress());
            if (tempUser.getAccess() == null) {
                    CBaccess.setSelectedIndex(0);
                } else if (tempUser.getAccess().equalsIgnoreCase("Admin")) {
                    CBaccess.setSelectedIndex(1);
                } else if (tempUser.getAccess().equalsIgnoreCase("Student")) {
                    CBaccess.setSelectedIndex(2);
                } else if (tempUser.getAccess().equalsIgnoreCase("Teacher")) {
                    CBaccess.setSelectedIndex(3);
                } else {
                    CBaccess.setSelectedIndex(0);
                }
            TFphone.setText(tempUser.getPhone());
            TFemail.setText(tempUser.getEmail());
            TFpwd.setText("");
            
     
    }//GEN-LAST:event_BTloadActionPerformed

    private void BTsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsaveActionPerformed
        if ( DCdob.getDate() == null) {  
            JOptionPane.showMessageDialog(null, "The date of birth is missing.");
        } else {            
            java.util.Date d = DCdob.getDate();
            java.sql.Date sqldate = new java.sql.Date(d.getTime());
            try{
            String sql = "Update UDetails set "
                                + "name = '" + TFname.getText()
                                + "', course = '" + (String)CBcourse.getSelectedItem()
                                + "', courseyear = '" + CByear.getSelectedIndex()
                                + "', dob = #" + sqldate
                                + "#, address = '" + TFaddress.getText()
                                + "', email = '" + TFemail.getText()
                                + "', phone = '" + TFphone.getText()
                                + "' where username='" + tempUser.getLogin() +"'";

            SQL.update(sql);
            if (TFpwd.getText().isEmpty()) {
                sql = "Update tb_login set "
                                + "acceslvl = '" + (String)CBaccess.getSelectedItem()
                                + "' where username='" + tempUser.getLogin() +"'";
            SQL.update(sql);   
            } else {
                sql = "Update tb_login set "
                    + "acceslvl = '" + (String)CBaccess.getSelectedItem()
                    + "', password = '" + TFpwd.getText()
                    + "' where username='" + tempUser.getLogin() +"'";
            SQL.update(sql);       
            }

            JOptionPane.showMessageDialog(null, "Data updated.");

            } catch(Exception e) {
                           JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_BTsaveActionPerformed

    private void BTremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTremoveActionPerformed
        String sql = "DELETE FROM tb_login where username='" + tempUser.getLogin() + "'";
        SQL.update(sql);
        
        sql = "DELETE FROM UDetails where username='" + tempUser.getLogin() + "'";
        SQL.update(sql);
        
                JOptionPane.showMessageDialog(null, "User deleted.");
                FillCombo();
                tempUser = null;
                
                TFname.setText("");
                CBcourse.setSelectedIndex(0);
                CByear.setSelectedIndex(0);
                DCdob.setDate(null);
                TFaddress.setText(null);
                CBaccess.setSelectedIndex(0);
                TFphone.setText(null);
                TFemail.setText(null);
                TFpwd.setText(null);
            

               
    }//GEN-LAST:event_BTremoveActionPerformed
    
    private void FillCombo(){
        CBusrs.removeAllItems();
    try {
        String sql = "SELECT * FROM tb_login";  
        ResultSet rs = SQL.run(sql);
               
        while(rs.next()) {
           String c  = rs.getString("username");
           CBusrs.addItem(c);            
        }
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTload;
    private javax.swing.JButton BTremove;
    private javax.swing.JButton BTsave;
    private javax.swing.JComboBox CBaccess;
    private javax.swing.JComboBox CBcourse;
    private javax.swing.JComboBox CBusrs;
    private javax.swing.JComboBox CByear;
    private com.toedter.calendar.JDateChooser DCdob;
    private javax.swing.JLabel LBaccess;
    private javax.swing.JLabel LBaddress;
    private javax.swing.JLabel LBcourse;
    private javax.swing.JLabel LBdob;
    private javax.swing.JLabel LBemail;
    private javax.swing.JLabel LBname;
    private javax.swing.JLabel LBnewpwd;
    private javax.swing.JLabel LBphone;
    private javax.swing.JLabel LBregisterd;
    private javax.swing.JLabel LBresetpassword;
    private javax.swing.JLabel LBuser;
    private javax.swing.JLabel LByear;
    private javax.swing.JTextField TFaddress;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFphone;
    private javax.swing.JTextField TFpwd;
    private javax.swing.JTextField TFregistred;
    // End of variables declaration//GEN-END:variables

}
