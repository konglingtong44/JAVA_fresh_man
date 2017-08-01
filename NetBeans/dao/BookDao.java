/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DBUtil;

/**
 *
 * @author Administrator
 */
public class BookDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public int AddBook(Book book){
       
        String addSql = "insert into book values (0, ?, ?)";
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(addSql);
            pstm.setString(1, book.getBookName());
            pstm.setInt(2, book.getBookTypeID());
            return pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(rs, conn, pstm);
        }
        return 0;
    }
}
