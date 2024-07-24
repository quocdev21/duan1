/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.repoHoaDon;

import config.DBConnect;
import entity.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class khHDrepo {

    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> lists = new ArrayList<>();
        String sql = """
                     SELECT [ID_Khach_Hang]
                           ,[TenKhachHang]
                           ,[Gioi_Tinh]
                           ,[SDT]
                           ,[CCCD]
                           ,[Email]
                           ,[DiaChi]
                       FROM [dbo].[KhachHang]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setIDKhachHang(rs.getString(1));
                kh.setSoCCCD(rs.getString(2));
                kh.setTenKhachHang(rs.getString(3));
                kh.setGioiTinh(rs.getString(4));
                kh.setSDT(rs.getString(5));
                lists.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
}
