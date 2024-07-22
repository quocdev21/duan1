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
    private String SoCCCD;
    private String Email;
    private String DiaChi;
    private String GioiTinh;

    public KhachHang() {
    }

    public KhachHang(String IDKhachHang, String TenKhachHang, String SDT, String SoCCCD, String Email, String DiaChi, String GioiTinh) {
        this.IDKhachHang = IDKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.SDT = SDT;
        this.SoCCCD = SoCCCD;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
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

    public String getSoCCCD() {
        return SoCCCD;
    }

    public void setSoCCCD(String SoCCCD) {
        this.SoCCCD = SoCCCD;
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    
}

