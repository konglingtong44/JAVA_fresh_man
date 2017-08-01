/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.BookType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBUtil;

/**
 *
 * @author Administrator
 */
public class TypeDao {
    public List<BookType> getTypes(){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<BookType> types = new ArrayList<BookType>();
        try {
            String getTypesSql = "select * from booktype";
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(getTypesSql);
            rs = pstm.executeQuery();
            BookType bookType = null;
            while (rs.next()){
                bookType = new BookType();
                bookType.setBookNo(rs.getInt("BookTypeID"));
                bookType.setBookName(rs.getString("BookTypeName"));
                types.add(bookType);
            }
            return types;
        } catch (Exception e) {
            e.printStackTrace();;
        }finally{
            util.DBUtil.close(rs, conn, pstm);;
        }
         return null;
    }
   
}
