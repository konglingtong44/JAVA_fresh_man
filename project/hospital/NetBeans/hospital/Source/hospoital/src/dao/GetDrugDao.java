/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Doctor;
import entity.DrugGet;
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
public class GetDrugDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    
    public List<DrugGet> getDrugGet(){
        String drugGetSelectSql = "select * from drugget";
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(drugGetSelectSql.toString());
            rs1 = pstm.executeQuery();
            
            DrugGet drugGet = null;
            List<DrugGet> drugGetList = new ArrayList<DrugGet>();
            
            while(rs1.next()){
                drugGet = new DrugGet();
                drugGet.setPatientID(rs1.getInt("patientID"));
                drugGet.setPatientName(rs1.getString("patientName"));
                drugGet.setCheckFlag(rs1.getString("checkFlag"));
                drugGet.setGetFlag(rs1.getString("getFlag"));
                drugGetList.add(drugGet);
            }
            
            return drugGetList;
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs1, conn, pstm);
        }
        
        return null;
    }
    
    public int updateDrugGet(int id){
        String selectSql = "select getFlag from patientcheck where patientID = " + id;
        String drugGetUpdateSql = "UPDATE patientcheck SET getFlag = 0 WHERE patientID =  "+ id;
        
        int checkFlag = 0;
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(selectSql);
            rs1 = pstm.executeQuery(); 
            PatientCheck patientCheck = null;
            
            while(rs1.next()){
                patientCheck = new PatientCheck();
                patientCheck.setGetFlag(rs1.getString("getFlag"));
                checkFlag = Integer.parseInt(rs1.getString("getFlag"));

                if(checkFlag == 1){
                    try {
                        conn = DBUtil.getConn();
                        pstm = conn.prepareCall(drugGetUpdateSql);
                        return pstm.executeUpdate();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally{
                        DBUtil.close(rs2, conn, pstm);
                    }
                }else{
                    return 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs1, conn, pstm);
        }
        System.out.println(checkFlag);
       
        return 0;
    }
}
