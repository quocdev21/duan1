/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Ve {
    private String idVe;
    private String maGhe;
    private Date ngayMua;
    private Float giaTien;
    
    private ChuyenBay chuyenBay;
    private KhachHang khachHang;

    public Ve() {
    }

    public Ve(String idVe, String maGhe, Date ngayMua, Float giaTien, ChuyenBay chuyenBay, KhachHang khachHang) {
        this.idVe = idVe;
        this.maGhe = maGhe;
        this.ngayMua = ngayMua;
        this.giaTien = giaTien;
        this.chuyenBay = chuyenBay;
        this.khachHang = khachHang;
    }

    public String getIdVe() {
        return idVe;
    }

    public void setIdVe(String idVe) {
        this.idVe = idVe;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public Float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Float giaTien) {
        this.giaTien = giaTien;
    }

    public ChuyenBay getChuyenBay() {
        return chuyenBay;
    }

    public void setChuyenBay(ChuyenBay chuyenBay) {
        this.chuyenBay = chuyenBay;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "Ve{" + "idVe=" + idVe + ", maGhe=" + maGhe + ", ngayMua=" + ngayMua + ", giaTien=" + giaTien + ", chuyenBay=" + chuyenBay + ", khachHang=" + khachHang + '}';
    }
    
    

}
