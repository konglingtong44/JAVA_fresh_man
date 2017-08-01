/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Book {
    private int BookID;
    private String BookName;
    private int BookTypeID;

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public int getBookTypeID() {
        return BookTypeID;
    }

    public void setBookTypeID(int BookTypeID) {
        this.BookTypeID = BookTypeID;
    }
    
    
}
