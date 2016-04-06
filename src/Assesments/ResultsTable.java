/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import Login.User;
import SQL.Connect;
import java.awt.BorderLayout;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deniss
 */
public class ResultsTable extends javax.swing.JFrame {
    User user = new User();
    ArrayList<TableRow> tableList;
   // TableRow[] tSet;
    private String s;
    private int counter1;
private static final Object[][] rowData = {};
private static final Object[] columnNames = {"LogedUser", "Subject", "Score",
	            "maxScore", "NumberOfQuestions","AssesmentType","DateAndTime"};
    public ResultsTable() {
       //counter1 = 0; Just in case of returning back to database
       tableList = new ArrayList<TableRow>();  
       CreateObjects();
       initComponents();
       LoadTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //LOADING TABLE CONTENT:
    }
    public void LoadTable(){
         DefaultTableModel listTableModel;
	        listTableModel = new DefaultTableModel(rowData, columnNames);
        //Reading from the file
            TableRow tr;
            //Putting backwards loop with negative incr. so it would display entrys
            //in table in the right order
            for (int i = tableList.size()-1; i > 0; i--) { 
	         tr = tableList.get(i);
                listTableModel.addRow(new Object[]{tr.getLogedUser(),
	                tr.getSubject(),
	                tr.getScore(),
	                tr.getMaxScore(),
	                tr.getNumberOfQuestions(),
	                tr.getAssesmentType(),
	                tr.getDateAndTime()});
	        }
                //LOADING TABLE FROM THE ARRAYLIST NOW, NOT ARRAY OF OBJECTS AND NOT FROM DATABASE
                /*
                
                for (int i = 0; i < counter1; i++) {
	            listTableModel.addRow(new Object[]{tSet[i].getLogedUser(),
	                tSet[i].getSubject(),
	                tSet[i].getScore(),
	                tSet[i].getMaxScore(),
	                tSet[i].getNumberOfQuestions(),
	                tSet[i].getAssesmentType(),
	                tSet[i].getDateAndTime()});
	        }
                */
	    jTable2.setModel(listTableModel);
        
    }
    public void CreateObjects(){
         //OBJECTS AND EXTANCIATIONS
        ObjectInputStream in = null;            
        try {
            in = new ObjectInputStream(new FileInputStream("Assesments.trs"));
            try { 
                TableRow tr = null;
                this.tableList.clear(); // Clear the list to previent duplication

                // Read the data and put it to ArrayList
                while (true) {
                    Object obj = in.readObject();
                    tr = (TableRow)obj;
                    this.tableList.add(tr);     
                }            
            }
            catch(ClassCastException ex) {
                
                JOptionPane.showMessageDialog(null, "Deserialision Error : " + ex.getMessage());
            }
            catch (ClassNotFoundException ex) {
                
                JOptionPane.showMessageDialog(null, "Deserialision Error : " + ex.getMessage());
            }
            catch (EOFException ex) {
            }         
        }
        catch(IOException ex) {
            
            JOptionPane.showMessageDialog(null, "Deserialision Error : " + ex.getMessage());
        }
        finally {
            
            if (in != null) {

                try {
                    in.close();
                }
                catch(IOException ex) {

                    JOptionPane.showMessageDialog(null, "Deserialision Stream Close Error : " + ex.getMessage());
                }
            }
        }
        
     //JUST CHANGING THIS PART TO FILE I/O INSTEAD OF DB
        /* 
        Connection con = Connect.ConnectDB();
        ResultSet rs = null;
        ResultSet rs1 = null;
        PreparedStatement pst = null;
        //BUT FIRST HAVE TO SET QUESTION NUMBER
        //CONNECTING TO DATABASE, THEN MAKING QUERY
     try {
        //Will change this latter to SELECT DISTINCT and from question tabje
        String sql = "SELECT * FROM Results";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        //HAD TO CREATE QQ OUT OF THIS METHOD
        rs1 = pst.executeQuery();
        while(rs1.next()){
            counter1 = counter1 +1;
        }
        tSet = new TableRow[counter1];
             for(int i = 0; i<counter1;i++){
                 rs.next();
            tSet[i] = new TableRow();
            tSet[i].setLogedUser(rs.getString("LogedUser"));
            tSet[i].setSubject(rs.getString("Subject"));
            tSet[i].setScore(rs.getString("Score"));
            tSet[i].setMaxScore(rs.getString("maxScore"));
            tSet[i].setNumberOfQuestions(rs.getString("NumberOfQuestions"));
            tSet[i].setAssesmentType(rs.getString("AssesmentType"));
            tSet[i].setDateAndTime(rs.getString("DateAndTime"));
            
     }
                  
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
            
    }
*/
        
    }
   public void setUser(User usr){
        this.user = usr;
        TfUser.setText("You are logged in as: " + user.getLogin());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TfSubject = new javax.swing.JLabel();
        TfUser = new javax.swing.JLabel();
        BtnChoice = new javax.swing.JButton();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        TfSubject.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        TfSubject.setText("Assesments Results:");
        jPanel1.add(TfSubject);
        TfSubject.setBounds(230, 10, 310, 40);

        TfUser.setText("Assesments Results for User: #####");
        jPanel1.add(TfUser);
        TfUser.setBounds(10, 460, 210, 30);

        BtnChoice.setText("Assesments choices");
        BtnChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChoiceActionPerformed(evt);
            }
        });
        jPanel1.add(BtnChoice);
        BtnChoice.setBounds(280, 490, 160, 23);

        DefaultTableModel listTableModel;
        listTableModel = new DefaultTableModel(rowData, columnNames);
        for (int i = 1; i < 25; i++) {
            String rowString = "Quiz #" + i;
            listTableModel.addRow(new Object[]{rowString, "ICON", "ICON"});
        }
        jTable1.setModel(listTableModel
        );
        jPanel1.add(jTable1);
        jTable1.setBounds(0, 0, 0, 0);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 60, 780, 402);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChoiceActionPerformed
         this.setVisible(false);
         AFrame myAFrame  = new AFrame();  
        myAFrame.setVisible(true);
        myAFrame.setSize(380, 370);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
    }//GEN-LAST:event_BtnChoiceActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultsTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChoice;
    private javax.swing.JLabel TfSubject;
    private javax.swing.JLabel TfUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
