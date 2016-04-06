/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.io.Serializable;

/**
 *
 * @author Maurice
 */
public class eBooks extends eBooksGUI implements Serializable {
      public eBooks(){
          //instantiate and make visible
        eBooksGUI myEGUI = new eBooksGUI();
        myEGUI.setVisible(true);
        
    }
  
    
}
