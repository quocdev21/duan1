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
    public ArrayList<HoaDonRepo> getAllHD(String maHD){
        ArrayList<HoaDonRepo> listhd = new ArrayList<>();
        String sql = """
                     SELECT 
                         hd.ID_Hoa_Don,
                         kh.CCCD AS So_CCCD_Khach_Hang,
                         kh.TenKhachHang AS Ten_Khach_Hang,
                         kh.Gioi_Tinh AS Gioi_Tinh,
                         kh.SDT AS SDT,
                         hd.Thoi_Gian_Tao AS Ngay_Tao,
                         nv.ID_TaiKhoan AS ID_NhanVien
                     FROM 
                         HoaDon hd
                     JOIN 
                         Khach_hang kh ON hd.ID_Khach_Hang = kh.ID_Khach_Hang
                     JOIN 
                         NhanVien nv ON hd.ID_Nhan_Vien = nv.ID_TaiKhoan;
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maHD);
        } catch (Exception e) {
        }
    }
}
