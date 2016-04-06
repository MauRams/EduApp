
package Courses;

import java.io.Serializable;

/**
 * Class Courses.java
 * @author Kenneth Power
 * 05/03/1205
 */

//In this class I am setting up the base class for the area of Courses of each subject
//Each subject will inherite from this class with it's own specific areas to that subject

public class Courses implements Serializable{
    
    private String overview;
    private String content;
    private String areasOfStudy;
    private String opportunities;
    private String studentProfile;
    
public Courses(){
    
}

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAreasOfStudy() {
        return areasOfStudy;
    }

    public void setAreasOfStudy(String areasOfStudy) {
        this.areasOfStudy = areasOfStudy;
    }
    
    public String getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(String opportunities) {
        this.opportunities = opportunities;
    }
    
    public String getStudentProfile(){
        return studentProfile;
    }

    public void setStudentProfile(String studentProfile) {
        this.studentProfile = studentProfile;
    }

    public String getInfo() {
        
        String temp;
        
        temp = "Overview: " + overview +
               "\nContent: " + content +
               "\nAreas of Study: " + areasOfStudy +
               "\nOpportunities: " + opportunities +
               "\nStudent Profile: " + studentProfile;
        
        return temp;
    }
    

}
