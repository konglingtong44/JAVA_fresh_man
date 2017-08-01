/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class EmpDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public void addEmp(){
        try {
            int deptId = 0;
            
            conn = util.DBUtil.getConn();
            
            String sqlInsertDept = "insert into dept values (0, ?)"; 
            String sqlInsertEmp = "insert into emp values (0, ?, ?)";  
            
            pstm = conn.prepareStatement(sqlInsertDept, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, "开发部");
            pstm.executeUpdate();
            
            rs = pstm.getGeneratedKeys();
            if(rs.next()){
                deptId = rs.getInt(1);
            }
            
            pstm = conn.prepareStatement(sqlInsertEmp);
            pstm.setString(1, "成龙");
            pstm.setInt(2, deptId);
            
            pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            util.DBUtil.close(rs, conn, pstm);
        }

    }
}
