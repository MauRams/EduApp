/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import java.io.Serializable;

/**
 *
 * @author Deniss
 */
//THIS OBJECT REPRESENTS TABLE ROW IN THE TABLE
public class TableRow implements Serializable {
    private String LogedUser,
            Subject,
            Score,
            maxScore,
            NumberOfQuestions,
            AssesmentType,
            DateAndTime;

    public String getAssesmentType() {
        return AssesmentType;
    }

    public void setAssesmentType(String AssesmentType) {
        this.AssesmentType = AssesmentType;
    }

    public String getLogedUser() {
        return LogedUser;
    }

    public void setLogedUser(String LogedUser) {
        this.LogedUser = LogedUser;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public String getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(String maxScore) {
        this.maxScore = maxScore;
    }

    public String getNumberOfQuestions() {
        return NumberOfQuestions;
    }

    public void setNumberOfQuestions(String NumberOfQuestions) {
        this.NumberOfQuestions = NumberOfQuestions;
    }

    public String getDateAndTime() {
        return DateAndTime;
    }

    public void setDateAndTime(String DateAndTime) {
        this.DateAndTime = DateAndTime;
    }
}
