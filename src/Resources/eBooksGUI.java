/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Maurice Ramsbottom
 */
public class eBooksGUI extends javax.swing.JPanel implements Serializable {

    ArrayList <eBookList> bList;
    private int count;

    /**
     * Creates new form eBooks2GUI
     */
    public eBooksGUI() {
        initComponents();

        bList = new ArrayList <eBookList>();
        count++;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabTech = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        txtAuthor = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        lblHat = new javax.swing.JLabel();
        lblEbook = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        tabTech.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabTech.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        lblTitle.setText("Add book Title:");

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Add book Author:");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLoad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoad.setText("Display User Booklist");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnSave)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnLoad)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addGap(129, 129, 129))
        );

        tabTech.addTab("Add an Ebook", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("Nowadays, when studying in second or third-level education, the required and recommended reading lists can be vast. Carrying around many textbooks on your person is not very feasible. That is where eBooks and eReaders come in to play. With varying levels of storage space the common eReader such as the Kindle can hold up to 2,000 books for instant access!! One can see the benefit in this system!");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTech.addTab("Why eBooks?", jPanel6);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("www.freebookcentre.net have a huge resource of free maths eBooks. ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTech.addTab("Maths", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("www.freebookcentre.net have a huge resource of free Science eBooks.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTech.addTab("Science", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("www.freebookcentre.net have a huge resource of free Engineering eBooks.");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTech.addTab("Engineering", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("www.freebookcentre.net have a huge resource of free Technology eBooks.");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTech.addTab("Technology", jPanel5);

        lblHat.setText(" ");

        lblEbook.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEbook.setText("eBooks");
        lblEbook.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/rsz_books-icon.png"))); // NOI18N
        jLabel2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(lblEbook)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabTech, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEbook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHat)
                            .addComponent(tabTech, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        //local variables that store the info
        String bookTitle, bookAuthor;
        
        //get text from fields
       if(txtTitle==null&&txtAuthor==null){
           JOptionPane.showMessageDialog(null,"Not a valid selection, please try again");
       }
       else
       {
        bookTitle = txtTitle.getText();
        bookAuthor = txtAuthor.getText();
       
        
        //local instance of eBookList
        eBookList ebl = new eBookList();
        
        //set variables
        ebl.setBookTitle(bookTitle);
        ebl.setBookAuthor(bookAuthor); 
        
        bList.add(ebl);
        JOptionPane.showMessageDialog(null,"Added Title and Author");
        
       }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        //clear the text fields 
        txtTitle.setText("");
        txtAuthor.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        //try statement
        try{
            //create objects
            outFile = new File("eBooksList.bin");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            
            //loop through array and write details
            //while loop should prevent over-writing - some indexes can go missing, not sure why!
            for(int i = 0; i<bList.size();i++){
            eBookList ebl = new eBookList();
            //write ArrayList to file
            oStream.writeObject(bList);
            
            
            //close stream
            oStream.close();
            fStream.close();
            
            
            //message to user
            JOptionPane.showMessageDialog(null,"Saved to file successfully");
            }
            
        }            
        //catch file not found exception
        catch(FileNotFoundException fnf){
            JOptionPane.showMessageDialog(null,"File Not Found!");
        }
        //catch IOException
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        //to avoid duplications
        bList.clear();
        try{
            File inFile;
            FileInputStream fStream;
            ObjectInputStream oStream;
            
            inFile = new File("eBooksList.bin");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);
            //local instance of object eBookList
            ArrayList<eBookList> bList;
            //read in data from arraylist(cast it as arraylist)
            bList = (ArrayList<eBookList>)oStream.readObject();
            //loop, read through and display all items in arraylist
           
            for(eBookList x:bList){
                JOptionPane.showMessageDialog(null,"Title: "+x.getBookTitle()+ "\nAuthor: "+x.getBookAuthor());
                }
            
        }
        catch(EOFException eof){
            JOptionPane.showMessageDialog(null,"End of file Reached :-)");
            
            }
        catch(IOException ex){
                        JOptionPane.showMessageDialog(null,"IO Exception!");
                        }
            catch(ClassNotFoundException exc){
                    JOptionPane.showMessageDialog(null,"Class Not Found Exception!");
                    }
        
        
                    
                    
    }//GEN-LAST:event_btnLoadActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lblEbook;
    private javax.swing.JLabel lblHat;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTabbedPane tabTech;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
