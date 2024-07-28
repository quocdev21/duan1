/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author pc
 */
public class DangNhapRepo {

    protected Connection con;

    public String checkLogin(NhanVien nv) {
        try {
            String sql = "select * from NhanVien where MaNhanVien = ? and MatKhau = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getMaNhanVien());
            ps.setString(2, nv.getMatKhau());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString(3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
