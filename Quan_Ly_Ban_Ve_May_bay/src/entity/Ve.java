/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Ve {

    private String IDVe;
    private String IDChuyenBay;
    private String MaGHe;
    private String IDHang;
    private String NgayMua;
    private String GiaTien;

    public Ve() {
    }

    public Ve(String IDVe, String IDChuyenBay, String MaGHe, String IDHang, String NgayMua, String GiaTien) {
        this.IDVe = IDVe;
        this.IDChuyenBay = IDChuyenBay;
        this.MaGHe = MaGHe;
        this.IDHang = IDHang;
        this.NgayMua = NgayMua;
        this.GiaTien = GiaTien;
    }

    public String getIDVe() {
        return IDVe;
    }

    public void setIDVe(String IDVe) {
        this.IDVe = IDVe;
    }

    public String getIDChuyenBay() {
        return IDChuyenBay;
    }

    public void setIDChuyenBay(String IDChuyenBay) {
        this.IDChuyenBay = IDChuyenBay;
    }

    public String getMaGHe() {
        return MaGHe;
    }

    public void setMaGHe(String MaGHe) {
        this.MaGHe = MaGHe;
    }

    public String getIDHang() {
        return IDHang;
    }

    public void setIDHang(String IDHang) {
        this.IDHang = IDHang;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(String NgayMua) {
        this.NgayMua = NgayMua;
    }

    public String getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(String GiaTien) {
        this.GiaTien = GiaTien;
    }

}
