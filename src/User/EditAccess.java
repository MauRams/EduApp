/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import SQL.SQL;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author klasecki
 */
public class EditAccess extends javax.swing.JPanel {

    /**
     * Creates new form EditAccess
     */
    

   
    public EditAccess() {
        initComponents();
       
      

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        CBuser = new javax.swing.JComboBox();
        LBtype = new javax.swing.JLabel();
        CBomo = new javax.swing.JCheckBox();
        CBome = new javax.swing.JCheckBox();
        CBomq = new javax.swing.JCheckBox();
        CBesd = new javax.swing.JCheckBox();
        CBee = new javax.swing.JCheckBox();
        CBeq = new javax.swing.JCheckBox();
        CBoso = new javax.swing.JCheckBox();
        CBose = new javax.swing.JCheckBox();
        CBosq = new javax.swing.JCheckBox();
        CBoeo = new javax.swing.JCheckBox();
        CBoeq = new javax.swing.JCheckBox();
        CBoee = new javax.swing.JCheckBox();
        CBeg = new javax.swing.JCheckBox();
        CBeod = new javax.swing.JCheckBox();
        CBea = new javax.swing.JCheckBox();
        BTsave = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        CBuser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Admin", "Teacher", "Student" }));
        CBuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBuserActionPerformed(evt);
            }
        });

        LBtype.setText("Access type:");

        CBomo.setText("Can open Math Overwiev");
        CBomo.setToolTipText("");

        CBome.setText("Can open Math Exam");

        CBomq.setText("Can open Math Quiz");

        CBesd.setText("Can Edit Self Details");
        CBesd.setToolTipText("");

        CBee.setText("Can Edit Exams");
        CBee.setToolTipText("");

        CBeq.setText("Can Edit Quizes");
        CBeq.setToolTipText("");

        CBoso.setText("Can open Science Overwiev");
        CBoso.setToolTipText("");

        CBose.setText("Can open Science Exam");

        CBosq.setText("Can open Science Quiz");

        CBoeo.setText("Can open Engineering Overwiev");
        CBoeo.setToolTipText("");

        CBoeq.setText("Can open Engineering Quiz");

        CBoee.setText("Can open Engineering Exam");

        CBeg.setText("Can Edit Grades");

        CBeod.setText("Can Edit other user details");

        CBea.setText("Can Edit Access");

        BTsave.setText("Save");
        BTsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBtype)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBuser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 424, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBoeq)
                            .addComponent(CBoee)
                            .addComponent(CBoeo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBomq)
                                    .addComponent(CBome)
                                    .addComponent(CBomo)
                                    .addComponent(CBoso)
                                    .addComponent(CBose)
                                    .addComponent(CBosq))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBeq)
                                    .addComponent(CBee)
                                    .addComponent(CBeg)
                                    .addComponent(CBesd)
                                    .addComponent(CBeod)
                                    .addComponent(CBea)))
                            .addComponent(BTsave))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBtype)
                    .addComponent(CBuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBomo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBomq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBoso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBosq))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBesd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBeq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBeod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBea)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBoeo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBoee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBoeq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTsave)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBuserActionPerformed
       String sql = "SELECT * FROM AccessSettings WHERE access='" + CBuser.getSelectedItem()  + "'";
                   try {
                ResultSet rs = SQL.run(sql);
                if (rs.next()) {
                   CBomo.setSelected(rs.getBoolean("canOMO"));
                   CBome.setSelected(rs.getBoolean("canOME"));
                   CBomq.setSelected(rs.getBoolean("canOMQ"));
                   CBoso.setSelected(rs.getBoolean("canOSO"));
                   CBose.setSelected(rs.getBoolean("canOSE"));
                   CBosq.setSelected(rs.getBoolean("canOSQ"));
                   CBoeo.setSelected(rs.getBoolean("canOEO"));
                   CBoee.setSelected(rs.getBoolean("canOEE"));
                   CBoeq.setSelected(rs.getBoolean("canOEQ"));
                   CBesd.setSelected(rs.getBoolean("canESD"));
                   CBee.setSelected(rs.getBoolean("canEE"));
                   CBeq.setSelected(rs.getBoolean("canEQ"));
                   CBeg.setSelected(rs.getBoolean("canEG"));
                   CBeod.setSelected(rs.getBoolean("canEOD"));
                   CBea.setSelected(rs.getBoolean("canEA"));
                } 
                } catch(Exception e) {
                       JOptionPane.showMessageDialog(null, e);
                } 
    }//GEN-LAST:event_CBuserActionPerformed

    private void BTsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsaveActionPerformed
        String sql = "Update AccessSettings set "
                                + "canOMO = '" + CBomo.isSelected()
                                + "', canOME = '" + CBome.isSelected()
                                + "', canOMQ = '" + CBomq.isSelected()
                                + "', canOSO = '" + CBoso.isSelected()
                                + "', canOSE = '" + CBose.isSelected()
                                + "', canOSQ = '" + CBosq.isSelected()
                                + "', canOEO = '" + CBoeo.isSelected()
                                + "', canOEE = '" + CBoee.isSelected()
                                + "', canOEQ = '" + CBoeq.isSelected()
                                + "', canESD = '" + CBesd.isSelected()
                                + "', canEE = '" + CBee.isSelected()
                                + "', canEQ = '" + CBeq.isSelected()
                                + "', canEG = '" + CBeg.isSelected()
                                + "', canEOD = '" + CBeod.isSelected()
                                + "', canEA = '" + CBea.isSelected()
                                + "' where access='" + CBuser.getSelectedItem() +"'";
        try {
            SQL.update(sql);
            JOptionPane.showMessageDialog(null, "Data updated.");     
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_BTsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTsave;
    private javax.swing.JCheckBox CBea;
    private javax.swing.JCheckBox CBee;
    private javax.swing.JCheckBox CBeg;
    private javax.swing.JCheckBox CBeod;
    private javax.swing.JCheckBox CBeq;
    private javax.swing.JCheckBox CBesd;
    private javax.swing.JCheckBox CBoee;
    private javax.swing.JCheckBox CBoeo;
    private javax.swing.JCheckBox CBoeq;
    private javax.swing.JCheckBox CBome;
    private javax.swing.JCheckBox CBomo;
    private javax.swing.JCheckBox CBomq;
    private javax.swing.JCheckBox CBose;
    private javax.swing.JCheckBox CBoso;
    private javax.swing.JCheckBox CBosq;
    private javax.swing.JComboBox CBuser;
    private javax.swing.JLabel LBtype;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    // End of variables declaration//GEN-END:variables
}
