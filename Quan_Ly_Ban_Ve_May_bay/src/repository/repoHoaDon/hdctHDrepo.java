/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.repoHoaDon;

import config.DBConnect;
import entity.HoaDonCT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class hdctHDrepo {
    public ArrayList<HoaDonCT> getAll() {
        ArrayList<HoaDonCT> lists = new ArrayList<>();
        String sql = """
                     SELECT [ID_Hoa_Don_Chi_Tiet],
                            [ID_Ve]
                       FROM [dbo].[HoaDonChiTiet]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCT hdct = new HoaDonCT();
                hdct.setIDHoaDonCT(rs.getString(1));
                hdct.setIDVe(rs.getString(2));
                lists.add(hdct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
}
