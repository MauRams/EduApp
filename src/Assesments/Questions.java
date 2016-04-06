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
//THIS IS JUST CRETED TO SHOW THAT I UNDERSTAND ENHARATANCE
public class Questions {
    //Variables
    private String hint,question;
    //Right answer
    private double QuestionPoints;
    public Questions(){
        hint = "Hint is not loaded";
        question = "Question is not loaded";
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public double getQuestionPoints() {
        return QuestionPoints;
    }

    public void setQuestionPoints(double QuestionPoints) {
        this.QuestionPoints = QuestionPoints;
    }
    
}
