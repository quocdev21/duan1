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

    public ArrayList<HoaDon> getAll() {
        String sql = """
                     SELECT
                     [H.SoHoChieu],
                     [KH.TenKhachHang],
                     [KH.SDT],
                     [HD.IDHoaDon],
                     [HD.ThoiGianTao]
                     FROM HOADON HD JOIN CHITIETKHACHHANG KH
                     ON HD.IDKhachHang=KH.IDKhachHang
                     """;
        ArrayList<HoaDon> lists = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                KhachHang kh = new KhachHang();
                kh.setSoHoChieu(rs.getString(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setSDT(rs.getString(3));
                hd.setMaHoaDon(rs.getString(4));
//                hd.setThoiGianTao(rs.getDate(5));
                lists.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
}
