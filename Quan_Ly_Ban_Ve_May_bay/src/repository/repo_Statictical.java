/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.Statictical;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class repo_Statictical {
    
    public ArrayList<Statictical> getAll(){
        String sql = """
                     select YEAR(NgayMua) as Nam, MONTH(NgayMua) AS Thang,COUNT(ID_Ve) as SoLuong, sum(giatien) as DoanhThu
                       from VE
                       group by YEAR(NgayMua),MONTH(NgayMua)
                       order by DoanhThu desc""";
        ArrayList<Statictical> list = new ArrayList<>();
        try(Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()) {
                Statictical tk = new Statictical();
                tk.setThang(rs.getString(2));
                tk.setSoLuong(rs.getInt(3));
                tk.setDoanhThu(rs.getString(4));
                list.add(tk);
                
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
    

        
    }
