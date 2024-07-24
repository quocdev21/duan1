/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HuyHoang
 */
public class NhanVien {
    private String ID_NhanVien;
    private String TenDangNhap;
    private String TenNhanVien;
    private String CCCD;
    private String SDT;
    private String DiaChi;
    private String Email;
    private String MatKhau;
    private String TrangThai;
    private String ChucVu;

    public NhanVien() {
    }

    public NhanVien(String ID_NhanVien, String TenDangNhap, String TenNhanVien, String CCCD, String SDT, String DiaChi, String Email, String MatKhau, String TrangThai, String ChucVu) {
        this.ID_NhanVien = ID_NhanVien;
        this.TenDangNhap = TenDangNhap;
        this.TenNhanVien = TenNhanVien;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
        this.ChucVu = ChucVu;
    }

    public String getID_NhanVien() {
        return ID_NhanVien;
    }

    public void setID_NhanVien(String ID_NhanVien) {
        this.ID_NhanVien = ID_NhanVien;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
    
}
