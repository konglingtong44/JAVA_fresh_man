/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class PatientCaseDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    public List<PatientCaseExt> getPatientCases(){
     List<PatientCaseExt>  pcList = new ArrayList<PatientCaseExt>();
     StringBuffer sb = new StringBuffer();
     sb.append("SELECT patientcase.*,drug.drugName");
     sb.append(" FROM patientcase");
     sb.append(" INNER	 JOIN drug");
     sb.append(" ON patientcase.drugId = drug.drugID");
     
       
    
        try{
           
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sb.toString());
            rs = pstm.executeQuery();
            
            PatientCaseExt pc = null;
            
            while(rs.next()){
                pc = new PatientCaseExt();
                pc.setPatientID(rs.getInt("patientID"));
                pc.setIllnessCase(rs.getString("illnessCase"));
                
                pc.setPatientSolve(rs.getString("patientSolve"));
                pc.setDrugID(rs.getInt("drugId"));
                pc.setDrugName(rs.getString("drugName"));
                
                
                pcList.add(pc);
            }
            return pcList;
    }catch(Exception e){
            e.printStackTrace();
            }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
}
}
