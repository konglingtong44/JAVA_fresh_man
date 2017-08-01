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
import util.DBUtil;

/**
 *
 * @author Administrator
 */
public class BookTypeDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public int AddType(BookType booktype){
       String insertSql = "insert into booktype values (0, ?)";
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(insertSql);
            pstm.setString(1, booktype.getBookName());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            util.DBUtil.close(rs, conn, pstm);
        }
        return 0;
    }
}
