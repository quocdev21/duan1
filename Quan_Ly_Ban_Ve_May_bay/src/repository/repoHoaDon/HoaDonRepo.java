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
        ArrayList<HoaDon> lists = new ArrayList<>();
        String sql = """
                     SELECT [ID_Hoa_Don],
                            [Thoi_Gian_Tao]
                       FROM [dbo].[HoaDon]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setID_HoaDon(rs.getString(1));
                hd.setThoiGianTao(rs.getString(2));
                hd.setID_HoaDonCT(rs.getString(3));
                lists.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
}
