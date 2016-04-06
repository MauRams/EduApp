/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import SQL.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Deniss
 */
public class Quiz {
    //Question Variables and instances
    private int qnum;
    private String subject;
    public int getQnum() {
        return qnum;
    }

    public void setQnum(int qnum) {
        this.qnum = qnum;
    }
    public Quiz(){
        //JUST IN CASE IF SOMEONE DONT NEED ALL VALUES
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Quiz(String subject, int qnum){
        this.subject = subject;
        this.qnum = qnum;
    }

    //NOT SURE ABOUT THIS YET
//public Quiz(String subjectName,String question, String hint, int maxPoints){
       // super(subjectName,question,hint,maxPoints);
    //}
//Creating a new quiz:
    public void CreateQuiz(){
        //OBJECTS AND EXTANCIATIONS
        Connection con = Connect.ConnectDB();
        ResultSet rs = null;
        PreparedStatement pst = null;
        QuizQuestion[] qSet = new QuizQuestion[qnum];
        //BUT FIRST HAVE TO SET QUESTION NUMBER
        System.out.println(qnum);
        System.out.println(subject);
        //CONNECTING TO DATABASE, THEN MAKING QUERY
     try {
        //Will change this latter to SELECT DISTINCT and from question tabje
        String sql = "SELECT * FROM QuizQuestions WHERE subject ='"+subject+"'";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
            for(int i = 0; i<qSet.length;i++){
            rs.next();
            qSet[i] = new QuizQuestion();
            qSet[i].setQ1(rs.getString("Q1"));
            qSet[i].setQ2(rs.getString("Q2"));
            qSet[i].setQ3(rs.getString("Q3"));
            qSet[i].setQ4(rs.getString("Q4"));
            qSet[i].setHint(rs.getString("Hint"));
            qSet[i].setQuestion(rs.getString("Question"));
            int ans = Integer.parseInt(rs.getString("rAnsw"));
            qSet[i].setrAnswer(ans);
            
        
            System.out.println(qSet[i].getQ1());
            System.out.println(qSet[i].getQ2());
            System.out.println(qSet[i].getQ3());
            System.out.println(qSet[i].getQ4());
            System.out.println(qSet[i].getHint());
            System.out.println(qSet[i].getQuestion());
  System.out.println(qSet[i].getrAnswer());
     }
                  
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
            
    }

}
    
}
