/*
 *FAQ.java
 */
package FAQ;

/**
 *
 * @author Maurice Ramsbottom
 */
public class FAQ extends FAQScrollGui{
/*  Deviation from original idea, 
    no longer have a use for a seperate answer list.
    More practical to call JOptionPane for display of answers */
    public void commonQuestions(){
        FAQScrollGui myGui = new FAQScrollGui();
        myGui.setVisible(true);
        
    }

    
}
