/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author TuanDuc
 */
public class ChuyenBay implements Serializable{
    private String maChuyenBay;
    private String ngayDi;
    private String ngayDen;
    private String gioKhoiHanh;
    private String maTuyenBay;
    private String mamayBay;
    private double Gia;

    public ChuyenBay() {
    }

    public ChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public ChuyenBay(String maChuyenBay, String ngayDi, String ngayDen, String gioKhoiHanh, String maTuyenBay, String mamayBay, double Gia) {
        this.maChuyenBay = maChuyenBay;
        this.ngayDi = ngayDi;
        this.ngayDen = ngayDen;
        this.gioKhoiHanh = gioKhoiHanh;
        this.maTuyenBay = maTuyenBay;
        this.mamayBay = mamayBay;
        this.Gia = Gia;
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

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }
}
