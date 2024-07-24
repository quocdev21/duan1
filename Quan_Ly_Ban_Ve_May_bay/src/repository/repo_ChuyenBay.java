/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.ChuyenBay;
import entity.MayBay;
import entity.Ve;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Simp
 */
public class repo_ChuyenBay {
    public ArrayList<ChuyenBay> getAll(){
    ArrayList<ChuyenBay> list = new ArrayList<>();
    
    String sql = """
                 Select cb.IDChuyenBay, mb.HangMayBay, VE.DiaDiemDi, VE.DiaDiemDen, cb.NgayDi, cb.ThoiGianDen, cb.ThoiGianDi, VE.GiaTien
                 from VE , CHUYENBAY cb , MAYBAY mb where VE.IDChuyenBay = cb.IDChuyenBay AND  cb.IDMayBay = mb.IDMayBay""";
    
        try(Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MayBay mb = new MayBay();
                mb.setHangMaybay(rs.getString(2));
                
                Ve ve = new Ve();
                ve.setNgayMua(rs.getDate(5));
                ve.setGiaTien(rs.getFloat(8));
                
                
                ChuyenBay cb = new ChuyenBay();
                cb.setIdChuyenBay(rs.getString(1));
                cb.setThoiGianDen(rs.getInt(6));
                cb.setThoiGianDi(rs.getInt(7));
                

                list.add(cb);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(new repo_ChuyenBay().getAll());
    }
}
