/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author pc
 */
public class MainRepo {
    protected Connection con;
    
    public String getHoTen(String ma){
        try {
            String sql = "select HoTen from NhanVien where MaNhanVien = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
