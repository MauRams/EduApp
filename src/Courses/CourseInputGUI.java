/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth
 */
public class CourseInputGUI extends javax.swing.JPanel {

    Maths m;
    ArrayList<Courses> courses;
    
    
    /**
     * Creates new form mathsPanel
     */
    public CourseInputGUI() {
        initComponents();
        m = new Maths();
        
        courses = new  ArrayList<Courses>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        overviewTxtArea = new javax.swing.JTextArea();
        newCourseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        opportunitiesTxtArea = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        contentTxtArea = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        studentProfileTxtArea = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        areasOfStudyTxtArea = new javax.swing.JTextArea();
        saveCourseBtn = new javax.swing.JButton();
        displayCourseInfoBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Course Information Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        overviewTxtArea.setColumns(20);
        overviewTxtArea.setRows(5);
        jScrollPane1.setViewportView(overviewTxtArea);

        newCourseBtn.setText("Submit New Course");
        newCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCourseBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Course Overview");

        jLabel2.setText("Content");

        jLabel3.setText("Areas of Study");

        jLabel4.setText("Opportunities");

        jLabel5.setText("Student Profile");

        opportunitiesTxtArea.setColumns(20);
        opportunitiesTxtArea.setRows(5);
        jScrollPane6.setViewportView(opportunitiesTxtArea);

        contentTxtArea.setColumns(20);
        contentTxtArea.setRows(5);
        jScrollPane7.setViewportView(contentTxtArea);

        studentProfileTxtArea.setColumns(20);
        studentProfileTxtArea.setRows(5);
        jScrollPane8.setViewportView(studentProfileTxtArea);

        areasOfStudyTxtArea.setColumns(20);
        areasOfStudyTxtArea.setRows(5);
        jScrollPane9.setViewportView(areasOfStudyTxtArea);

        saveCourseBtn.setText("Save Course Details");
        saveCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCourseBtnActionPerformed(evt);
            }
        });

        displayCourseInfoBtn.setText("Display Course Info");
        displayCourseInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCourseInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayCourseInfoBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newCourseBtn)
                        .addGap(18, 18, 18)
                        .addComponent(saveCourseBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCourseBtn)
                    .addComponent(saveCourseBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayCourseInfoBtn)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCourseBtnActionPerformed
        
        //Create local variables to hold input 
        String overview, content, areasOfStudy, opportunities, studentProfile;

        //Save administrator input to local variables
        overview = overviewTxtArea.getText();
        content = contentTxtArea.getText();
        areasOfStudy = areasOfStudyTxtArea.getText();
        opportunities = opportunitiesTxtArea.getText();
        studentProfile = studentProfileTxtArea.getText();
        
        //Instance of a Courses object
        Courses tempCourse = new Courses();
        
        //Use setters to assign local variable to appropriate attribute
        tempCourse.setOverview(overview);
        tempCourse.setContent(content);
        tempCourse.setAreasOfStudy(areasOfStudy);
        tempCourse.setOpportunities(opportunities);
        tempCourse.setStudentProfile(studentProfile);
        
        //Add local object instance to ArrayList
        courses.add(tempCourse);
        
        //Notify administrator that new Course has been added - Could not get JOptionPane rootPane to work
        JOptionPane.showMessageDialog(null, "Added new course details ");
        
        //Clear fields after info is saved
        overviewTxtArea.setText("");
        contentTxtArea.setText("");
        areasOfStudyTxtArea.setText("");
        opportunitiesTxtArea.setText("");
        studentProfileTxtArea.setText("");
        
        
        
        
        
        
        File outFile; //Instance of the file class called outFile
        FileWriter fw; //Characther stream to send the data to file
        BufferedWriter bw; //Buffered stream which allows us to send all data in one go

        String name = overviewTxtArea.getText();//String to store the data from the file

        try {
            //Create all objects from above
            outFile = new File("mathsOverviewInput.txt");
            fw = new FileWriter(outFile, true); //Wrap outFile in our FileWriter
            bw = new BufferedWriter(fw); //Pass our FilwWriter(Char Stream) into BufferedWriter

            bw.write(name); //Write data to the file
            bw.newLine();
            
            bw.close(); //Close the buffer
            overviewTxtArea.setText("");//Clears the text field
            JOptionPane.showMessageDialog(null, "Information has been submitted");
        } 
        catch (IOException e) {
            System.out.println("Error writing to file" + e);
        }
    }//GEN-LAST:event_newCourseBtnActionPerformed

    private void saveCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCourseBtnActionPerformed
        
        try {
            //Write to a file, create file output stream
            FileOutputStream fos = new FileOutputStream("course.bin");

            //Wrap file output stream in a object output stream
            ObjectOutputStream out = new ObjectOutputStream(fos);

            //Iterate over each element in the ArrayList
            for(int i = 0; i < courses.size(); i++) {
            
                //Get course one by one and write to the file
                Courses tempCourse = courses.get(i); 
                
                out.writeObject(tempCourse);
            }
            
            //Close both file and object output streams
            out.close();
            fos.close();
            
            //Tell administrator data saved  to file
        }
        catch(FileNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null,"File not found when saving file");
        }
        catch(IOException ex) {
            
            JOptionPane.showMessageDialog(null,"Error when saving file");
        }
    }//GEN-LAST:event_saveCourseBtnActionPerformed

    private void displayCourseInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCourseInfoBtnActionPerformed
        
        //Iterate over the ArrayList, end at last element
        for(int i = 0; i < courses.size(); i++) {
            
            //Get course info one at a time and display
            Courses tempCourse = courses.get(i);
            String tempInfo = tempCourse.getInfo();
            
            JOptionPane.showMessageDialog(null, tempInfo); 
        }
    }//GEN-LAST:event_displayCourseInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areasOfStudyTxtArea;
    private javax.swing.JTextArea contentTxtArea;
    private javax.swing.JButton displayCourseInfoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton newCourseBtn;
    private javax.swing.JTextArea opportunitiesTxtArea;
    private javax.swing.JTextArea overviewTxtArea;
    private javax.swing.JButton saveCourseBtn;
    private javax.swing.JTextArea studentProfileTxtArea;
    // End of variables declaration//GEN-END:variables
}
