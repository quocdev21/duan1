/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.MayBay;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Simp
 */
public class repo_MayBay {
    public ArrayList<MayBay> getAll(){
        String sql = """
                     SELECT [ID_May_Bay]
                           ,[SoHieuMayBay]
                           ,[HangMayBay]
                           ,[So_Luong_Ghe]
                       FROM [dbo].[MayBay]""";
        ArrayList<MayBay> list = new ArrayList<>();
        try(Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()) {
                MayBay mb = new MayBay(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                list.add(mb);
                
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(new repo_MayBay().getAll());
    }
}
