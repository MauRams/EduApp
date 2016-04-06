/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

/**
 *
 * @author Maurice Ramsbottom
 */
public class Careers extends CareersGUI {
    private String jobs;
    
    public void JobsListing(){
        CareersGUI myCGui = new CareersGUI();
        myCGui.setVisible(true);
    
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String Jobs) {
        this.jobs = Jobs;
    }
}
