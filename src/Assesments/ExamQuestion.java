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
//Variables
//WILL EXTEND IT LATTER FROM ONE CLASS
public class ExamQuestion extends Questions{
    //Variables   
    private String rAnswer1,rAnswer2,rAnswer3;
    //Hint
    //private String hint,question;
    //Right answer
    private String UserAnswer;
    //private double QuestionPoints;
    private boolean gotRight;
    public ExamQuestion(){
        rAnswer1 = "Answer1 Not Loaded";
        rAnswer2 = "Answer2 Not Loaded";
        rAnswer3 = "Answer3 Not Loaded";
        //hint = "Hint Not Loaded";
        UserAnswer = "";
        //question = "No Question";
        //QuestionPoints = 0.0;
    }


    public String getrAnswer1() {
        return rAnswer1;
    }

    public void setrAnswer1(String rAnswer1) {
        this.rAnswer1 = rAnswer1;
    }

    public String getrAnswer2() {
        return rAnswer2;
    }

    public void setrAnswer2(String rAnswer2) {
        this.rAnswer2 = rAnswer2;
    }

    public String getrAnswer3() {
        return rAnswer3;
    }

    public void setrAnswer3(String rAnswer3) {
        this.rAnswer3 = rAnswer3;
    }

   

    public String getUserAnswer() {
        return UserAnswer;
    }

    public void setUserAnswer(String UserAnswer) {
        this.UserAnswer = UserAnswer;
    }

    public boolean isGotRight() {
        return gotRight;
    }

    public void setGotRight(boolean gotRight) {
        this.gotRight = gotRight;
    }

}
