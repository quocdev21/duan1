/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.ChuyenBay;
import entity.MayBay;
import entity.SanBay;
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
                 select cb.ID_Chuyen_Bay, mb.HangMayBay, sbcc.Ten_San_Bay, sbhc.Ten_San_Bay, cb.NgayDi, cb.ThoiGianDen, cb.ThoiGianDi
                 from ChuyenBay cb
                 join SanBay sbcc on cb.ID_San_Bay_Cat_Canh = sbcc.ID_San_Bay
                 join MayBay mb on cb.ID_May_Bay = mb.ID_May_Bay
                 join SanBay sbhc on cb.ID_San_Bay_Ha_Canh = sbhc.ID_San_Bay""";
    
        try(Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MayBay mb = new MayBay();
                mb.setHangMaybay(rs.getString(5));
                
                SanBay sb = new SanBay();
                sb.setTenSanBay(rs.getString(6));
                
                ChuyenBay cb = new ChuyenBay();
                cb.setIdChuyenBay(rs.getString(1));
                cb.setNgayDi(rs.getDate(2));
                cb.setThoiGianDen(rs.getDate(3));
                cb.setThoiGianDi(rs.getDate(4));
                

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
