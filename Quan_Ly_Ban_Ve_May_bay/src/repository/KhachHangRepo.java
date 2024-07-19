/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.KhachHang;
import Utils.ConnectDB;
/**
 *
 * @author Admin
 */
public class KhachHangRepo {
    private Connection conn;

    public KhachHangRepo() {
        conn = ConnectDB.getConnection();
    }

    public List<KhachHang> getListKhachHang() {
        List<KhachHang> list = new ArrayList();
        String querySelect = "SELECT * FROM ChiTietKhachHang";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(querySelect);
            while (rs.next()) {
		System.err.println(rs.getString(2));
                KhachHang kh = new KhachHang();
                kh.setIDKhachHang(rs.getString(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setTenKhachHang(rs.getString(3));
                kh.setSDT(rs.getString(4));
                kh.setEmail(rs.getString(5));
                kh.setDiaChi(rs.getString(6));
                list.add(kh);
            }
        } catch (Exception e) {
	    e.printStackTrace();
            System.out.println("e: " + e);
        }

        return list;
    }

    
}

