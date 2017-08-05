/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Drug;
import entity.PatientBuy;
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
public class DrugStockDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    
    public List<PatientBuy> GetdrugListWithPID(int PatientID){
        String drugListWithPIDSelectSql = "select * from patientBuy where patientID = " + PatientID;
        List<PatientBuy>  drugsIDANDNum = new ArrayList<PatientBuy>();

        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(drugListWithPIDSelectSql);
            rs1 = pstm.executeQuery();
            PatientBuy patientBuy = null;
//            List<Drug> drugList = new ArrayList<Drug>();
            
            while(rs1.next()){
                patientBuy = new PatientBuy();
                patientBuy.setDrugID(rs1.getInt("drugID"));
                patientBuy.setDrugNum(rs1.getInt("drugNum"));
//                System.out.println(rs.getInt("drugID"));
//                System.out.println(drugIDList[i]);
                drugsIDANDNum.add(patientBuy);
            }
//            for (int i = 0; i<drugsIDANDNum.size(); i++){
//                System.out.println(drugsIDANDNum.get(i).getDrugID());
//            }
//            for(int j = 0; j<drugIDList.length; j++){
//                System.out.println(drugIDList[j]);
//            }
                return drugsIDANDNum;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs1, conn, pstm);
        }
        return null;
    }
    
    public void drugStockUpdate(int drugID, int Num){
        int newDrugStock = 0;
        String drugIDSelectSql = "SELECT * FROM drug WHERE drugID = "+ drugID;
        

        
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(drugIDSelectSql);
            rs1 = pstm.executeQuery();
            
            while (rs1.next()){
                newDrugStock = rs1.getInt("drugStock");
                System.out.println(rs1.getDouble("drugStock"));
                newDrugStock = newDrugStock - Num;
                 try {
                    String drugStockUpdate = "UPDATE drug SET drugStock = "+newDrugStock+" WHERE drugID =" + drugID;
                    conn = DBUtil.getConn();
                    pstm = conn.prepareCall(drugStockUpdate);
                    pstm.executeUpdate();
                
                } catch (Exception e) {
                    e.printStackTrace();;
                }finally{
                    DBUtil.close(rs2, conn, pstm);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs1, conn, pstm);
        }
    }
}
