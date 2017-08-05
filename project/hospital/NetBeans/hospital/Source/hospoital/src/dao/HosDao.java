/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entity.PatientBuy;
import entity.PatientCase;
import entity.PatientCaseExt;
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
public class HosDao {
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    
    public int AddPatientCase(PatientCase pc){
    
        String sql = "insert into patientcase values(?,?,?)";
       
        try{
        conn = DBUtil.getConn();
        pstm = conn.prepareStatement(sql);
        pstm.setInt(1,pc.getPatientID());
        pstm.setString(2,pc.getIllnessCase());
        pstm.setString(3, pc.getPatientSolve());
        return pstm.executeUpdate();
        
            
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return 0;
        
    }
    
        public int AddPatientBuy(PatientBuy pb){
    
        String sql = "insert into patientbuy values(?,?,?,?,?)";
       
        try{
        conn = DBUtil.getConn();
        pstm = conn.prepareStatement(sql);
        pstm.setInt(1,pb.getPatientID());
        pstm.setInt(2,pb.getDrugID());
        pstm.setInt(3, pb.getDrugNum());
        pstm.setString(4, pb.getDrugName());
        pstm.setDouble(5, pb.getDrugPrice());

        return pstm.executeUpdate();
        
            
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return 0;
        
    }
    
   public List<PatientCase> getPatientCase(int id){
       List<PatientCase>  pcList = new ArrayList<PatientCase>();
       String patientCaseSelectSql = "select * from patientcase where patientID = " + id;
       try {
           conn = DBUtil.getConn();
            pstm = conn.prepareStatement(patientCaseSelectSql);
            rs = pstm.executeQuery();
            PatientCase pc = null;
            
            while(rs.next()){
                pc = new PatientCase();
                pc.setIllnessCase(rs.getString("illnessCase"));
                pc.setPatientSolve(rs.getString("patientSolve"));
                pcList.add(pc);
            }
            return pcList;
       } catch (Exception e) {
           e.printStackTrace();
       }finally{
           DBUtil.close(rs, conn, pstm);
       }
       return null;
   }
    
   
   
    
   public List<PatientBuy> getPatientBuy(int id){
       List<PatientBuy>  pbList = new ArrayList<PatientBuy>();
       String patientBuySelectSql = "select * from patientbuy where patientID = " + id;
       try {
           conn = DBUtil.getConn();
            pstm = conn.prepareStatement(patientBuySelectSql);
            rs = pstm.executeQuery();
            PatientBuy pb = null;
            
            while(rs.next()){
                pb = new PatientBuy();
                pb.setDrugID(rs.getInt("drugID"));
                pb.setDrugName(rs.getString("drugName"));
                pb.setDrugNum(rs.getInt("drugNum"));
                pbList.add(pb);
            }
            return pbList;
       } catch (Exception e) {
           e.printStackTrace();
       }finally{
           DBUtil.close(rs, conn, pstm);
       }
       return null;
   }
    
//   public List<PatientCaseExt> getPatientCases(){
//     List<PatientCaseExt>  pcList = new ArrayList<PatientCaseExt>();
//     StringBuffer sb = new StringBuffer();
//     sb.append("SELECT patientcase.*,drug.drugName");
//     sb.append(" FROM patientcase");
//     sb.append(" INNER	 JOIN drug");
//     sb.append(" ON patientcase.drugId = drug.drugID");
//     
//       
//    
//        try{
//           
//            conn = DBUtil.getConn();
//            pstm = conn.prepareStatement(sb.toString());
//            rs = pstm.executeQuery();
//            
//            PatientCaseExt pc = null;
//            
//            while(rs.next()){
//                pc = new PatientCaseExt();
//                pc.setPatientID(rs.getInt("patientID"));
//                pc.setIllnessCase(rs.getString("illnessCase"));
//                
//                pc.setPatientSolve(rs.getString("patientSolve"));
//                pc.setDrugId(rs.getInt("drugId"));
//                pc.setDrugName(rs.getString("drugName"));
//                
//                
//                pcList.add(pc);
//            }
//            return pcList;
//    }catch(Exception e){
//            e.printStackTrace();
//            }finally{
//            DBUtil.close(rs, conn, pstm);
//        }
//        return null;
//}
}

