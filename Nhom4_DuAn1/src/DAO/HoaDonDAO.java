/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.getConnection;
import DungChung.DungChung;
import Model.HanhKhach;

import Model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TuanDuc
 */
public class HoaDonDAO extends getConnection{
    public ArrayList<HanhKhach> layDS_HK(){
        ArrayList<HanhKhach> arr = new ArrayList<>();
        try {
            String sql = "select CCCD, HoTen from HANHKHACH";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HanhKhach hk = new HanhKhach(rs.getString(1), rs.getString(2));
                arr.add(hk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    
    public ArrayList<HoaDonChiTiet> layDS_HDCT(){
        ArrayList<HoaDonChiTiet> arr = new ArrayList<>();
        try {
            String sql = "select MaHoaDonChiTiet, SoLuongVe from HOADONCHITIET";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDonChiTiet hdct = new HoaDonChiTiet(rs.getString(1), rs.getString(2));
                arr.add(hdct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    
    public ArrayList<NhanVien> layDS_NV(){
        ArrayList<NhanVien> arr = new ArrayList<>();
        try {
            String sql = "select MaNhanVien, HoTen from NHANVIEN";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2));
                arr.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    
    public void loadTable(JTable tbl) {
        try {
            String[] header = new String[]{"STT", "Mã hóa đơn", "Ngày lập", "Tên hành khách", "Mã nhân viên", "Mã HDCT"};
            String sql = "SELECT ROW_NUMBER() Over (Order by MaHoaDon), hd.MaHoaDon, hd.NgayLap, hk.HoTen, nv.MaNhanVien, hdct.MaHoaDonChiTiet FROM HOADON hd JOIN HANHKHACH hk ON hd.CCCD = hk.CCCD JOIN NHANVIEN nv ON hd.MaNhanVien = nv.MaNhanVien JOIN HOADONCHITIET hdct ON hd.MaHoaDonChiTiet = hdct.MaHoaDonChiTiet";
            new DungChung().statement(sql, tbl, header);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int them(HoaDon hd) {
        try {
            String sql = "insert into HOADON values(?, ?, ?, ?, ?)";
            Object[] obj = new Object[]{hd.getMaHoaDon(), hd.getNgayLap(), hd.getCmnd(), hd.getMaNhanVien(), hd.getMaHDCT()};
            PreparedStatement ps = new DungChung().prepareStatement(sql, obj);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int sua(HoaDon hd) {
        try {
            String sql = "update HOADON set NgayLap = ?, CCCD = ?, MaNhanVien = ?, MaHoaDonChiTiet = ? where MaHoaDon = ?";
            Object[] obj = new Object[]{hd.getNgayLap(), hd.getCmnd(), hd.getMaNhanVien(), hd.getMaHoaDon()};
            PreparedStatement ps = new DungChung().prepareStatement(sql, obj);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int xoa(HoaDon hd) {
        try {
            String sql = "delete from HOADON where MaHoaDon = ?";
            Object[] obj = new Object[]{hd.getMaHoaDon()};
            PreparedStatement ps = new DungChung().prepareStatement(sql, obj);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void hienThi(JTable tbl, HoaDon hd, HanhKhach hk, int q) {
        hd.setMaHoaDon(String.valueOf(tbl.getValueAt(q, 1)));
        hd.setNgayLap(String.valueOf(tbl.getValueAt(q, 2)));
        hk.setHoTen(String.valueOf(tbl.getValueAt(q, 3)));
        hd.setMaNhanVien(String.valueOf(tbl.getValueAt(q, 4)));
        hd.setMaHDCT(String.valueOf(tbl.getValueAt(q, 5)));
    }
    
    public HoaDon timHDToDen(String ma) {
        try {
            String sql = "select * from HOADON where MaHoaDon = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HoaDon sb = new HoaDon(rs.getString(1));
                return sb;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void tim(JTable tbl, String ma) {
        try {
            String sql = "select ROW_NUMBER() Over (Order by MaHoaDon), * from HOADON where MaHoaDon like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + ma + "%");
            String[] header = new String[]{"STT", "Mã hóa đơn", "Ngày lập", "Tên hành khách", "Mã nhân viên", "Mã HDCT"};
            DefaultTableModel model = new DefaultTableModel(header, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector data = new Vector();
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
                data.add(rs.getString(5));
                model.addRow(data);
            }
            tbl.removeAll();
            tbl.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
