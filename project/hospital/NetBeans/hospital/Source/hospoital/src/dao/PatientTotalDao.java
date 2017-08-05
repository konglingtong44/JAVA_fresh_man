/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.PatientBuy;
import entity.PatientCheck;
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
public class PatientTotalDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public double getPatientTotal(int id){
        String patientTotalSelectSql = "SELECT total FROM patientcheck WHERE patientID = "+ id;
        
        try{
           conn = DBUtil.getConn();
           pstm = conn.prepareStatement(patientTotalSelectSql);
           rs = pstm.executeQuery();
        
        double total = 0;
        while(rs.next()){
                total = rs.getDouble(1);
        }    
             return total;
    }catch (Exception e){
        e.printStackTrace();
    }
        return 0.0;
   }
    public double updatePatientTotal(int id, double sum){
        String patientTotalSelectSql = "INSERT INTO patientcheck(total,checkFlag)VALUES(" + sum + ", 1) where patientID = " + id;
        
        try{
           conn = DBUtil.getConn();
           pstm = conn.prepareStatement(patientTotalSelectSql);
           pstm.executeUpdate();
        
        double total = 0;
        while(rs.next()){
            
        }    
             return total;
    }catch (Exception e){
        e.printStackTrace();
    }
        return 0.0;
   } 
}

