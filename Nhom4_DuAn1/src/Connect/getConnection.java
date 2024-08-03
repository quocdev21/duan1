/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TuanDuc
 */
public class getConnection {
    protected Connection con;
    
    public getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=moi";

            con = DriverManager.getConnection(url, "sa", "123456");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
