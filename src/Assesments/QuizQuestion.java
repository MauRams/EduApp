/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

/**
 *
 * @author Deniss
 */
//WILL EXTEND IT LATTER FROM ONE CLASS
public class QuizQuestion extends Questions{
   
    //VARIABLES FOR QUESTIONS
    private String Q1,Q2,Q3,Q4;
    //Hint
   // private String hint,question;
    //Right answer
    private int rAnswer;
    private int selectedAnswer;

    public int getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(int selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
   // private double QuestionPoints;
    private boolean gotRight;
    public QuizQuestion(){
        gotRight = false;
        Q1 = "Answers are not loaded";
        Q2 = "Answers are not loaded";
        Q3 = "Answers are not loaded";
        Q4 = "Answers are not loaded";
        //hint = "Hint is not loaded";
        //question = "Question is not loaded";
        rAnswer = 0;
       // QuestionPoints = 0.0;
        selectedAnswer = 0;
    }

    public String getQ1() {
        return Q1;
    }

    public void setQ1(String Q1) {
        this.Q1 = Q1;
    }

    public String getQ2() {
        return Q2;
    }

    public void setQ2(String Q2) {
        this.Q2 = Q2;
    }

    public String getQ3() {
        return Q3;
    }

    public void setQ3(String Q3) {
        this.Q3 = Q3;
    }

    public String getQ4() {
        return Q4;
    }

    public void setQ4(String Q4) {
        this.Q4 = Q4;
    }

    

    public int getrAnswer() {
        return rAnswer;
    }

    public void setrAnswer(int rAnswer) {
        this.rAnswer = rAnswer;
    }

    public boolean isGotRight() {
        return gotRight;
    }

    public void setGotRight(boolean gotRight) {
        this.gotRight = gotRight;
    }

}
