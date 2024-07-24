/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.KhachHang;
import config.DBConnect;
import entity.HoaDon;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author pc
 */
public class HoaDonRepo {

    public ArrayList<HoaDon> getHD() {
        ArrayList<HoaDon> listhd = new ArrayList<>();
        String sql = """
                     SELECT 
                            [ID_Hoa_Don]
                           ,[Thoi_Gian_Tao]
                     FROM [dbo].[HoaDon]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setID_HoaDon(rs.getString(1));
                hd.setThoiGianTao(rs.getString(2));
                listhd.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listhd;
    }

    public ArrayList<KhachHang> getKH() {
        ArrayList<KhachHang> listkh = new ArrayList<>();
        String sql = """
                     SELECT
                           [TenKhachHang]
                           ,[Gioi_Tinh]
                           ,[SDT]
                           ,[CCCD]
                       FROM [dbo].[KhachHang]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setSoCCCD(rs.getString(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setGioiTinh(rs.getString(3));
                kh.setSDT(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listkh;
    }

    public static void main(String[] args) {

        System.out.println(new HoaDonRepo().getHD());

    }
}
