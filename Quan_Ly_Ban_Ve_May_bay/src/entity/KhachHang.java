/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String IDKhachHang;
    private String TenKhachHang;
    private String SDT; 
    private String SoHoChieu;
    private String Email;
    private String DiaChi;

    public KhachHang() {
    }

    public KhachHang(String IDKhachHang, String TenKhachHang, String SDT, String SoHoChieu, String Email, String DiaChi) {
        this.IDKhachHang = IDKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.SDT = SDT;
        this.SoHoChieu = SoHoChieu;
        this.Email = Email;
        this.DiaChi = DiaChi;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSoHoChieu() {
        return SoHoChieu;
    }

    public void setSoHoChieu(String SoHoChieu) {
        this.SoHoChieu = SoHoChieu;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
}

