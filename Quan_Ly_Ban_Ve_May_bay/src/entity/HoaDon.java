/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


/**
 *
 * @author pc
 */
public class HoaDon {

    private String ID_HoaDon;
    private String ID_NhanVien;
    private String ID_HoaDonCT;
    private String ID_ThanhToan;
    private String ThoiGianTao;


    public HoaDon() {
    }

    public HoaDon(String ID_HoaDon, String ID_NhanVien, String ID_HoaDonCT, String ID_ThanhToan, String ThoiGianTao) {
        this.ID_HoaDon = ID_HoaDon;
        this.ID_NhanVien = ID_NhanVien;
        this.ID_HoaDonCT = ID_HoaDonCT;
        this.ID_ThanhToan = ID_ThanhToan;
        this.ThoiGianTao = ThoiGianTao;
    }

    public String getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(String ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public String getID_NhanVien() {
        return ID_NhanVien;
    }

    public void setID_NhanVien(String ID_NhanVien) {
        this.ID_NhanVien = ID_NhanVien;
    }

    public String getID_HoaDonCT() {
        return ID_HoaDonCT;
    }

    public void setID_HoaDonCT(String ID_HoaDonCT) {
        this.ID_HoaDonCT = ID_HoaDonCT;
    }

    public String getID_ThanhToan() {
        return ID_ThanhToan;
    }

    public void setID_ThanhToan(String ID_ThanhToan) {
        this.ID_ThanhToan = ID_ThanhToan;
    }

    public String getThoiGianTao() {
        return ThoiGianTao;
    }

    public void setThoiGianTao(String ThoiGianTao) {
        this.ThoiGianTao = ThoiGianTao;
    }

}
