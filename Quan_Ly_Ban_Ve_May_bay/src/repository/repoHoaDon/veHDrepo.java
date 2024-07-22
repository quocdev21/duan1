/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.repoHoaDon;

import config.DBConnect;
import entity.Ve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author pc
 */
public class veHDrepo {
    public ArrayList<Ve> getAll() {
        ArrayList<Ve> lists = new ArrayList<>();
        String sql = """
                     SELECT [ID_Ve]
                           ,[ID_Khach_Hang]
                       FROM [dbo].[Ve]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ve v = new Ve();
                v.setIDVe(rs.getString(1));
                v.setIDKhachHang(rs.getString(2));
                lists.add(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
}
