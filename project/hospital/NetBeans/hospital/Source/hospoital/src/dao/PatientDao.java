/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entity.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DBUtil;
import entity.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PatientDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
        
    public List<Patient> getPatients(){
     List<Patient>  patients = new ArrayList<Patient>();
    
        try{
            String sql = "select * from patient";
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Patient patient = null;
            
            while(rs.next()){
                patient = new Patient();
                patient.setPatientID(rs.getInt("patientID"));
                patient.setPatientName(rs.getString("patientName"));
                patient.setPatientAge(rs.getInt("patientAge"));
                patient.setPatientSex(rs.getString("patientSex"));
                patient.setPatientAllergic(rs.getString("patientAllergic"));
                patient.setDepartmentName(rs.getString("departmentName"));
                patient.setDoctorName(rs.getString("doctorName"));
                
                patients.add(patient);
            }
            return patients;
    }catch(Exception e){
            e.printStackTrace();
            }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
}
    public int addPatient(Patient patient){                      //增加患者信息函数
        String sql="insert into patient values(0,?,?,?,?,?,?)";
         try {
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1,patient.getPatientName());
            pstm.setString(2, patient.getPatientAge()+"");
            pstm.setString(3,patient.getPatientSex());
            pstm.setString(4,patient.getPatientAllergic());
            pstm.setString(5,patient.getDepartmentName());
            pstm.setString(6,patient.getDoctorName());
            
            return pstm.executeUpdate();
            
         } catch (Exception e) {
             e.printStackTrace();
 
         } finally{
             DBUtil.close(rs, conn, pstm);
 
         }
         return 0;
    }
    
    public List<Patient> selectPatient(int Tid){          //查询患者信息
        
        String sql="select * from patient where patientID =" + Tid;
        
        try {
            conn=DBUtil.getConn();
            pstm=conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Patient patient2=null;
            List<Patient> patientList=new ArrayList<Patient>();
            
            while (rs.next()) {     
                patient2 =new Patient();
                patient2.setPatientID(rs.getInt("patientId"));
                patient2.setPatientName(rs.getString("patientName"));
                patient2.setPatientSex(rs.getString("patientSex"));
                patient2.setPatientAge(rs.getInt("patientAge"));
                patient2.setPatientAllergic(rs.getString("patientAllergic"));
                patient2.setDepartmentName(rs.getString("departmentName"));
                patient2.setDoctorName(rs.getString("doctorName"));
                
                patientList.add(patient2);
            }
            return patientList;
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        
        }
       return null;

    }
    
    
      public List<Patient> selectPatient(){          //查询患者信息
        
        String sql="select * from patient ";
        
        try {
            conn=DBUtil.getConn();
            pstm=conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Patient patient2=null;
            List<Patient> patientList=new ArrayList<Patient>();
            
            while (rs.next()) {     
                patient2 =new Patient();
                patient2.setPatientID(rs.getInt("patientId"));
                patient2.setPatientName(rs.getString("patientName"));
                patient2.setPatientSex(rs.getString("patientSex"));
                patient2.setPatientAge(rs.getInt("patientAge"));
                patient2.setPatientAllergic(rs.getString("patientAllergic"));
                patient2.setDepartmentName(rs.getString("departmentName"));
                patient2.setDoctorName(rs.getString("doctorName"));
                
                patientList.add(patient2);
            }
            return patientList;
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        
        }
       return null;

    }
    
    public int updatePatient(Patient patient, int ID){                //修改患者信息函数
        String sql="update patient set patientName=?,patientAge=?,patientSex=?,"
                + "patientAllergic=?,departmentName=?,doctorName=? where patientId="+ID;
        try {
            conn=DBUtil.getConn();
            pstm=conn.prepareStatement(sql);
            
           
            pstm.setString(1, patient.getPatientName());
            pstm.setInt(2, patient.getPatientAge());
            pstm.setString(3, patient.getPatientSex());
            pstm.setString(4, patient.getPatientAllergic());
            pstm.setString(5, patient.getDepartmentName());
            pstm.setString(6,patient.getDoctorName());
            
            
            return pstm.executeUpdate();
                    
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        
        }                
        
        return 0;
    
    }
    
    public int deletePatient(Patient patient){               //删除患者信息函数
      
        try {
            conn=DBUtil.getConn();
            
          
            
            
            String sql2 = "delete from drugget where patientId  = ?";
            pstm=conn.prepareStatement(sql2);
            pstm.setInt(1,patient.getPatientID());
            pstm.executeUpdate();
            
            
            String sql3 = "delete from patientbuy where patientId  = ?";
            pstm=conn.prepareStatement(sql3);
            pstm.setInt(1,patient.getPatientID());
            pstm.executeUpdate();
            
            String sql4 = "delete from patientcase where patientId  = ?";
            pstm=conn.prepareStatement(sql4);
            pstm.setInt(1,patient.getPatientID());
            pstm.executeUpdate();
            
            String sql5 = "delete from patientcheck where patientId  = ?";
            pstm=conn.prepareStatement(sql5);
            pstm.setInt(1,patient.getPatientID());
            pstm.executeUpdate();
            
            String sql1 = "delete from patient where patientId  = ?";
            pstm=conn.prepareStatement(sql1);
            pstm.setInt(1,patient.getPatientID());
            return pstm.executeUpdate();
//             pstm.setString(2, patient.getPatientName());
//             pstm.setString(3, patient.getPatientSex());
//             pstm.setString(4, patient.getPatientAge()+"");
//             pstm.setString(5, patient.getPatientAllergic());
//             pstm.setString(6, patient.getDepartmentName());
//             pstm.setString(7, patient.getDoctorName());
            
                    
          
    
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        
        }
        
        
        
        return 0;

    }
    
    
   
}
