/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import com.toedter.calendar.demo.DateChooserPanel;

/**
 *
 * @author pc
 */
public class HoaDon {
    private String MaHoaDon;
    private String IDKhachHang;
    private String IDNhanVien;
    private DateChooserPanel ThoiGianTao;

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, String IDKhachHang, String IDNhanVien, DateChooserPanel ThoiGianTao) {
        this.MaHoaDon = MaHoaDon;
        this.IDKhachHang = IDKhachHang;
        this.IDNhanVien = IDNhanVien;
        this.ThoiGianTao = ThoiGianTao;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public DateChooserPanel getThoiGianTao() {
        return ThoiGianTao;
    }

    public void setThoiGianTao(DateChooserPanel ThoiGianTao) {
        this.ThoiGianTao = ThoiGianTao;
    }

    
    
    
}
