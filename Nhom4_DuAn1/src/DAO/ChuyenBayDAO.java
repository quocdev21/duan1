
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.getConnection;
import DungChung.DungChung;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import Model.ChuyenBay;
import Model.HangMayBay;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.TuyenBay;
import Model.MayBay;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TuanDuc
 */
public class ChuyenBayDAO extends getConnection {

    public ArrayList<TuyenBay> layDS_TB() {
        ArrayList<TuyenBay> arr = new ArrayList<>();
        try {
            String sql = "select MaTuyenBay from TUYENBAY";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                TuyenBay hk = new TuyenBay(rs.getString(1));
                arr.add(hk);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return arr;
    }

    public ArrayList<MayBay> layDS_MB() {
        ArrayList<MayBay> arr = new ArrayList<>();
        try {
            String sql = "select MaMayBay from MAYBAY";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                MayBay hk = new MayBay(rs.getString(1));
                arr.add(hk);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return arr;
    }

    public ArrayList<HangMayBay> layDS_HMB() {
        ArrayList<HangMayBay> arr = new ArrayList<>();
        try {
            String sql = "select MaHang from HANGMAYBAY";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                HangMayBay hmb = new HangMayBay(rs.getString(1));
                arr.add(hmb);
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return arr;
    }

    public void loadTable(JTable tbl) {
        try {
            String[] header = new String[]{"STT", "Mã chuyến bay", "Ngày đi", "Ngày đến", "Giờ khởi hành", "Mã tuyến bay", "Mã máy bay", "Giá"};
            String sql = "SELECT ROW_NUMBER() Over (Order by MaChuyenBay), cb.MaChuyenBay, cb.NgayDi, cb.NgayDen, cb.GioKhoiHanh, cb.MaTuyenBay, cb.MaMayBay, CAST(cb.Gia AS int) AS Gia FROM CHUYENBAY cb JOIN TUYENBAY tb ON cb.MaTuyenBay = tb.MaTuyenBay JOIN MAYBAY mb ON cb.MaMayBay = mb.MaMayBay";
            new DungChung().statement(sql, tbl, header);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    public int them(ChuyenBay cb) {
        try {
            String sql = "set dateformat YMD insert into CHUYENBAY values(?, ?, ?, ?, ?, ?, ?)";
            Object[] obj = new Object[]{cb.getMaChuyenBay(), cb.getNgayDi(), cb.getNgayDen(), cb.getGioKhoiHanh(), cb.getMaTuyenBay(), cb.getMamayBay(), cb.getGia()};
            PreparedStatement ps = new DungChung().prepareStatement(sql, obj);
            return ps.executeUpdate();
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return 0;
    }

    public int sua(ChuyenBay cb) {
        try {
            String sql = "set dateformat YMD update CHUYENBAY set NgayDi = ?, NgayDen = ?, GioKhoiHanh = ?, MaTuyenBay = ?, MaMayBay = ?, Gia = ? where MaChuyenBay = ?";
            Object[] obj = new Object[]{cb.getNgayDi(), cb.getNgayDen(), cb.getGioKhoiHanh(), cb.getMaTuyenBay(), cb.getMamayBay(), cb.getGia(), cb.getMaChuyenBay()};
            PreparedStatement ps = new DungChung().prepareStatement(sql, obj);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int xoa(ChuyenBay cb) {
        try {
            String sql = "delete from CHUYENBAY where MaChuyenBay = ?";
            Object[] obj = new Object[]{cb.getMaChuyenBay()};
            PreparedStatement ps = new DungChung().prepareStatement(sql, obj);
            return ps.executeUpdate();
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return 0;
    }

    public void hienThi(JTable tbl, ChuyenBay cb, int q) {
        cb.setMaChuyenBay(String.valueOf(tbl.getValueAt(q, 1)));
        cb.setNgayDi(String.valueOf(tbl.getValueAt(q, 2)));
        cb.setNgayDen(String.valueOf(tbl.getValueAt(q, 3)));
        cb.setGioKhoiHanh(String.valueOf(tbl.getValueAt(q, 4)));
        cb.setMaTuyenBay(String.valueOf(tbl.getValueAt(q, 5)));
        cb.setMamayBay(String.valueOf(tbl.getValueAt(q, 6)));
        cb.setGia(Double.valueOf(String.valueOf(tbl.getValueAt(q, 7))));
    }

    public ChuyenBay timCBToDen(String ma) {
        try {
            String sql = "select * from CHUYENBAY where MaChuyenBay = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ChuyenBay cb = new ChuyenBay(rs.getString(1));
                return cb;
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return null;
    }

    public void tim(JTable tbl, String ma) {
        try {
            String sql = "select ROW_NUMBER() Over (Order by MaChuyenBay), * from CHUYENBAY where MaChuyenBay like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + ma + "%");
            String[] header = new String[]{"STT", "Mã chuyến bay", "Ngày đi", "Ngày đến", "Giờ khởi hành", "Mã tuyến bay", "Mã máy bay"};
            DefaultTableModel model = new DefaultTableModel(header, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector data = new Vector();
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
                data.add(rs.getString(5));
                data.add(rs.getInt(6));
                data.add(rs.getInt(7));
                data.add(rs.getString(8));
                data.add(rs.getString(9));
                model.addRow(data);
            }
            tbl.removeAll();
            tbl.setModel(model);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
