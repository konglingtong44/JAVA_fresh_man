/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Drug;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.DBUtil;

/**
 *
 * @author TENCENT
 */
public class drugRoomDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
  
    public int updateDrugRoom(Drug drugroom){
        String sql = "update drug set drugStock = drugStock + ? where drugName = ?";
        try {
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, drugroom.getDrugStock());
            pstm.setString(2, drugroom.getDrugName());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
            
        }
        return 0;
    }
    
    public int deleteDrugRoom(Drug drugroom){
         try {
            conn = DBUtil.getConn();
          
            String sql = "delete from drug where drugName = ?";
            pstm = conn.prepareStatement(sql);
           
             pstm.setString(1, drugroom.getDrugName());
            
            int row = pstm.executeUpdate();
            System.out.println(row);
          
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
         return 0;
    } 
    
    
    public List<Drug> getDrugRoom(){
        List<Drug> rooms = new ArrayList<Drug>();
        try {
            String sql = "Select * from Drug";
            conn = DBUtil.getConn();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Drug room = null;
            while(rs.next()){
                room = new Drug();
                room.setDrugName(rs.getString("drugName"));
                room.setDrugStock(rs.getInt("drugStock"));
                rooms.add(room);
            }
            return rooms;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, pstm);
        }
        return null;
    }
    
}
