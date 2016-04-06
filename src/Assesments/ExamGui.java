/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import static Assesments.QuizGui.interval;
import Login.User;
import SQL.Connect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Deniss
 */
public class ExamGui extends javax.swing.JPanel {
        //CREATING OBJECT USER LATTER INJECTING VALUES FROM OTHER CLASS
    User user = new User();
    private String subject;
    private int questionNum;
        //OBJECT ARRAY
    //Array of objects for creating set number of questions
    ExamQuestion[] eSet;
    //ArrayList for All avalable questions in database
    ArrayList<ExamQuestion> examList;
    ExamQuestion e;
   //JUST TO KNOW ON WHICH QUESTION USER IS.
    private int eCount,counter1;
//Counter for Final quiz SCORE
private double finalScore,maxScore;
    //interval of 1 second
final static int interval = 1000;
private int time,left;
//Creating new timer
Timer t;
    /**
     * Creates new form ExamGui
     */
        public ExamGui(String subject,final int questionNum) {
         this.subject = subject;
         this.questionNum = questionNum;
        initComponents();
        initStartValues();
        //So at a start return button would not be avalable
        jButton1.setEnabled(false);
        eCount = 0;
        
        //ExamQuestion[] eSet;
        CreateExam();
        FillingText();
        LblTime.setText("Initializing...");
         t = new Timer(interval,new ActionListener(){
         public void actionPerformed(ActionEvent e) {
                   time++;
                   left = questionNum *30;
                   if(left-time==0){
                   Prompt();
                   }
                   //Thats how i decided to separate purely seconds to minutes and seconds
                   //Im sure there is avalable method for that but i wanted to make it work my own way
                   int sec = (left-time)%60;
                   int min = (left-time)/60;
                   LblTime.setText("Time Left: "+Integer.toString(min)+":"+Integer.toString(sec));
         }
});
        //Starting timer
       TimerStart();
    }
            //Prompts save or not when run out of time
        public void Prompt(){
                            //int result = JOptionPane.showConfirmDialog (null, "Time is up, Save Result?","WARNING", JOptionPane.YES_NO_OPTION);
            //if(result == JOptionPane.YES_OPTION) {
                 //DATE AND TIME  

                JOptionPane.showMessageDialog(null,"You are out of time! Saving your score");
        StoreAnswer();
        CalculatePoints();
        CalculateMaxScore();
        SaveToFile();
       // SaveToDatabase(); Leaving this just in case
        
         //LOADING ASSESMENTS HOME FRAME
  JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
    frame.dispose();
        //Back to assesments
        AFrame myAFrame  = new AFrame();
        myAFrame.setVisible(true);
        myAFrame.setSize(380, 370);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
        //}
           /* if(result == JOptionPane.NO_OPTION) {
                  //remove(result);
                  JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    frame.dispose();
                    //Back to assesments    
                AFrame myAFrame  = new AFrame();
                myAFrame.setVisible(true);
                myAFrame.setSize(380, 370);
                myAFrame.setResizable(false);
                myAFrame.setUser(user);
                }*/
        }
        public void SaveToFile(){
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
       Date date = new Date();
       //Converting date to a string here
       String assesmentDate = dateFormat.format(date);
       //Just decided to create separate class for saving
       //Wanted to see how it works that way
       SaveToFile save;
            TableRow tr = new TableRow();
            tr.setDateAndTime(assesmentDate);
            tr.setSubject(subject);
            tr.setLogedUser(user.getLogin());
            tr.setScore(Double.toString(finalScore));
            tr.setMaxScore(Double.toString(maxScore));
            tr.setNumberOfQuestions(Integer.toString(questionNum));
            tr.setAssesmentType("Exam");
            save = new SaveToFile(tr);
            save.Init();
        }
        //Removing Database save for Assesments
        /*public void SaveToDatabase(){
            //PREFORMING SAVE TO DATABASE
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        Connection con = Connect.ConnectDB();
        PreparedStatement pst = null;
         try {
        String sql = "INSERT INTO Results (LogedUser,Subject,Score,MaxScore,NumberOfQuestions,AssesmentType,DateAndTime) "
                + "VALUES('"+user.getLogin()+"','"+subject+"','"+Double.toString(finalScore)+"','"+Double.toString(maxScore)+"','"+Integer.toString(questionNum)+"','Exam','"+dateFormat.format(date)+"')";
        pst = con.prepareStatement(sql);
        pst.executeUpdate();

        
     }     catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
            
    }
        }
        */
        public void CalculateMaxScore(){
      for(int i = 0; i<eSet.length;i++){
        maxScore = maxScore +eSet[i].getQuestionPoints();
                }
        }
        public void CalculatePoints(){
                finalScore = 0.0;
            for(int i = 0; i<eSet.length;i++){
                    //JST IN CASE IF FIELD IS EMPTY AND one of ANSWERS empty
                    String tempAnswer;
                    if(eSet[i].getUserAnswer().equals(""))tempAnswer = "N/A!@#$";
                    else tempAnswer = eSet[i].getUserAnswer();
                //COMPARING ANSWER WITH 3 POSSIBLE ANSWERS
                if(eSet[i].getrAnswer1().equalsIgnoreCase(tempAnswer) 
                    || eSet[i].getrAnswer2().equalsIgnoreCase(tempAnswer)
                    || eSet[i].getrAnswer3().equalsIgnoreCase(tempAnswer)){
                finalScore = finalScore + eSet[i].getQuestionPoints();
            }
        }
        }
   public void TimerStart(){
        time = 0;
        t.start();
   }
    //Stores answer for each question
public void StoreAnswer(){
   eSet[eCount].setUserAnswer(TfAnswer.getText());
}
public void PreviousAnswer(){
    TfAnswer.setText(eSet[eCount].getUserAnswer());
}
   public void CreateExam(){
        //OBJECTS AND EXTANCIATIONS
        Connection con = Connect.ConnectDB();
        ResultSet rs = null;
        PreparedStatement pst = null;
        //BUT FIRST HAVE TO SET QUESTION NUMBER
        //CONNECTING TO DATABASE, THEN MAKING QUERY
     try {
        //Will change this latter to SELECT DISTINCT and from question tabje
        String sql = "SELECT * FROM ExamQuestions WHERE subject ='"+subject+"'";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        //HAD TO CREATE EQ OUT OF THIS METHOD
        //to find How many questions are there
        ResultSet rs1 = null;
        rs1 = pst.executeQuery();
        //That way i know how many questions with this subject are in database
        while(rs1.next()){
            counter1++;
        }
        examList = new ArrayList<ExamQuestion>();
        
        
        eSet = new ExamQuestion[questionNum];
            //Shuffle Questions
            for(int i = 0; i<counter1;i++){
            rs.next();
            e = new ExamQuestion();
            e.setrAnswer1(rs.getString("Answer1"));
            e.setrAnswer2(rs.getString("Answer2"));
            e.setrAnswer3(rs.getString("Answer3"));
            e.setHint(rs.getString("Hint"));
            e.setQuestion(rs.getString("Question"));
            double p = Double.parseDouble(rs.getString("Points"));
            e.setQuestionPoints(p);
            this.examList.add(e);
            
            }
        Collections.shuffle(examList);
            
            for(int i = 0; i<questionNum;i++){
                e = examList.get(i);
       
            eSet[i] = new ExamQuestion();
            eSet[i].setrAnswer1(e.getrAnswer1());
            eSet[i].setrAnswer2(e.getrAnswer2());
            eSet[i].setrAnswer3(e.getrAnswer3());
            eSet[i].setHint(e.getHint());
            eSet[i].setQuestion(e.getQuestion());
            eSet[i].setQuestionPoints(e.getQuestionPoints());
     }
                  
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
            
    }
}
public void CheckButtons(){
        if(eCount==0)jButton1.setEnabled(false);
        else jButton1.setEnabled(true);
       
        if(eCount==questionNum-1){
            BtnChoice.setText("FINISH Quiz");
            BtnNext.setEnabled(false);}
        else {
            BtnNext.setEnabled(true);
            BtnChoice.setText("Back to choices");
    }
}
public void FillingText(){
                    //Setting text in text fields, setting required values.
          LblQuestionNum.setText("Number of Questions: "+Integer.toString(eCount+1)+" / "+Integer.toString(questionNum));
    TfHint.setText("To see hint press HINT button");
         TfQuestion.setText(eSet[eCount].getQuestion());
         LblQuestionScore.setText("Points for Question: "+Double.toString(eSet[eCount].getQuestionPoints()));
}
        public void initStartValues(){
    LblSubject.setText(subject + " Exam");
    LblQuestionNum.setText("Number of Questions: "+Integer.toString(questionNum));
    
} 
       public void setUser(User usr){
        this.user = usr;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblSubject = new javax.swing.JLabel();
        PBar = new javax.swing.JProgressBar();
        TfQuestion = new javax.swing.JLabel();
        TfHint = new javax.swing.JLabel();
        TfAnswer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BtnHint = new javax.swing.JButton();
        BtnNext = new javax.swing.JButton();
        BtnChoice = new javax.swing.JButton();
        LblQuestionNum = new javax.swing.JLabel();
        LblTime = new javax.swing.JLabel();
        LblQuestionScore = new javax.swing.JLabel();

        setLayout(null);

        LblSubject.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LblSubject.setText("##SUBJECT##");
        add(LblSubject);
        LblSubject.setBounds(60, 40, 310, 40);

        PBar.setMaximum(questionNum-1);
        add(PBar);
        PBar.setBounds(10, 410, 340, 14);

        TfQuestion.setText("Space for question text here...");
        add(TfQuestion);
        TfQuestion.setBounds(20, 90, 304, 130);

        TfHint.setText("Space for showing hint here.....");
        add(TfHint);
        TfHint.setBounds(10, 230, 330, 50);
        add(TfAnswer);
        TfAnswer.setBounds(130, 340, 180, 30);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("Your Answer:");
        add(jLabel1);
        jLabel1.setBounds(20, 340, 120, 21);

        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 480, 90, 23);

        BtnHint.setText("HINT");
        BtnHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHintActionPerformed(evt);
            }
        });
        add(BtnHint);
        BtnHint.setBounds(250, 480, 60, 23);

        BtnNext.setText("Next");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });
        add(BtnNext);
        BtnNext.setBounds(310, 480, 60, 23);

        BtnChoice.setText("Back to choices");
        BtnChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChoiceActionPerformed(evt);
            }
        });
        add(BtnChoice);
        BtnChoice.setBounds(110, 480, 130, 23);

        LblQuestionNum.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        LblQuestionNum.setText("Number of Questions:");
        add(LblQuestionNum);
        LblQuestionNum.setBounds(200, 384, 150, 20);

        LblTime.setText("Time Left:");
        add(LblTime);
        LblTime.setBounds(270, 440, 100, 20);

        LblQuestionScore.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        LblQuestionScore.setText("Points for Question:");
        add(LblQuestionScore);
        LblQuestionScore.setBounds(20, 380, 150, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChoiceActionPerformed
        //STORING ANSWER FOR LAST QUESTION
            

       
                int result = JOptionPane.showConfirmDialog (null, "Exit and save results?","WARNING", JOptionPane.YES_NO_CANCEL_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                 //DATE AND TIME  

                
        StoreAnswer();
        CalculatePoints();
        CalculateMaxScore();
      SaveToFile();
        // SaveToDatabase(); Leaving this just in case
        
         //LOADING ASSESMENTS HOME FRAME
  JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
    frame.dispose();
        //Back to assesments    
        AFrame myAFrame  = new AFrame();
        myAFrame.setVisible(true);
        myAFrame.setSize(380, 370);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
            }
            if(result == JOptionPane.NO_OPTION) {
                  //remove(result);
                  JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    frame.dispose();
                    //Back to assesments    
                AFrame myAFrame  = new AFrame();
                myAFrame.setVisible(true);
                myAFrame.setSize(380, 370);
                myAFrame.setResizable(false);
                myAFrame.setUser(user);
                }

            
                // TODO add your handling code here:
    }//GEN-LAST:event_BtnChoiceActionPerformed

    private void BtnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHintActionPerformed
    TfHint.setText(eSet[eCount].getHint());        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHintActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
       
        StoreAnswer();
        eCount++;
        CheckButtons();
        FillingText();
        PreviousAnswer();
        PBar.setValue(eCount); //Set value
	PBar.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StoreAnswer();
        eCount--;
        CheckButtons();
        FillingText();
        PreviousAnswer();
        PBar.setValue(eCount); //Set value
	PBar.repaint();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChoice;
    private javax.swing.JButton BtnHint;
    private javax.swing.JButton BtnNext;
    private javax.swing.JLabel LblQuestionNum;
    private javax.swing.JLabel LblQuestionScore;
    private javax.swing.JLabel LblSubject;
    private javax.swing.JLabel LblTime;
    private javax.swing.JProgressBar PBar;
    private javax.swing.JTextField TfAnswer;
    private javax.swing.JLabel TfHint;
    private javax.swing.JLabel TfQuestion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
