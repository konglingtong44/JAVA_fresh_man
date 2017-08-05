/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Check;
import entity.PatientBuy;
import entity.PatientBuyExt;
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
public class PatientDrugDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public List<PatientBuy> getPatientBuy(int id){
        String patientBuySelectSql = "SELECT * FROM patientbuy where patientID = " + id;
     
        List<PatientBuy> patientBuyList = new ArrayList<PatientBuy>();
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(patientBuySelectSql);
            rs = pstm.executeQuery();
            
            PatientBuy patientBuy = null;
            
            while(rs.next()){
                patientBuy = new PatientBuy();
                patientBuy.setDrugID(rs.getInt("drugID"));
                patientBuy.setDrugName(rs.getString("drugName"));
                patientBuy.setDrugPrice(rs.getInt("drugPrice"));
                patientBuy.setDrugNum(rs.getInt("drugNum"));
                
                patientBuyList.add(patientBuy);
                
            }
            System.out.println(patientBuyList.size());
            return patientBuyList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
        public List<PatientBuyExt> getPatientBuyAndDrug(int id){
        String patientBuySelectSql = "SELECT patientbuy.*, drug.* FROM patientbuy INNER JOIN drug ON patientbuy.drugID = drug.drugID WHERE patientbuy.patientID =  " + id;
     
        List<PatientBuyExt> patientBuyExtList = new ArrayList<PatientBuyExt>();
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(patientBuySelectSql);
            rs = pstm.executeQuery();
            
            PatientBuyExt patientBuyExt = null;
            
            while(rs.next()){
                patientBuyExt = new PatientBuyExt();
                patientBuyExt.setDrugName(rs.getString("drugName"));
                patientBuyExt.setDrugID(rs.getInt("drugID"));
                patientBuyExt.setDrugNum(rs.getInt("drugNum"));
                patientBuyExt.setDrugStock(rs.getInt("drugStock"));
                
                
                patientBuyExtList.add(patientBuyExt);
                
            }
            return patientBuyExtList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
    }
    
}
