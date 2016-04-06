/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import Login.User;
import SQL.Connect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Random;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Deniss
 */
public class QuizGui extends javax.swing.JPanel {
//CREATING OBJECT USER LATTER INJECTING VALUES FROM OTHER CLASS
    User user = new User();
//Subject in the quiz
private String subject;
int counter1;
//How many questions are there in the quiz
private int questionNum;
//Just counter to know on which question user is on
private int qCount;
//Counter for Final quiz SCORE
private double finalScore,maxScore;

//Array of objects for creating set number of questions
QuizQuestion[] qSet;
//ArrayList for All avalable questions in database
ArrayList<QuizQuestion> quizList;
QuizQuestion q;
//CODE FOR TIMER
//interval of 1 second
final static int interval = 1000;
private int time,left;
//Creating new timer
Timer t;

    public QuizGui(String subject,final int questionNum){
        this.subject = subject;
        this.questionNum = questionNum;
        initComponents();
        intiStartValues();
        //So at a start return button would not be avalable
        jButton1.setEnabled(false);
        qCount = 0;
        finalScore = 0.0;
        CreateQuiz();
        FillingText();
        LblTime.setText("Initializing...");
        //Creating action listner for timer
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
          //JOptionPane.showMessageDialog(null,Double.toString(finalScore));
        //int result = JOptionPane.showConfirmDialog (null, "Time is up, Save Result?","WARNING", JOptionPane.YES_NO_OPTION);
        //if(result == JOptionPane.YES_OPTION) {
          //THIS IS FOR DATE AND TIME 
        //PREFORMING SAVE TO DATABASE
           JOptionPane.showMessageDialog(null,"You are out of time! Saving your score");
        CheckAnswer();
            CalculatePoints();
            CalculateMaxScore();
            //Removed this feature
            //SaveToDatabase();
            SaveToFile();
       //LOADING FRAME
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            //Back to assesments
            AFrame myAFrame  = new AFrame();
            myAFrame.setVisible(true);
            myAFrame.setSize(380, 370);
            myAFrame.setResizable(false);
            myAFrame.setUser(user);
       // }
       /* if(result == JOptionPane.NO_OPTION) {
            //LOADING FRAME
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
   //If choice would be to save result, saves
    public void SaveToFile(){
       //Just decided to create separate class for saving
       //Wanted to see how it works that way
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
       Date date = new Date();
       //Converting date to a string here
       String assesmentDate = dateFormat.format(date);
            SaveToFile save;
            TableRow tr = new TableRow();
            tr.setDateAndTime(assesmentDate);
            tr.setSubject(subject);
            tr.setLogedUser(user.getLogin());
            tr.setScore(Double.toString(finalScore));
            tr.setMaxScore(Double.toString(maxScore));
            tr.setNumberOfQuestions(Integer.toString(questionNum));
            tr.setAssesmentType("Quiz");
            save = new SaveToFile(tr);
            save.Init();
        }
   
             //This was saving to database, but then it was clear that 
            //Have to include file I/O to ge more marks
   /*         
   public void SaveToDatabase(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();  
        Connection con = Connect.ConnectDB();
        PreparedStatement pst = null;
         try {
        String sql = "INSERT INTO Results (LogedUser,Subject,Score,MaxScore,NumberOfQuestions,AssesmentType,DateAndTime) "
                + "VALUES('"+user.getLogin()+"','"+subject+"','"+Double.toString(finalScore)+"','"+Double.toString(maxScore)+"','"+Integer.toString(questionNum)+"','Quiz','"+dateFormat.format(date)+"')";
        pst = con.prepareStatement(sql);
        pst.executeUpdate();
        //HAD TO CREATE QQ OUT OF THIS METHOD
        
     }     catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
            
    }
    }
   */
   //Max possible score in the quiz 
   public void CalculateMaxScore(){
      for(int i = 0; i<qSet.length;i++){
        maxScore = maxScore +qSet[i].getQuestionPoints();
                }
    }
   //Initializing countdown
   public void TimerStart(){
        time = 0;
        t.start();
   }
   //Sets button position acording to saved value
   public void SetRadioButtons(){
      if(qSet[qCount].getSelectedAnswer()==1){
          RbtnA.setSelected(true);
          RbtnB.setSelected(false);
          RbtnC.setSelected(false);
          RbtnD.setSelected(false);
      }
      else if(qSet[qCount].getSelectedAnswer()==2){
          RbtnA.setSelected(false);
          RbtnB.setSelected(true);
          RbtnC.setSelected(false);
          RbtnD.setSelected(false);
      }
      else if(qSet[qCount].getSelectedAnswer()==3){
          RbtnA.setSelected(false);
          RbtnB.setSelected(false);
          RbtnC.setSelected(true);
          RbtnD.setSelected(false);
          
      }
      else if(qSet[qCount].getSelectedAnswer()==4){
          RbtnA.setSelected(false);
          RbtnB.setSelected(false);
          RbtnC.setSelected(false);
          RbtnD.setSelected(true);
      }
      else {
          RbtnA.setSelected(true);
          RbtnB.setSelected(false);
          RbtnC.setSelected(false);
          RbtnD.setSelected(false);
      }
  }
  //This saves user picked result so if user retorns to this question his choice would be shown
  public void SaveRadioButtons(){
        if (RbtnA.isSelected()){
            qSet[qCount].setSelectedAnswer(1);
            }
        else if (RbtnB.isSelected()){
            qSet[qCount].setSelectedAnswer(2);
        }
        else if (RbtnC.isSelected()){
            qSet[qCount].setSelectedAnswer(3);
        }
        else if (RbtnD.isSelected()){
            qSet[qCount].setSelectedAnswer(4);
        }
       
   }
  //Checks on what question is user, first or last or in a middle 
  public void CheckButtons(){
        if(qCount==0)jButton1.setEnabled(false);
        else jButton1.setEnabled(true);
       
        if(qCount==questionNum-1){
            BtnChoice.setText("FINISH Quiz");
            BtnNext.setEnabled(false);}
        else {
            BtnNext.setEnabled(true);
            BtnChoice.setText("Back to choices");
        }
        

    }
  //Calculates points by checking did user answer right or wrong 
  public void CalculatePoints(){
        finalScore = 0.0;
        for(int i = 0; i<qSet.length;i++){
            if(qSet[i].isGotRight())finalScore = finalScore + qSet[i].getQuestionPoints();
        }
        
    }
    //JUST CHECKING WHICH RADIO BUTTON CHOSEN, IF CORRECT ONE THEN MAKING ANSWER TRUE
    public void CheckAnswer(){
        if (RbtnA.isSelected()){
            if(qSet[qCount].getrAnswer() == 1)qSet[qCount].setGotRight(true);
            else qSet[qCount].setGotRight(false);
            }
        if (RbtnB.isSelected()){
            if(qSet[qCount].getrAnswer() == 2)qSet[qCount].setGotRight(true);
            else qSet[qCount].setGotRight(false);
        }
        if (RbtnC.isSelected()){
            if(qSet[qCount].getrAnswer() == 3)qSet[qCount].setGotRight(true);
            else qSet[qCount].setGotRight(false);
        }
        if (RbtnD.isSelected()){
            if(qSet[qCount].getrAnswer() == 4)qSet[qCount].setGotRight(true);
            else qSet[qCount].setGotRight(false);
        }
        
    }
   //loading text and filling fields
    public void FillingText(){
                //Setting text in text fields, setting required values.
         LblQuestionNum.setText("Number of Questions: "+Integer.toString(qCount+1)+" / "+Integer.toString(questionNum)); 
        TfHint.setText("To see hint press HINT button");
        RbtnA.setText(qSet[qCount].getQ1());
         RbtnB.setText(qSet[qCount].getQ2());
         RbtnC.setText(qSet[qCount].getQ3());
         RbtnD.setText(qSet[qCount].getQ4());
         TfQuestion.setText(qSet[qCount].getQuestion());
         LblQuestionScore.setText("Points for Question: "+Double.toString(qSet[qCount].getQuestionPoints()));
//  RbtnA.setText(qSet[qCount].getrAnswer());
    }
    public void CreateQuiz(){
        //OBJECTS AND EXTANCIATIONS
        Connection con = Connect.ConnectDB();
        ResultSet rs = null;
        PreparedStatement pst = null;
        //BUT FIRST HAVE TO SET QUESTION NUMBER
        //CONNECTING TO DATABASE, THEN MAKING QUERY
     try {
        //Will change this latter to SELECT DISTINCT and from question tabje
        String sql = "SELECT * FROM QuizQuestions WHERE subject ='"+subject+"'";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        
        quizList = new ArrayList<QuizQuestion>();
        
        

//HAD TO CREATE QQ OUT OF THIS METHOD
        //+QuestionRandomization
        //Counting avalable questions:
                //HAD TO CREATE QQ OUT OF THIS METHOD
        
    //This allows to create ArrayList with all avalable QuizQuestions
        //Then Shuffle the questions and then create assesment with required quantity of questions
        ResultSet rs1 = null;
        rs1 = pst.executeQuery();
       //That way i know how many questions with this subject are in database
        while(rs1.next()){
            counter1++;
        }
        
        qSet = new QuizQuestion[questionNum];
            for(int i = 0; i<counter1;i++){
            rs.next();
            q = new QuizQuestion();
            q.setQ1(rs.getString("Q1"));
            q.setQ2(rs.getString("Q2"));
            q.setQ3(rs.getString("Q3"));
            q.setQ4(rs.getString("Q4"));
            q.setHint(rs.getString("Hint"));
            q.setQuestion(rs.getString("Question"));
            int ans = Integer.parseInt(rs.getString("rAnsw"));
            q.setrAnswer(ans);
            double p = Double.parseDouble(rs.getString("Points"));
            q.setQuestionPoints(p);
            this.quizList.add(q);
            
            }
            //Shuffle Questions
            Collections.shuffle(quizList);
            for(int i = 0; i<questionNum;i++){
                //Randomizing Questions
                q = quizList.get(i);
            qSet[i] = new QuizQuestion();
            qSet[i].setQ1(q.getQ1());
            qSet[i].setQ2(q.getQ2());
            qSet[i].setQ3(q.getQ3());
            qSet[i].setQ4(q.getQ4());
            qSet[i].setHint(q.getHint());
            qSet[i].setQuestion(q.getQuestion());
            qSet[i].setrAnswer(q.getrAnswer());
            qSet[i].setQuestionPoints(q.getQuestionPoints());
     }
                  
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
            
    }

}

    public void intiStartValues(){
        LbjSubject.setText(subject+ " Quiz");
    }
    public void setUser(User usr){
        this.user = usr;
       // CreateQuiz();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Group1 = new javax.swing.ButtonGroup();
        LbjSubject = new javax.swing.JLabel();
        PBar = new javax.swing.JProgressBar();
        TfQuestion = new javax.swing.JLabel();
        TfHint = new javax.swing.JLabel();
        RbtnA = new javax.swing.JRadioButton();
        RbtnB = new javax.swing.JRadioButton();
        RbtnC = new javax.swing.JRadioButton();
        RbtnD = new javax.swing.JRadioButton();
        LblQuestionScore = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BtnHint = new javax.swing.JButton();
        BtnNext = new javax.swing.JButton();
        BtnChoice = new javax.swing.JButton();
        LblTime = new javax.swing.JLabel();
        LblQuestionNum = new javax.swing.JLabel();

        jTabbedPane1.addTab("tab1", jTabbedPane2);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(null);

        LbjSubject.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LbjSubject.setText("##SUBJECT##");
        add(LbjSubject);
        LbjSubject.setBounds(80, 30, 290, 40);

        PBar.setMaximum(questionNum-1);
        add(PBar);
        PBar.setBounds(20, 430, 340, 14);

        TfQuestion.setText("Space for question text here...");
        add(TfQuestion);
        TfQuestion.setBounds(20, 70, 304, 100);

        TfHint.setText("Space for showing hint here.....");
        add(TfHint);
        TfHint.setBounds(20, 190, 330, 30);

        Group1.add(RbtnA);
        RbtnA.setText("Question text goes here for Question A");
        RbtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnAActionPerformed(evt);
            }
        });
        add(RbtnA);
        RbtnA.setBounds(70, 250, 250, 23);

        Group1.add(RbtnB);
        RbtnB.setText("Question text goes here for Question B");
        add(RbtnB);
        RbtnB.setBounds(70, 290, 250, 23);

        Group1.add(RbtnC);
        RbtnC.setText("Question text goes here for Question C");
        RbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnCActionPerformed(evt);
            }
        });
        add(RbtnC);
        RbtnC.setBounds(70, 330, 250, 23);

        Group1.add(RbtnD);
        RbtnD.setText("Question text goes here for Question D");
        add(RbtnD);
        RbtnD.setBounds(70, 370, 240, 23);

        LblQuestionScore.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        LblQuestionScore.setText("Points for Question:");
        add(LblQuestionScore);
        LblQuestionScore.setBounds(30, 400, 150, 20);

        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 480, 80, 23);

        BtnHint.setText("HINT");
        BtnHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHintActionPerformed(evt);
            }
        });
        add(BtnHint);
        BtnHint.setBounds(240, 480, 60, 23);

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
        BtnChoice.setBounds(100, 480, 130, 23);

        LblTime.setText("Time Left:");
        add(LblTime);
        LblTime.setBounds(270, 450, 90, 20);

        LblQuestionNum.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        LblQuestionNum.setText("Number of Questions:");
        add(LblQuestionNum);
        LblQuestionNum.setBounds(210, 400, 150, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHintActionPerformed
    TfHint.setText(qSet[qCount].getHint());
    }//GEN-LAST:event_BtnHintActionPerformed

    private void BtnChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChoiceActionPerformed

        //JOptionPane.showMessageDialog(null,Double.toString(finalScore));
        int result = JOptionPane.showConfirmDialog (null, "Exit and save results?","WARNING", JOptionPane.YES_NO_CANCEL_OPTION);
        if(result == JOptionPane.YES_OPTION) {
          //THIS IS FOR DATE AND TIME 
        //PREFORMING SAVE TO DATABASE
            CheckAnswer();
            CalculatePoints();
            CalculateMaxScore();
           //This was saving to database, but then it was clear that 
            //Have to include file I/O to ge more marks
            //SaveToDatabase();
            SaveToFile();
       
            
            //LOADING FRAME
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
            //LOADING FRAME
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

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        //Setting next question
       
        CheckAnswer();
        SaveRadioButtons();
        qCount++;
        SetRadioButtons();
        CheckButtons();
        FillingText();
        PBar.setValue(qCount); //Set value
	PBar.repaint();

//for(int i = 0; i<qSet.length;i++){
        //System.out.println(qSet[i].getQ1());
           // System.out.println(qSet[i].getQ2());
           // System.out.println(qSet[i].getQ4());
            //System.out.println(qSet[i].getHint());
           // System.out.println(qSet[i].getQuestion());
           // System.out.println(qSet[i].getrAnswer());  
        //}// TODO add your handling code here:
    }//GEN-LAST:event_BtnNextActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void RbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CheckAnswer();
        SaveRadioButtons();
        qCount--;
        SetRadioButtons();
        FillingText();
        CheckButtons();
        PBar.setValue(qCount); //Set value
	PBar.repaint();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RbtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChoice;
    private javax.swing.JButton BtnHint;
    private javax.swing.JButton BtnNext;
    private javax.swing.ButtonGroup Group1;
    private javax.swing.JLabel LbjSubject;
    private javax.swing.JLabel LblQuestionNum;
    private javax.swing.JLabel LblQuestionScore;
    private javax.swing.JLabel LblTime;
    private javax.swing.JProgressBar PBar;
    private javax.swing.JRadioButton RbtnA;
    private javax.swing.JRadioButton RbtnB;
    private javax.swing.JRadioButton RbtnC;
    private javax.swing.JRadioButton RbtnD;
    private javax.swing.JLabel TfHint;
    private javax.swing.JLabel TfQuestion;
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
