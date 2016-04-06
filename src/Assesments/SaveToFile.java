/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Deniss
 */
//JUST USING THIS METHOD AS WHOLE SEPARATE CLASSBECAUSE OTHERWISE I WOULD HAVE TO DUPLICATE THIS
public class SaveToFile {
    TableRow trx;
    ArrayList<TableRow> tableList;
    //Overloaded constructor, takes in object Which after writes to file
    public SaveToFile(TableRow trr){
         trx = new TableRow();
         this.trx = trr;
         tableList = new ArrayList<TableRow>();
  
    }
           
   public void Init(){
        //Getting info alreadi in the file
       //It seems have to copy all existing info to an array list and then
       //add new entry
       //Only that way it would desirialize correctly afterwards
       ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("Assesments.trs"));
            try {

                TableRow tr = null;            
                
                this.tableList.clear(); // Clear the list to previent duplication

                // Read the data and display on the console
                while (true) {

                    Object obj = in.readObject();
                    tr = (TableRow)obj;
                    this.tableList.add(tr);
                }            
            }
            catch(ClassCastException ex) {
                
                JOptionPane.showMessageDialog(null, "Deserialision Error : " + ex.getMessage());
            }
            catch (ClassNotFoundException ex) {
                
                JOptionPane.showMessageDialog(null, "Deserialision Error : " + ex.getMessage());
            }
            catch (EOFException ex) {   // Notice that ObjectInputStream detects an end-of-file condition by catching EOFException, 
                                        // instead of testing for an invalid return value.
                
                // ex.getMessage() will return "Deserialization error: null" e.g. it is not an error.
                // This means that we have reached the end of the file.    
            }         
        }
        catch(IOException ex) {
            
            JOptionPane.showMessageDialog(null, "Deserialision Error : " + ex.getMessage());
        }
        finally {
            
            if (in != null) {

                try {
                    
                    in.close();
                }
                catch(IOException ex) {

                    JOptionPane.showMessageDialog(null, "Deserialision Stream Close Error : " + ex.getMessage());
                }
            }
        }
       
       ObjectOutputStream out = null;
      
       
        try {
            out = new ObjectOutputStream(new FileOutputStream("Assesments.trs"));
             //Add loaded object to a list
            this.tableList.add(trx);
            for (int i=0; i < this.tableList.size(); i++){
                out.writeObject(this.tableList.get(i));
            }
        }
        catch(IOException ex) {
            
            JOptionPane.showMessageDialog(null, "Serialision Error : " + ex.getMessage());
        }
        finally {
            
            if (out != null) {

                try {
                    out.close();
                }
                catch(IOException ex) {

                    JOptionPane.showMessageDialog(null, "Serialision Stream Close Error : " + ex.getMessage());
                }
            }
        }
   }
}
