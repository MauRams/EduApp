/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.io.Serializable;

/**
 *
 * @author Maurice Ramsbottom
 */

public class eBookList implements Serializable {
    //variables
    String bookTitle;
    String bookAuthor;
//getters setters
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
 
    public String Display(){
        
        String List;
        
        List = "Book Title: "+bookTitle+
                "\nBook Author: "+bookAuthor;
        
        return List;
        
    }
}
