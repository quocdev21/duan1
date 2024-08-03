/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.HoaDonDAO;
import DungChung.DungChung;
import DungChung.ExportExcel;
import DungChung.ExportPDF;
import Model.HanhKhach;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import Model.NhanVien;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author TuanDuc
 */
public class frmHoaDon extends javax.swing.JFrame {
    String chucVu = "";
    int showHide_CMND = 1;
    int showHide_MaNV = 1;
    int showHide_NgayLap = 1;
    int showHide_HDCT = 1;
    int dong = -1;

    private void cbx_CMND() {
        ArrayList<JLabel> listLBL = new ArrayList<>();
        try {
            int cao = 3;
            ArrayList<HanhKhach> arr_HK = new HoaDonDAO().layDS_HK();
            for (int i = 0; i < arr_HK.size(); i++) {
                JLabel lbl = new JLabel(arr_HK.get(i).getCmnd() + " - " + arr_HK.get(i).getHoTen());
                lbl.setSize(pnlCBX_TenHK.getWidth(), 20);
                lbl.setLocation(10, cao);
                lbl.setName("lbl" + arr_HK.get(i).getCmnd());
                lbl.setForeground(Color.white);
                lbl.setFont(new Font("Segoe UI", 0, 14));
                lbl.setCursor(new Cursor(HAND_CURSOR));
                lbl.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                txtTenHK.setText(listLBL.get(i).getText());
                                pnlCBX_TenHK.setVisible(false);
                                showHide_CMND++;
                            }
                        }
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                listLBL.get(i).setForeground(new Color(55, 38, 91));
                            }
                        }
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                listLBL.get(i).setForeground(Color.white);
                            }
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                });
                pnlCBX_TenHK.add(lbl);
                listLBL.add(lbl);
                cao += 20;
            }
            pnlCBX_TenHK.setPreferredSize(new Dimension(sptTenHK.getWidth(), listLBL.size() * 20 + 7));
            pnlCBX_TenHK.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cbx_MaNV() {
        ArrayList<JLabel> listLBL = new ArrayList<>();
        try {
            int cao = 3;
            ArrayList<NhanVien> arr_NV = new HoaDonDAO().layDS_NV();
            for (int i = 0; i < arr_NV.size(); i++) {
                JLabel lbl = new JLabel(arr_NV.get(i).getMaNhanVien() + " - " + arr_NV.get(i).getMatKhau());
                lbl.setSize(pnlCBX_MaNV.getWidth(), 20);
                lbl.setLocation(10, cao);
                lbl.setName("lbl" + arr_NV.get(i).getMaNhanVien());
                lbl.setForeground(Color.white);
                lbl.setFont(new Font("Segoe UI", 0, 14));
                lbl.setCursor(new Cursor(HAND_CURSOR));
                lbl.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                txtMaNV.setText(listLBL.get(i).getText());
                                pnlCBX_MaNV.setVisible(false);
                                showHide_MaNV++;
                            }
                        }
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                listLBL.get(i).setForeground(new Color(55, 38, 91));
                            }
                        }
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                listLBL.get(i).setForeground(Color.white);
                            }
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                });
                pnlCBX_MaNV.add(lbl);
                listLBL.add(lbl);
                cao += 20;
            }
            pnlCBX_MaNV.setPreferredSize(new Dimension(sptMaNV.getWidth(), listLBL.size() * 20 + 7));
            pnlCBX_MaNV.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void cbx_HDCT(){
        ArrayList<JLabel> listLBL = new ArrayList<>();
        try {
            int cao = 3;
            ArrayList<HoaDonChiTiet> arr_HDCT = new HoaDonDAO().layDS_HDCT();
            for (int i = 0; i < arr_HDCT.size(); i++) {
                JLabel lbl = new JLabel(arr_HDCT.get(i).getMaHoaDon());
                lbl.setSize(pnlCBX_HDCT.getWidth(), 20);
                lbl.setLocation(10, cao);
                lbl.setName("lbl" + arr_HDCT.get(i).getMaHoaDon());
                lbl.setForeground(Color.white);
                lbl.setFont(new Font("Segoe UI", 0, 14));
                lbl.setCursor(new Cursor(HAND_CURSOR));
                lbl.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                txtHDCT.setText(listLBL.get(i).getText());
                                pnlCBX_HDCT.setVisible(false);
                                showHide_HDCT++;
                            }
                        }
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                listLBL.get(i).setForeground(new Color(55, 38, 91));
                            }
                        }
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        String[] s = e.toString().split(" ");
                        String str = s[s.length - 1];
                        for (int i = 0; i < listLBL.size(); i++) {
                            if (listLBL.get(i).getName().equals(str)) {
                                listLBL.get(i).setForeground(Color.white);
                            }
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                });
                pnlCBX_HDCT.add(lbl);
                listLBL.add(lbl);
                cao += 20;
            }
            pnlCBX_HDCT.setPreferredSize(new Dimension(spt_HDCT.getWidth(), listLBL.size() * 20 + 7));
            pnlCBX_HDCT.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showHideCBX_CMND() {
        showHide_CMND++;
        if (showHide_CMND % 2 == 0) {
            pnlCBX_TenHK.setVisible(true);
        } else {
            pnlCBX_TenHK.setVisible(false);
        }
    }
    
    private void showHideCBX_HDCT() {
        showHide_HDCT++;
        if (showHide_HDCT % 2 == 0) {
            pnlCBX_HDCT.setVisible(true);
        } else {
            pnlCBX_HDCT.setVisible(false);
        }
    }

    private void showHideCBX_MaNV() {
        showHide_MaNV++;
        if (showHide_MaNV % 2 == 0) {
            pnlCBX_MaNV.setVisible(true);
        } else {
            pnlCBX_MaNV.setVisible(false);
        }
    }

    private void showHideDate_NgayLap() {
        showHide_NgayLap++;
        if (showHide_NgayLap % 2 == 0) {
            dcplNgayLap.setVisible(true);
        } else {
            dcplNgayLap.setVisible(false);
        }
    }

    private void an() {
        new DungChung().hideLBLError(new JLabel[]{lblLoiMaHD, lblLoiNhayLap, lblLoiTenHK, lblLoiMaNV, lblLoiHDCT});
    }

    private boolean check() {
        JLabel[] lbl = new JLabel[]{lblLoiMaHD, lblLoiNhayLap, lblLoiTenHK, lblLoiMaNV, lblLoiHDCT};
        JTextField[] txt = new JTextField[]{txtMaHD, txtNgayLap, txtTenHK, txtMaNV, txtHDCT};
        return new DungChung().check(lbl, txt);
    }

    private void moi() {
        new DungChung().reset(new JTextField[]{txtMaHD, txtNgayLap, txtTenHK, txtMaNV, txtHDCT});
        an();
        lblSTT.setText("0");
        dong = -1;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        txtNgayLap.setText(String.valueOf(dtf.format(now)));
    }

    private void bang() {
        new HoaDonDAO().loadTable(tblHoaDon);
    }

    final void editColumnWidth() {
        int[] col = new int[]{40, 190, 190, 190, 190, 150};
        new DungChung().editColumnWidth(col, tblHoaDon);
    }

    private void them() {
        if (check()) {
            String mahd = txtMaHD.getText().trim();
            String ngaylap = txtNgayLap.getText().trim();
            String[] str = txtTenHK.getText().trim().split("-");
            String cmnd = str[0].trim();
            String[] str1 = txtMaNV.getText().trim().split("-");
            String manv = str1[0].trim();
            String [] str2 = txtHDCT.getText().trim().split("-");
            String maHDCT = str2[0].trim();
            int kt = new HoaDonDAO().them(new HoaDon(mahd, ngaylap, cmnd, manv, maHDCT));
            if (kt == 1) {
                bang();
                HoaDon hk = new HoaDonDAO().timHDToDen(mahd);
                for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
                    String ma = String.valueOf(tblHoaDon.getValueAt(i, 1));
                    if (ma.equals(hk.getMaHoaDon())) {
                        tblHoaDon.setRowSelectionInterval(i, i);
                    }
                }
                moi();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại! Trùng khóa chính.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
        editColumnWidth();
    }

    private void capNhat() {
        if (!txtMaNV.getText().isEmpty()) {
            String mahd = txtMaHD.getText().trim();
            String ngaylap = txtNgayLap.getText().trim();
            String[] str = txtTenHK.getText().trim().split("-");
            String cmnd = str[0].trim();
            String[] str1 = txtMaNV.getText().trim().split("-");
            String manv = str1[0].trim();
            String [] str2 = txtHDCT.getText().trim().split("-");
            String maHDCT = str2[0].trim();
            int kt = new HoaDonDAO().sua(new HoaDon(mahd, ngaylap, cmnd, manv, maHDCT));
            if (kt == 1) {
                bang();
                tblHoaDon.setRowSelectionInterval(dong, dong);
                editColumnWidth();
                an();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void xoa() {
        if (dong >= 0) {
            int r = JOptionPane.showConfirmDialog(this, "Bạn cần xóa hóa đơn " + tblHoaDon.getValueAt(dong, 1) + "?", "Thông báo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                String mahd = txtMaHD.getText().trim();
                int kt = new HoaDonDAO().xoa(new HoaDon(mahd));
                if (kt == 1) {
                    bang();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        editColumnWidth();
    }

    private void hienThi(int row) {
        HoaDon hd = new HoaDon();
        HanhKhach hk = new HanhKhach();
        new HoaDonDAO().hienThi(tblHoaDon, hd, hk, row);
        txtMaHD.setText(hd.getMaHoaDon());
        txtNgayLap.setText(hd.getNgayLap());
        txtTenHK.setText(hk.getHoTen());
        txtMaNV.setText(hd.getMaNhanVien());
        txtHDCT.setText(hd.getMaHDCT());
        txtMaHD.setEditable(false);
        lblSTT.setText(String.valueOf(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 0)));
    }

    private void exportExcel() {
        new ExportExcel().exportExcel("DANH SÁCH BẢNG HÓA ĐƠN", "Hóa đơn", tblHoaDon, new int[]{1500, 5000, 5000, 7000, 5000});
        JOptionPane.showMessageDialog(this, "Xuất file excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    private void exportPDF() {
        new ExportPDF().exportPDF("DANH SÁCH BẢNG HÓA ĐƠN", tblHoaDon);
        JOptionPane.showMessageDialog(this, "Xuất file pdf thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    private void chucNang(String str) {
        try {
            if (str.equals("dau")) {
                dong = 0;
            } else if (str.equals("cuoi")) {
                dong = tblHoaDon.getRowCount() - 1;
            } else if (str.equals("pre")) {
                dong--;
                if (dong < 0) {
                    JOptionPane.showMessageDialog(this, "Đang ở đầu danh sách!");
                    dong += 1;
                    return;
                }
            } else if (str.equals("next")) {
                dong++;
                if (dong >= tblHoaDon.getRowCount()) {
                    JOptionPane.showMessageDialog(this, "Đang ở cuối danh sách!");
                    dong -= 1;
                    return;
                }
            }
            tblHoaDon.setRowSelectionInterval(dong, dong);
            lblSTT.setText(String.valueOf(tblHoaDon.getValueAt(dong, 0)));
            hienThi(dong);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    public frmHoaDon() {
        initComponents();
        setLocationRelativeTo(this);
        cbx_CMND();
        cbx_MaNV();
        cbx_HDCT();
        dcplNgayLap.setVisible(false);
        new DungChung().transTXT(new JTextField[]{txtMaHD, txtNgayLap, txtTenHK, txtMaNV});
        an();
        bang();
        editColumnWidth();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        txtNgayLap.setText(String.valueOf(dtf.format(now)));
        splTable.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
    }
    
    public frmHoaDon(String vt) {
        initComponents();
        setLocationRelativeTo(this);
        cbx_CMND();
        cbx_MaNV();
        dcplNgayLap.setVisible(false);
        new DungChung().transTXT(new JTextField[]{txtMaHD, txtNgayLap, txtTenHK, txtMaNV});
        an();
        bang();
        editColumnWidth();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        txtNgayLap.setText(String.valueOf(dtf.format(now)));
        chucVu = vt;
        splTable.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        dcplNgayLap = new datechooser.beans.DateChooserPanel();
        pnlCBX_TenHK = new javax.swing.JPanel();
        pnlCBX_MaNV = new javax.swing.JPanel();
        pnlCBX_HDCT = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        txtMaHD = new javax.swing.JTextField();
        lblLoiMaHD = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        lblLoiNhayLap = new javax.swing.JLabel();
        splTable = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        lblSTT = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTenHK = new javax.swing.JTextField();
        sptTenHK = new javax.swing.JSeparator();
        lblLoiTenHK = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        sptMaNV = new javax.swing.JSeparator();
        lblLoiMaNV = new javax.swing.JLabel();
        btnMaNV = new javax.swing.JLabel();
        txtNgayLap = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnTenHK = new javax.swing.JButton();
        btnNgayLap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHDCT = new javax.swing.JButton();
        txtHDCT = new javax.swing.JTextField();
        lblLoiHDCT = new javax.swing.JLabel();
        spt_HDCT = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcplNgayLap.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dcplNgayLapOnSelectionChange(evt);
            }
        });
        jPanel8.add(dcplNgayLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 390, -1));

        pnlCBX_TenHK.setBackground(new java.awt.Color(194, 194, 194));

        javax.swing.GroupLayout pnlCBX_TenHKLayout = new javax.swing.GroupLayout(pnlCBX_TenHK);
        pnlCBX_TenHK.setLayout(pnlCBX_TenHKLayout);
        pnlCBX_TenHKLayout.setHorizontalGroup(
            pnlCBX_TenHKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        pnlCBX_TenHKLayout.setVerticalGroup(
            pnlCBX_TenHKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel8.add(pnlCBX_TenHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 170));

        pnlCBX_MaNV.setBackground(new java.awt.Color(194, 194, 194));

        javax.swing.GroupLayout pnlCBX_MaNVLayout = new javax.swing.GroupLayout(pnlCBX_MaNV);
        pnlCBX_MaNV.setLayout(pnlCBX_MaNVLayout);
        pnlCBX_MaNVLayout.setHorizontalGroup(
            pnlCBX_MaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        pnlCBX_MaNVLayout.setVerticalGroup(
            pnlCBX_MaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel8.add(pnlCBX_MaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        pnlCBX_HDCT.setBackground(new java.awt.Color(194, 194, 194));

        javax.swing.GroupLayout pnlCBX_HDCTLayout = new javax.swing.GroupLayout(pnlCBX_HDCT);
        pnlCBX_HDCT.setLayout(pnlCBX_HDCTLayout);
        pnlCBX_HDCTLayout.setHorizontalGroup(
            pnlCBX_HDCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        pnlCBX_HDCTLayout.setVerticalGroup(
            pnlCBX_HDCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel8.add(pnlCBX_HDCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, 170));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(55, 38, 91));
        jLabel15.setText("QUẢN LÝ HÓA ĐƠN");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(55, 38, 91));
        jLabel16.setText("Tìm kiếm");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel8.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 196, -1));

        txtMaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtMaHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaHDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaHDKeyTyped(evt);
            }
        });
        jPanel8.add(txtMaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 360, -1));

        lblLoiMaHD.setForeground(new java.awt.Color(255, 0, 0));
        lblLoiMaHD.setText("Mã hóa đơn không chính xác");
        jPanel8.add(lblLoiMaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 220, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 38, 91));
        jLabel17.setText("Mã hóa đơn");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(55, 38, 91));
        jLabel18.setText("Ngày lập");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));
        jPanel8.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 390, 10));

        lblLoiNhayLap.setForeground(new java.awt.Color(255, 0, 0));
        lblLoiNhayLap.setText("Chưa chọn ngày lập");
        jPanel8.add(lblLoiNhayLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 240, -1));

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hóa đơn", "Ngày lập", "Tên hành khách", "Mã nhân viên", "Mã HDCT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHoaDon.setAutoscrolls(false);
        tblHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblHoaDon.setFocusable(false);
        tblHoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        tblHoaDon.setOpaque(false);
        tblHoaDon.setRequestFocusEnabled(false);
        tblHoaDon.setRowHeight(30);
        tblHoaDon.setSelectionBackground(new java.awt.Color(55, 38, 91));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        splTable.setViewportView(tblHoaDon);

        jPanel8.add(splTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 930, 310));

        lblSTT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSTT.setForeground(new java.awt.Color(55, 38, 91));
        lblSTT.setText("0");
        jPanel8.add(lblSTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 38, 91));
        jLabel19.setText("Tên hành khách");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtTenHK.setEditable(false);
        txtTenHK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenHK.setBorder(null);
        txtTenHK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenHKKeyReleased(evt);
            }
        });
        jPanel8.add(txtTenHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 330, -1));
        jPanel8.add(sptTenHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 360, 10));

        lblLoiTenHK.setForeground(new java.awt.Color(255, 0, 0));
        lblLoiTenHK.setText("Chưa chọn chứng minh nhân dân");
        jPanel8.add(lblLoiTenHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(55, 38, 91));
        jLabel20.setText("Mã nhân viên");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaNV.setBorder(null);
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaNVKeyReleased(evt);
            }
        });
        jPanel8.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 360, -1));
        jPanel8.add(sptMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 390, 10));

        lblLoiMaNV.setForeground(new java.awt.Color(255, 0, 0));
        lblLoiMaNV.setText("Chưa chọn mã nhân viên");
        jPanel8.add(lblLoiMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 190, -1));

        btnMaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down.png"))); // NOI18N
        btnMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaNVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaNVMouseEntered(evt);
            }
        });
        jPanel8.add(btnMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, -1, -1));

        txtNgayLap.setEditable(false);
        txtNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayLap.setBorder(null);
        txtNgayLap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayLapKeyReleased(evt);
            }
        });
        jPanel8.add(txtNgayLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 360, -1));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgButtonThem.png"))); // NOI18N
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.setContentAreaFilled(false);
        btnThem.setDefaultCapable(false);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setIconTextGap(0);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        btnCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgButtonCapNhat.png"))); // NOI18N
        btnCapNhat.setBorder(null);
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.setContentAreaFilled(false);
        btnCapNhat.setDefaultCapable(false);
        btnCapNhat.setFocusPainted(false);
        btnCapNhat.setFocusable(false);
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseExited(evt);
            }
        });
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        jPanel8.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgButtonXoa.png"))); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.setBorderPainted(false);
        btnXoa.setContentAreaFilled(false);
        btnXoa.setDefaultCapable(false);
        btnXoa.setFocusPainted(false);
        btnXoa.setFocusable(false);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaMouseExited(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel8.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        btnMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgButtonMoi.png"))); // NOI18N
        btnMoi.setBorder(null);
        btnMoi.setBorderPainted(false);
        btnMoi.setContentAreaFilled(false);
        btnMoi.setDefaultCapable(false);
        btnMoi.setFocusPainted(false);
        btnMoi.setFocusable(false);
        btnMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMoiMouseExited(evt);
            }
        });
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel8.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, -1));

        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgButtonExcel.png"))); // NOI18N
        btnExcel.setBorder(null);
        btnExcel.setBorderPainted(false);
        btnExcel.setContentAreaFilled(false);
        btnExcel.setFocusPainted(false);
        btnExcel.setFocusable(false);
        btnExcel.setIconTextGap(0);
        btnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcelMouseExited(evt);
            }
        });
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jPanel8.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, -1, -1));

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgButtonFPT.png"))); // NOI18N
        btnPDF.setBorder(null);
        btnPDF.setBorderPainted(false);
        btnPDF.setContentAreaFilled(false);
        btnPDF.setFocusPainted(false);
        btnPDF.setFocusable(false);
        btnPDF.setIconTextGap(0);
        btnPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDFMouseExited(evt);
            }
        });
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        jPanel8.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, -1, -1));

        btnPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgDau.png"))); // NOI18N
        btnPre.setBorder(null);
        btnPre.setBorderPainted(false);
        btnPre.setContentAreaFilled(false);
        btnPre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPre.setDefaultCapable(false);
        btnPre.setFocusPainted(false);
        btnPre.setFocusable(false);
        btnPre.setIconTextGap(0);
        btnPre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPreMouseExited(evt);
            }
        });
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });
        jPanel8.add(btnPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgPre.png"))); // NOI18N
        btnFirst.setBorder(null);
        btnFirst.setBorderPainted(false);
        btnFirst.setContentAreaFilled(false);
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.setDefaultCapable(false);
        btnFirst.setFocusPainted(false);
        btnFirst.setFocusable(false);
        btnFirst.setIconTextGap(0);
        btnFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstMouseExited(evt);
            }
        });
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel8.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgNext.png"))); // NOI18N
        btnLast.setBorder(null);
        btnLast.setBorderPainted(false);
        btnLast.setContentAreaFilled(false);
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.setDefaultCapable(false);
        btnLast.setFocusPainted(false);
        btnLast.setFocusable(false);
        btnLast.setIconTextGap(0);
        btnLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLastMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLastMouseExited(evt);
            }
        });
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel8.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, -1, -1));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/bgCuoi.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.setDefaultCapable(false);
        btnNext.setFocusPainted(false);
        btnNext.setFocusable(false);
        btnNext.setIconTextGap(0);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel8.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, -1, -1));

        btnTenHK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down.png"))); // NOI18N
        btnTenHK.setBorder(null);
        btnTenHK.setBorderPainted(false);
        btnTenHK.setContentAreaFilled(false);
        btnTenHK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTenHK.setDefaultCapable(false);
        btnTenHK.setFocusPainted(false);
        btnTenHK.setFocusable(false);
        btnTenHK.setIconTextGap(0);
        btnTenHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenHKActionPerformed(evt);
            }
        });
        jPanel8.add(btnTenHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        btnNgayLap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down.png"))); // NOI18N
        btnNgayLap.setBorder(null);
        btnNgayLap.setBorderPainted(false);
        btnNgayLap.setContentAreaFilled(false);
        btnNgayLap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNgayLap.setDefaultCapable(false);
        btnNgayLap.setFocusPainted(false);
        btnNgayLap.setFocusable(false);
        btnNgayLap.setIconTextGap(0);
        btnNgayLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgayLapActionPerformed(evt);
            }
        });
        jPanel8.add(btnNgayLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 38, 91));
        jLabel1.setText("Mã hóa đơn chi tiết");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnHDCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down.png"))); // NOI18N
        btnHDCT.setBorder(null);
        btnHDCT.setBorderPainted(false);
        btnHDCT.setContentAreaFilled(false);
        btnHDCT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHDCT.setDefaultCapable(false);
        btnHDCT.setFocusPainted(false);
        btnHDCT.setFocusable(false);
        btnHDCT.setIconTextGap(0);
        btnHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDCTActionPerformed(evt);
            }
        });
        jPanel8.add(btnHDCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        txtHDCT.setEditable(false);
        txtHDCT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHDCT.setBorder(null);
        txtHDCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHDCTKeyReleased(evt);
            }
        });
        jPanel8.add(txtHDCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 330, -1));

        lblLoiHDCT.setForeground(new java.awt.Color(255, 0, 0));
        lblLoiHDCT.setText("Vui lòng chọn mã hóa đơn chi tiết");
        jPanel8.add(lblLoiHDCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel8.add(spt_HDCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDKeyReleased

    private void txtTenHKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenHKKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenHKKeyReleased

    private void txtMaNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVKeyReleased

    private void btnMaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaNVMouseClicked
        dcplNgayLap.setVisible(false);
        pnlCBX_TenHK.setVisible(false);
        showHideCBX_MaNV();
    }//GEN-LAST:event_btnMaNVMouseClicked

    private void btnMaNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaNVMouseEntered
        btnMaNV.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnMaNVMouseEntered

    private void txtNgayLapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayLapKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayLapKeyReleased

    private void dcplNgayLapOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dcplNgayLapOnSelectionChange
        try {
            String s = String.valueOf(dcplNgayLap.getSelection()).substring(1, String.valueOf(dcplNgayLap.getSelection()).length() - 1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String d = sdf.format(new Date(s));
            txtNgayLap.setText(d);
            dcplNgayLap.setVisible(false);
            showHide_NgayLap++;
        } catch (Exception e) {
            dcplNgayLap.setVisible(false);
            showHide_NgayLap++;
        }
    }//GEN-LAST:event_dcplNgayLapOnSelectionChange

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        txtTimKiem.setText(null);
        dong = tblHoaDon.getSelectedRow();
        hienThi(dong);
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        new HoaDonDAO().tim(tblHoaDon, txtTimKiem.getText().trim());
        editColumnWidth();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        new DungChung().hoverButton5(1, btnThem, "bgButtonThemHover.png");
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        new DungChung().hoverButton5(2, btnThem, "bgButtonThem.png");
    }//GEN-LAST:event_btnThemMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        them();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseEntered
        new DungChung().hoverButton5(1, btnCapNhat, "bgButtonCapNhatHover.png");
    }//GEN-LAST:event_btnCapNhatMouseEntered

    private void btnCapNhatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseExited
        new DungChung().hoverButton5(2, btnCapNhat, "bgButtonCapNhat.png");
    }//GEN-LAST:event_btnCapNhatMouseExited

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if(tblHoaDon.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Chọn hóa đơn cần cập nhật.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }else{
            capNhat();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        new DungChung().hoverButton5(1, btnXoa, "bgButtonXoaHover.png");
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        new DungChung().hoverButton5(2, btnXoa, "bgButtonXoa.png");
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (chucVu.equals("Trưởng phòng")) {
            xoa();
        } else {
            JOptionPane.showMessageDialog(this, "Chỉ admin được phép xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseEntered
        new DungChung().hoverButton5(1, btnMoi, "bgButtonMoiHover.png");
    }//GEN-LAST:event_btnMoiMouseEntered

    private void btnMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseExited
        new DungChung().hoverButton5(2, btnMoi, "bgButtonMoi.png");
    }//GEN-LAST:event_btnMoiMouseExited

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        moi();
        tblHoaDon.clearSelection();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseEntered
        new DungChung().hoverButton5(1, btnExcel, "bgButtonExcelHover.png");
    }//GEN-LAST:event_btnExcelMouseEntered

    private void btnExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseExited
        new DungChung().hoverButton5(2, btnExcel, "bgButtonExcel.png");
    }//GEN-LAST:event_btnExcelMouseExited

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        exportExcel();
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseEntered
        new DungChung().hoverButton5(1, btnPDF, "bgButtonFPTHover.png");
    }//GEN-LAST:event_btnPDFMouseEntered

    private void btnPDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseExited
        new DungChung().hoverButton5(2, btnPDF, "bgButtonFPT.png");
    }//GEN-LAST:event_btnPDFMouseExited

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        exportPDF();
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnPreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreMouseEntered
        new DungChung().hoverButton5(1, btnPre, "bgDauHover.png");
    }//GEN-LAST:event_btnPreMouseEntered

    private void btnPreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreMouseExited
        new DungChung().hoverButton5(2, btnPre, "bgDau.png");
    }//GEN-LAST:event_btnPreMouseExited

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        chucNang("dau");
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnFirstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseEntered
        new DungChung().hoverButton5(1, btnFirst, "bgPreHover.png");
    }//GEN-LAST:event_btnFirstMouseEntered

    private void btnFirstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseExited
        new DungChung().hoverButton5(2, btnFirst, "bgPre.png");
    }//GEN-LAST:event_btnFirstMouseExited

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        chucNang("pre");
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseEntered
        new DungChung().hoverButton5(1, btnLast, "bgNextHover.png");
    }//GEN-LAST:event_btnLastMouseEntered

    private void btnLastMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseExited
        new DungChung().hoverButton5(2, btnLast, "bgNext.png");
    }//GEN-LAST:event_btnLastMouseExited

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        chucNang("next");
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        new DungChung().hoverButton5(1, btnNext, "bgCuoiHover.png");
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        new DungChung().hoverButton5(2, btnNext, "bgCuoi.png");
    }//GEN-LAST:event_btnNextMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        chucNang("cuoi");
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtMaHDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHDKeyTyped
        if (txtMaHD.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMaHDKeyTyped

    private void btnTenHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenHKActionPerformed
        dcplNgayLap.setVisible(false);
        pnlCBX_MaNV.setVisible(false);
        pnlCBX_HDCT.setVisible(false);
        showHideCBX_CMND();
    }//GEN-LAST:event_btnTenHKActionPerformed

    private void btnNgayLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgayLapActionPerformed
        pnlCBX_MaNV.setVisible(false);
        pnlCBX_TenHK.setVisible(false);
        pnlCBX_HDCT.setVisible(false);
        showHideDate_NgayLap();
    }//GEN-LAST:event_btnNgayLapActionPerformed

    private void txtHDCTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHDCTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHDCTKeyReleased

    private void btnHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDCTActionPerformed
        dcplNgayLap.setVisible(false);
        pnlCBX_MaNV.setVisible(false);
        pnlCBX_TenHK.setVisible(false);
        showHideCBX_HDCT();
    }//GEN-LAST:event_btnHDCTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHDCT;
    private javax.swing.JButton btnLast;
    private javax.swing.JLabel btnMaNV;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNgayLap;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnTenHK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private datechooser.beans.DateChooserPanel dcplNgayLap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JLabel lblLoiHDCT;
    private javax.swing.JLabel lblLoiMaHD;
    private javax.swing.JLabel lblLoiMaNV;
    private javax.swing.JLabel lblLoiNhayLap;
    private javax.swing.JLabel lblLoiTenHK;
    private javax.swing.JLabel lblSTT;
    private javax.swing.JPanel pnlCBX_HDCT;
    private javax.swing.JPanel pnlCBX_MaNV;
    private javax.swing.JPanel pnlCBX_TenHK;
    private javax.swing.JScrollPane splTable;
    private javax.swing.JSeparator sptMaNV;
    private javax.swing.JSeparator sptTenHK;
    private javax.swing.JSeparator spt_HDCT;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtHDCT;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtTenHK;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
