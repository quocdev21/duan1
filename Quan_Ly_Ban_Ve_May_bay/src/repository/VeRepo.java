/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Ve;
import config.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class VeRepo {
        private Connection conn;

    public VeRepo() {
        conn = DBConnect.getConnection();
    }

    public List<Ve> getListKhachHang() {
        List<Ve> list = new ArrayList();
        String querySelect = "SELECT * FROM Ve";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(querySelect);
            while (rs.next()) {
		System.err.println(rs.getString(2));
                Ve kh = new Ve();
                kh.setIDVe(rs.getString(1));
                kh.setIDChuyenBay(rs.getString(2));
                kh.setMaGHe(rs.getString(3));
                kh.setDiaDiemDi(rs.getString(4));
                kh.setDiaDiemDen(rs.getString(5));
                kh.setIDHang(rs.getString(6));
                kh.setNgayMua(rs.getString(7));
                kh.setGiaTien(rs.getString(8));
                list.add(kh);
            }
        } catch (Exception e) {
	    e.printStackTrace();
            System.out.println("e: " + e);
        }

        return list;
    }

    
}