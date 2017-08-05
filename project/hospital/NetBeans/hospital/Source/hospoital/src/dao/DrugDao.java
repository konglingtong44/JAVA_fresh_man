/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Drug;
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
public class DrugDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    
    public int AddDrug(Drug drug){
    
        String sql = "insert into drug values(0,?,?,?,?,?,)";
        try{
        conn = DBUtil.getConn();
        pstm = conn.prepareStatement(sql);
        pstm.setInt(1,drug.getDrugID());
          pstm.setString(2,drug.getDrugTypeName());
            pstm.setString(3,drug.getDrugName());
              pstm.setInt(4,drug.getDrugPrice());
                pstm.setInt(5,drug.getDrugStock());
        return pstm.executeUpdate();
        
            
        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return 0;       
    }
    public List<Drug> getDrugs(){
     List<Drug>  drugs = new ArrayList<Drug>();
    
        try{
            String sql = "select * from drug";
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Drug drug = null;
            
            while(rs.next()){
                drug = new Drug();
                drug.setDrugID(rs.getInt("drugID"));
                drug.setDrugTypeID(rs.getInt("drugTypeID"));
                drug.setDrugTypeName(rs.getString("drugTypeName"));
                drug.setDrugName(rs.getString("drugName"));
                drug.setDrugPrice(rs.getInt("drugPrice"));
                drug.setDrugStock(rs.getInt("drugStock"));
                drugs.add(drug);
            }
            return drugs;
    }catch(Exception e){
            e.printStackTrace();
            }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
}
    
    
    public List<Drug> getDrugs(int id){
     List<Drug>  drugs = new ArrayList<Drug>();
    
        try{
            String sql = "select * from drug";
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Drug drug = null;
            
            while(rs.next()){
                drug = new Drug();
                drug.setDrugID(rs.getInt("drugID"));
                drug.setDrugTypeID(rs.getInt("drugTypeID"));
                drug.setDrugTypeName(rs.getString("drugTypeName"));
                drug.setDrugName(rs.getString("drugName"));
                drug.setDrugPrice(rs.getInt("drugPrice"));
                drug.setDrugStock(rs.getInt("drugStock"));
                drugs.add(drug);
            }
            return drugs;
    }catch(Exception e){
            e.printStackTrace();
            }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
}
}
