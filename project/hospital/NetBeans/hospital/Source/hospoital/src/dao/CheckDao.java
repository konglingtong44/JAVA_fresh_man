/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Check;
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
public class CheckDao {
    
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public int addCheck(PatientCheck patientCheck, int patientID, double total, String patientName){
        
        String patientCheckInsertSql = "insert into patientcheck values(?,?,1,?, 1)";
        
        try{ 
            
        conn = DBUtil.getConn();
        pstm = conn.prepareStatement(patientCheckInsertSql);
        
        pstm.setString(1, patientID+"");
        pstm.setString(2, total+ "" );
        pstm.setString(3, patientName);

        
        return pstm.executeUpdate();
        }catch(Exception e){
             e.printStackTrace();
        }finally{
        DBUtil.close(rs, conn, pstm);
        }
        return 0;
        }
    
    public List<Check> getCheck(){

    List<Check> checks = new ArrayList<Check>();
    StringBuffer sb = new StringBuffer();
    sb.append("SELECT patientbuy.drugName,patientbuy.drugPrice,\n" +
"       patientbuy.drugNum,patientcheck.checkFlag")
      .append("  FROM patientbuy")
      .append(" INNER JOIN patientcheck")
      .append("    ON patientbuy.patientID = patientcheck.patientID  ");
        try{
            String sql = "select * from patient";
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Check check = null;
            while(rs.next()){
            check = new Check();
            check.setPatientNo(rs.getInt("patientID"));
            check.setPatientName(rs.getNString("patientName"));
            
            
            checks.add(check);
            
            }
            return checks;
            }catch(Exception e){
            e.printStackTrace();
            }finally{
            DBUtil.close(rs, conn, pstm);
            }
            return null;
            }
    
    }
    

