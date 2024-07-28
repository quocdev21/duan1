/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import config.DBConnect;
import entity.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public ArrayList<NhanVien> findAll(){
        
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        try{
            String sql = "SELECT * FROM NHANVIEN";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.execute();
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String MaNhanVien = rs.getString("MaNhanVien");
                    String MatKhau = rs.getString("MatKhau");
                    String VaiTro = rs.getString("VaiTro");
                    String HoTen = rs.getString("HoTen");
                    int GioiTinh = rs.getInt("GioiTinh");
                    String DienThoai = rs.getString("DienThoai");
                    String Email = rs.getString("Email");
                    String DiaChi = rs.getString("DiaChi");
                    String Hinh = rs.getString("Hinh");
                    
                    NhanVien nv =  new NhanVien(MaNhanVien, MatKhau, VaiTro, HoTen, GioiTinh, DienThoai, Email, DiaChi, Hinh);
                    dsnv.add(nv);
                }
        }catch(Exception e){
            e.printStackTrace();
        }
        return dsnv;
    }
    
    public void create(NhanVien nv){
         String sql = "INSERT INTO NHANVIEN(MaNhanVien, MatKhau, VaiTro, HoTen, GioiTinh, DienThoai, Email, DiaChi, Hinh)  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
         try{
              PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, nv.getMaNhanVien());
               ps.setString(2, nv.getMatKhau());
               ps.setString(3, nv.getVaiTro());
               ps.setString(4, nv.getHoTen());
               ps.setInt(5, nv.getGioiTinh());
               ps.setString(6, nv.getDienThoai());
               ps.setString(7, nv.getEmail());
               ps.setString(8, nv.getDiaChi());
               ps.setString(9, nv.getHinh());
               ps.execute();
               
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public void update(NhanVien nv){
        String sql = "UPDATE NHANVIEN SET MaNhanVien = ?, MatKhau = ? , VaiTro = ?, HoTen= ? , GioiTinh = ?, DienThoai = ? , Email = ?, DiaChi = ? , Hinh = ? ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNhanVien());
               ps.setString(2, nv.getMatKhau());
               ps.setString(3, nv.getVaiTro());
               ps.setString(4, nv.getHoTen());
               ps.setInt(5, nv.getGioiTinh());
               ps.setString(6, nv.getDienThoai());
               ps.setString(7, nv.getEmail());
               ps.setString(8, nv.getDiaChi());
               ps.setString(9, nv.getHinh());
               ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void delete(String MaNhanVien){
        String sql = "delete NHANVIEN where MaNhanVien = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaNhanVien);
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean checkMa(String MaNhanVien){
        String sql = "select * from NHANVIEN where MaNhanVien = ? ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, MaNhanVien);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String MaNhanVien1 = rs.getString("MaNhanVien");
                System.out.println("MaNhanVien1");
                System.out.println("MaNhanVien");
                if(MaNhanVien1.equalsIgnoreCase(MaNhanVien)){
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
   
    private ArrayList<NhanVien> dsnv = new ArrayList<>();
    public void themNhanVien(NhanVien nhanvien){
        dsnv.add(nhanvien);
    }
    public NhanVien searchByMa(String MaNhanVien){
        for (NhanVien nv : dsnv) {
            if(nv.getMaNhanVien().equals(MaNhanVien)){
                return nv;
            }
        }
        return null;
    }
//     public ArrayList<NhanVien> search(String MaNhanVien){
//        
//        ArrayList<NhanVien> dsnv = new ArrayList<>();
//        String sql = "SELECT * FROM NHANVIEN where MaNhanVien = ?";
//        
//        try{         
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, MaNhanVien);
//                ps.execute();
//                ResultSet rs = ps.executeQuery();
//                while(rs.next()){
//                  //  String MaNhanVien = rs.getString("MaNhanVien");
//                    String MatKhau = rs.getString("MatKhau");
//                    String VaiTro = rs.getString("VaiTro");
//                    String HoTen = rs.getString("HoTen");
//                    int GioiTinh = rs.getInt("GioiTinh");
//                    String DienThoai = rs.getString("DienThoai");
//                    String Email = rs.getString("Email");
//                    String DiaChi = rs.getString("DiaChi");
//                    String Hinh = rs.getString("Hinh");
//                    
//                    NhanVien nv =  new NhanVien(MaNhanVien, MatKhau, VaiTro, HoTen, GioiTinh, DienThoai, Email, DiaChi, Hinh);
//                    dsnv.add(nv);
//                }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return dsnv;
//    }
//    
}
 
