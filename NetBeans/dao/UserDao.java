/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class UserDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public void addUser(List<User> userList){
        try {
            conn = util.DBUtil.getConn();
            String sqlAdd = "insert into user  values(0, ?, ?)";
            pstm = conn.prepareStatement(sqlAdd);
            
            for (int i = 0; i < userList.size(); i++){
                User user = userList.get(i);
                
                pstm.setString(1, user.getUser_id());
                pstm.setString(2, user.getUser_password());
                
                pstm.addBatch();
            }
                pstm.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();;
        }finally{
            util.DBUtil.close(rs, conn, pstm);
        }
    }
}
