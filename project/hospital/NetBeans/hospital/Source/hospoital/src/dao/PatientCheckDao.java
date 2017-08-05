/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.PatientCheck;
import java.util.ArrayList;
import java.util.List;
import util.DBUtil;

/**
 *
 * @author Administrator
 */
public class PatientCheckDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public List<PatientCheck> getAllPatientCheck(){
        String patientCheckSelectSql = "select * from patientcheck";
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(patientCheckSelectSql);
            rs = pstm.executeQuery();
            
            PatientCheck patientCheck = null;
            List<PatientCheck> patientCheckList = new ArrayList<PatientCheck>();
            
            while(rs.next()){
                patientCheck = new PatientCheck();
                patientCheck.setPatientID(rs.getInt("patientID"));
                patientCheck.setPatientName(rs.getString("patientName"));
                patientCheck.setGetFlag(rs.getString("getFlag"));
                
                patientCheckList.add(patientCheck);   
            }
            return patientCheckList;
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
    }
}
