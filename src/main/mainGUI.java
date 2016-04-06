
package main;
import User.EditOtherUsrGUI;
import User.EditUser;
import Assesments.*;
import Courses.EngCourseGUI;
import Login.User;
import User.EditAccess;
import Courses.MathsCourseGUI;
import Courses.CourseInputGUI;
import Courses.ScienceCourseGUI;
import FAQ.FAQScrollGui;
import Resources.CareersGUI;
import Resources.EduGUI;
import Resources.ULinksAddGUI;
import Resources.ULinksGUI;
import Resources.eBooksGUI;
import SQL.SQL;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




/**
 *
 * @author Kamil
 */
public class mainGUI extends javax.swing.JFrame {
    
User user = new User();
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    //Creates new form mainGUI
    public mainGUI() {
        initComponents();

        this.setLocationRelativeTo(null);

        
        
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        Header = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        accesLabel = new javax.swing.JLabel();
        MainFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Overview = new javax.swing.JMenu();
        MathsOverwiev = new javax.swing.JMenuItem();
        ScienceOverview = new javax.swing.JMenuItem();
        EngOverwiev = new javax.swing.JMenuItem();
        mathsInputMenu = new javax.swing.JMenuItem();
        Exams = new javax.swing.JMenu();
        MExams = new javax.swing.JMenuItem();
        SExams = new javax.swing.JMenuItem();
        EExams = new javax.swing.JMenuItem();
        Qiuzes = new javax.swing.JMenu();
        MQizes = new javax.swing.JMenuItem();
        SQizes = new javax.swing.JMenuItem();
        EQiuizes = new javax.swing.JMenuItem();
        ViewAssesments = new javax.swing.JMenu();
        AssesmentsRes = new javax.swing.JMenuItem();
        AssesmentsCh = new javax.swing.JMenuItem();
        Resources = new javax.swing.JMenu();
        eBooks = new javax.swing.JMenuItem();
        ULinks = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Careers = new javax.swing.JMenuItem();
        Education = new javax.swing.JMenuItem();
        FAQ = new javax.swing.JMenuItem();
        Users = new javax.swing.JMenu();
        UDetials = new javax.swing.JMenuItem();
        EditOtherUser = new javax.swing.JMenuItem();
        EditAccess = new javax.swing.JMenuItem();
        ViewAbout = new javax.swing.JMenu();
        AboutAut = new javax.swing.JMenuItem();
        AboutVer = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(709, 505));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(accesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MainFrame.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("V.0.1b (Just GUI)");

        Overview.setText("Overview");

        MathsOverwiev.setText("Maths");
        MathsOverwiev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathsOverwievActionPerformed(evt);
            }
        });
        Overview.add(MathsOverwiev);

        ScienceOverview.setText("Science");
        ScienceOverview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScienceOverviewActionPerformed(evt);
            }
        });
        Overview.add(ScienceOverview);

        EngOverwiev.setText("Engineering");
        EngOverwiev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngOverwievActionPerformed(evt);
            }
        });
        Overview.add(EngOverwiev);

        mathsInputMenu.setText("Course Details Input");
        mathsInputMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathsInputMenuActionPerformed(evt);
            }
        });
        Overview.add(mathsInputMenu);

        jMenuBar1.add(Overview);

        Exams.setText("Exams");

        MExams.setText("Maths");
        MExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MExamsActionPerformed(evt);
            }
        });
        Exams.add(MExams);

        SExams.setText("Science");
        SExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SExamsActionPerformed(evt);
            }
        });
        Exams.add(SExams);

        EExams.setText("Engineering");
        EExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EExamsActionPerformed(evt);
            }
        });
        Exams.add(EExams);

        jMenuBar1.add(Exams);

        Qiuzes.setText("Quizes");

        MQizes.setText("Maths");
        MQizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MQizesActionPerformed(evt);
            }
        });
        Qiuzes.add(MQizes);

        SQizes.setText("Science");
        SQizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQizesActionPerformed(evt);
            }
        });
        Qiuzes.add(SQizes);

        EQiuizes.setText("Engineering");
        EQiuizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQiuizesActionPerformed(evt);
            }
        });
        Qiuzes.add(EQiuizes);

        jMenuBar1.add(Qiuzes);

        ViewAssesments.setText("Assesments");

        AssesmentsRes.setText("Assesment Results");
        AssesmentsRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssesmentsResActionPerformed(evt);
            }
        });
        ViewAssesments.add(AssesmentsRes);

        AssesmentsCh.setText("Choose Assesment");
        AssesmentsCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssesmentsChActionPerformed(evt);
            }
        });
        ViewAssesments.add(AssesmentsCh);

        jMenuBar1.add(ViewAssesments);

        Resources.setText("Resources");

        eBooks.setText("eBooks");
        eBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBooksActionPerformed(evt);
            }
        });
        Resources.add(eBooks);

        ULinks.setText("Useful Links");
        ULinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULinksActionPerformed(evt);
            }
        });
        Resources.add(ULinks);

        jMenuItem1.setText("Add useful Link");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Resources.add(jMenuItem1);

        Careers.setText("Careers");
        Careers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CareersActionPerformed(evt);
            }
        });
        Resources.add(Careers);

        Education.setText("Education");
        Education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationActionPerformed(evt);
            }
        });
        Resources.add(Education);

        FAQ.setText("FAQ");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });
        Resources.add(FAQ);

        jMenuBar1.add(Resources);

        Users.setText("Users");

        UDetials.setText("User details");
        UDetials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UDetialsActionPerformed(evt);
            }
        });
        Users.add(UDetials);

        EditOtherUser.setText("Other users");
        EditOtherUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditOtherUserMousePressed(evt);
            }
        });
        Users.add(EditOtherUser);

        EditAccess.setText("Access settings");
        EditAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAccessActionPerformed(evt);
            }
        });
        Users.add(EditAccess);

        jMenuBar1.add(Users);

        ViewAbout.setText("About");

        AboutAut.setText("Authors");
        AboutAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutAutActionPerformed(evt);
            }
        });
        ViewAbout.add(AboutAut);

        AboutVer.setText("Version");
        AboutVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutVerActionPerformed(evt);
            }
        });
        ViewAbout.add(AboutVer);

        jMenuBar1.add(ViewAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUser(User usr) {
        this.user = usr;
    }
    
    private void MExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MExamsActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");       
        //Creating Frame
        AFrame myAFrame  = new AFrame(2,"Maths",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
 
        
        
    }//GEN-LAST:event_MExamsActionPerformed

    private void SExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SExamsActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");     
        AFrame myAFrame  = new AFrame(2,"Science",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
    }//GEN-LAST:event_SExamsActionPerformed

    private void EExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EExamsActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");          
        AFrame myAFrame  = new AFrame(2,"Engineering",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);      
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
         // TODO add your handling code here:
    }//GEN-LAST:event_EExamsActionPerformed

    private void eBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBooksActionPerformed

        MainFrame.removeAll();
        eBooksGUI myEGUI = new eBooksGUI();
        MainFrame.add(myEGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_eBooksActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
        //Clear main Frame area
        MainFrame.removeAll();       
        MainFrame.repaint();
        MainFrame.revalidate();
       
        //check access level and draw apropiate lements only
            String access = user.getAccess();
            String sql = "SELECT * FROM AccessSettings WHERE access='" + access  + "'";
                   try {
                ResultSet rs = SQL.run(sql);
                if (rs.next()) {
                   MathsOverwiev.setVisible(rs.getBoolean("canOMO"));
                   MExams.setVisible(rs.getBoolean("canOME"));
                   MQizes.setVisible(rs.getBoolean("canOMQ"));
                   ScienceOverview.setVisible(rs.getBoolean("canOSO"));
                   SExams.setVisible(rs.getBoolean("canOSE"));
                   SQizes.setVisible(rs.getBoolean("canOSQ"));
                   EngOverwiev.setVisible(rs.getBoolean("canOEO"));
                   EExams.setVisible(rs.getBoolean("canOEE"));
                   EQiuizes.setVisible(rs.getBoolean("canOEQ"));
                   UDetials.setVisible(rs.getBoolean("canESD"));
                   EditOtherUser.setVisible(rs.getBoolean("canEOD"));
                   EditAccess.setVisible(rs.getBoolean("canEA"));
                } 
                } catch(Exception e) {
                       JOptionPane.showMessageDialog(null, e);
                } 
            
            accesLabel.setText(access);
    }//GEN-LAST:event_formWindowOpened

    private void EditOtherUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditOtherUserMousePressed
        MainFrame.removeAll();
        EditOtherUsrGUI  EditOtherUsrGUI = new  EditOtherUsrGUI();      
        MainFrame.add(EditOtherUsrGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
        
    }//GEN-LAST:event_EditOtherUserMousePressed

    private void UDetialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UDetialsActionPerformed
        MainFrame.removeAll();
        EditUser EditUser = new EditUser();
        EditUser.setUser(user);     
        MainFrame.add(EditUser);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_UDetialsActionPerformed

    private void EditAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAccessActionPerformed
        MainFrame.removeAll();
        EditAccess AccessGUI = new EditAccess();
        MainFrame.add(AccessGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_EditAccessActionPerformed

    private void MQizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MQizesActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");      
        AFrame myAFrame  = new AFrame(1,"Maths",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
    }//GEN-LAST:event_MQizesActionPerformed

    private void AboutAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutAutActionPerformed
    JOptionPane.showMessageDialog(null,"Resources: Maurice Ramsbottom \n"+
                                        "Subjects: Kenneth Power \n"+
                                         "Users: Kamil Lasecki \n"+
                                          "Assessments, Quizez, Exams : Deniss Strods");
    }//GEN-LAST:event_AboutAutActionPerformed

    private void MathsOverwievActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathsOverwievActionPerformed
        MainFrame.removeAll();
        MathsCourseGUI myMathsGUI = new MathsCourseGUI();
        MainFrame.add(myMathsGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_MathsOverwievActionPerformed

    private void EducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationActionPerformed
        MainFrame.removeAll();
        EduGUI myEdGUI = new EduGUI();
        MainFrame.add(myEdGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_EducationActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        MainFrame.removeAll();
        FAQScrollGui myFgui = new FAQScrollGui();
        MainFrame.add(myFgui);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_FAQActionPerformed

    private void CareersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CareersActionPerformed
        MainFrame.removeAll();
        CareersGUI myCGui = new CareersGUI();
        MainFrame.add(myCGui);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_CareersActionPerformed

    private void ULinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULinksActionPerformed
        MainFrame.removeAll();
        ULinksGUI ULinksGUI = new ULinksGUI();
        MainFrame.add(ULinksGUI);
        MainFrame.repaint();
        MainFrame.revalidate();  
    }//GEN-LAST:event_ULinksActionPerformed

    private void AssesmentsResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssesmentsResActionPerformed
        ResultsTable myResultsTable  = new ResultsTable();
        myResultsTable.setVisible(true);
        myResultsTable.setSize(800, 575);
        myResultsTable.setResizable(false);
        myResultsTable.setUser(user);
    }//GEN-LAST:event_AssesmentsResActionPerformed

    private void SQizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQizesActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");      
        AFrame myAFrame  = new AFrame(1,"Science",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
    }//GEN-LAST:event_SQizesActionPerformed

    private void EQiuizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQiuizesActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");      
        AFrame myAFrame  = new AFrame(1,"Engineering",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);      
        myAFrame.setResizable(false);    
    }//GEN-LAST:event_EQiuizesActionPerformed

    private void ScienceOverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScienceOverviewActionPerformed
        MainFrame.removeAll();
        ScienceCourseGUI myScienceGUI = new ScienceCourseGUI();
        MainFrame.add(myScienceGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_ScienceOverviewActionPerformed

    private void EngOverwievActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngOverwievActionPerformed
        MainFrame.removeAll();
        EngCourseGUI myEngGUI = new EngCourseGUI();
        MainFrame.add(myEngGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_EngOverwievActionPerformed

    private void AssesmentsChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssesmentsChActionPerformed
        AFrame myAFrame  = new AFrame();
        myAFrame.setVisible(true);
        myAFrame.setSize(380, 370);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);       // TODO add your handling code here:
    }//GEN-LAST:event_AssesmentsChActionPerformed

    private void AboutVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutVerActionPerformed
 JOptionPane.showMessageDialog(null,"Version 0.8b (Working Resources section + Working Users section + Working Assesments section)");
    }//GEN-LAST:event_AboutVerActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MainFrame.removeAll();
        ULinksAddGUI ULinksAddGUI = new ULinksAddGUI();              
        MainFrame.add(ULinksAddGUI);
        MainFrame.repaint();
        MainFrame.revalidate();        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mathsInputMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathsInputMenuActionPerformed
        MainFrame.removeAll();
        CourseInputGUI myMathsGUI = new CourseInputGUI();
        MainFrame.add(myMathsGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_mathsInputMenuActionPerformed
   
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutAut;
    private javax.swing.JMenuItem AboutVer;
    private javax.swing.JMenuItem AssesmentsCh;
    private javax.swing.JMenuItem AssesmentsRes;
    private javax.swing.JMenuItem Careers;
    private javax.swing.JMenuItem EExams;
    private javax.swing.JMenuItem EQiuizes;
    private javax.swing.JMenuItem EditAccess;
    private javax.swing.JMenuItem EditOtherUser;
    private javax.swing.JMenuItem Education;
    private javax.swing.JMenuItem EngOverwiev;
    private javax.swing.JMenu Exams;
    private javax.swing.JMenuItem FAQ;
    private javax.swing.JPanel Header;
    private javax.swing.JMenuItem MExams;
    private javax.swing.JMenuItem MQizes;
    private javax.swing.JPanel MainFrame;
    private javax.swing.JMenuItem MathsOverwiev;
    private javax.swing.JMenu Overview;
    private javax.swing.JMenu Qiuzes;
    private javax.swing.JMenu Resources;
    private javax.swing.JMenuItem SExams;
    private javax.swing.JMenuItem SQizes;
    private javax.swing.JMenuItem ScienceOverview;
    private javax.swing.JMenuItem UDetials;
    private javax.swing.JMenuItem ULinks;
    private javax.swing.JMenu Users;
    private javax.swing.JMenu ViewAbout;
    private javax.swing.JMenu ViewAssesments;
    public static javax.swing.JLabel accesLabel;
    private javax.swing.JMenuItem eBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mathsInputMenu;
    public static javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
