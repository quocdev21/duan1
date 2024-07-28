/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class ChuyenBay {
    private String maChuyenBay;
    private String ngayDi;
    private String ngayDen;
    private String gioKhoiHanh;
    private int soGheThuongGia;
    private int soGhePhoThong;
    private String maTuyenBay;
    private String mamayBay;

    public ChuyenBay() {
    }

    public ChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public ChuyenBay(String maChuyenBay, String ngayDi, String ngayDen, String gioKhoiHanh, int soGheThuongGia, int soGhePhoThong, String maTuyenBay, String mamayBay) {
        this.maChuyenBay = maChuyenBay;
        this.ngayDi = ngayDi;
        this.ngayDen = ngayDen;
        this.gioKhoiHanh = gioKhoiHanh;
        this.soGheThuongGia = soGheThuongGia;
        this.soGhePhoThong = soGhePhoThong;
        this.maTuyenBay = maTuyenBay;
        this.mamayBay = mamayBay;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public String getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    public void setGioKhoiHanh(String gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public int getSoGheThuongGia() {
        return soGheThuongGia;
    }

    public void setSoGheThuongGia(int soGheThuongGia) {
        this.soGheThuongGia = soGheThuongGia;
    }

    public int getSoGhePhoThong() {
        return soGhePhoThong;
    }

    public void setSoGhePhoThong(int soGhePhoThong) {
        this.soGhePhoThong = soGhePhoThong;
    }

    public String getMaTuyenBay() {
        return maTuyenBay;
    }

    public void setMaTuyenBay(String maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public String getMamayBay() {
        return mamayBay;
    }

    public void setMamayBay(String mamayBay) {
        this.mamayBay = mamayBay;
    }
}
