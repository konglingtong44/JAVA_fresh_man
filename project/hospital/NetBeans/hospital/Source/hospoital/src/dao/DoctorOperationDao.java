/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Doctor;
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
public class DoctorOperationDao {                                            //医生操作包
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
                                                                                 
    public List<Doctor> getAllDoctor(){                                       //遍历所有医生信息函数
        StringBuffer selectAllSql = new StringBuffer();
        selectAllSql.append("SELECT doctor.*, department.departmentName")
                .append("    FROM doctor")
                .append("    INNER JOIN department")
                .append("    WHERE doctor.departmentID = department.departmentID");
                
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(selectAllSql.toString());
            rs = pstm.executeQuery();
            
            Doctor doctor = null;
            List<Doctor> doctorList = new ArrayList<Doctor>();
            
            while(rs.next()){                                                   //当有数据的时候，像list里添加数据
                doctor = new Doctor();
                doctor.setDoctorID(rs.getInt("doctorID"));
                doctor.setDoctorName(rs.getString("doctorName"));
                doctor.setDoctorAge(rs.getInt("doctorAge"));
                doctor.setDepartmentName(rs.getString("departmentName"));
                doctorList.add(doctor);
            }
                return doctorList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
    }
    
    public int addDoctor(Doctor doctor){                                        //增加医生信息函数
        String addDoctorSql = "insert into doctor values (0, ?, ?, ?, ?, ?)";
        return 0;
    }
    
    public int updateDoctor(Doctor doctor){                                     //修改医生信息函数
        String updateDoctorSql = "update doctor set doctorName = ?, doctorSex = ?, doctorAge = ?, departmentNo = ?, doctorSalary = ?";
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareCall(updateDoctorSql);
            pstm.setString(1, doctor.getDoctorName());
        } catch (Exception e) {
        }
        return 0;
    }
}
