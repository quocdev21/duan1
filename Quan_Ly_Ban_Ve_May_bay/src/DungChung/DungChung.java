/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DungChung;

import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class DungChung {

    protected Connection con;

    public PreparedStatement prepareStatement(String sql, Object[] args) throws SQLException {
        PreparedStatement ps = con.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        return ps;
    }

    public void statement(String sql, JTable tbl, String[] header) throws SQLException {
        DefaultTableModel model = new DefaultTableModel(header, 0);
        tbl.setDefaultEditor(Object.class, null);
        tbl.getTableHeader().setCursor(new Cursor(HAND_CURSOR));
        tbl.getTableHeader().setFont(new Font("Segoe UI", 1, 13));
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector data = new Vector();
            for (int i = 0; i < header.length; i++) {
                data.add(rs.getObject(i + 1));
            }
            model.addRow(data);
        }
        tbl.setModel(model);
        con.close();
    }
}
