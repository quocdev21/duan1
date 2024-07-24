/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import response.HoaDonResponse;


/**
 *
 * @author pc
 */
public class HoaDonRepo {
    public ArrayList<HoaDonResponse> getAllHD(){
        ArrayList<HoaDonResponse> listhd = new ArrayList<>();
        String sql = """
                     SELECT dbo.HoaDon.ID_Hoa_Don, dbo.Khach_hang.CCCD, dbo.Khach_hang.TenKhachHang, dbo.Khach_hang.Gioi_Tinh, dbo.Khach_hang.SDT, dbo.HoaDon.Thoi_Gian_Tao, dbo.NhanVien.ID_Nhan_Vien
                         FROM     dbo.HoaDon INNER JOIN
                                           dbo.Khach_hang ON dbo.HoaDon.ID_Khach_Hang = dbo.Khach_hang.ID_Khach_Hang CROSS JOIN
                                           dbo.NhanVien
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HoaDonResponse hd = HoaDonResponse.builder()
                        .ID_HoaDon(rs.getString(1))
                        .SoCCCD(rs.getString(2))
                        .TenKhachHang(rs.getString(3))
                        .GioiTinh(rs.getBoolean(4))
                        .SDT(rs.getString(5))
                        .ThoiGianTao(rs.getString(6))
                        .build();
                listhd.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listhd;
    }
    public static void main(String[] args) {
        System.out.println(new HoaDonRepo().getAllHD());
    }
}
