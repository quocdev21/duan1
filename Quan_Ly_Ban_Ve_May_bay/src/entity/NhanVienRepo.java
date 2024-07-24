/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import config.DBConnect;
import entity.NhanVien;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Array;
import java.sql.DriverManager;
import java.util.ArrayList;
public class NhanVienRepo {
    private Connection conn;
    public NhanVienRepo(){
        try{
            this.conn = DBConnect.getConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
  public  ArrayList<NhanVien> findAll(){
        ArrayList<NhanVien> list = new ArrayList();
        try{
            String sql = "Select *  from NHANVIEN inner join Thong_Tin_Ca_Nhan on NHANVIEN.ID_ThongTinCaNhan = Thong_Tin_Ca_Nhan.ID_ThongTinCaNhan  ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()){
                String ID_Nhan_Vien = rs.getString("ID_Nhan_Vien");        
                String ID_TaiKhoan = rs.getString("ID_TaiKhoan");
                String ID_ThongTinCaNhan = rs.getString("ID_ThongTinCaNhan"); 
                String ID_Bao_Cao = rs.getString("ID_Bao_Cao");
                int Trang_Thai = rs.getInt("Trang_Thai");
                int Luong = rs.getInt("Luong");
                String Chuc_Vu = rs.getString("Chuc_Vu");
                
               String Ten_Nhan_Vien = rs.getString("Ten_Nhan_Vien");
               int So_cccd = rs.getShort("So_cccd");
               int sdt = rs.getShort("Sdt");
               String Dia_Chi = rs.getString("Dia_Chi");
               String Email = rs.getString("Email");
               
               NhanVien nv = new NhanVien(ID_Nhan_Vien, ID_TaiKhoan, ID_ThongTinCaNhan, ID_Bao_Cao, Trang_Thai, Luong, Chuc_Vu, Ten_Nhan_Vien, So_cccd, sdt, Dia_Chi, Email );
               list.add(nv);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
}
