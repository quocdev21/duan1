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
public class HanhKhach implements Serializable{
    private String cccd;
    private String hoTen;
    private boolean gioiTinh;
    private String soDT;
    private String email;
    private String diaChi;

    public HanhKhach() {
    }

    public HanhKhach(String cccd) {
        this.cccd = cccd;
    }

    public HanhKhach(String cccd, String hoTen) {
        this.cccd = cccd;
        this.hoTen = hoTen;
    }

    public HanhKhach(String cccd, String hoTen, boolean gioiTinh, String soDT, String email, String diaChi) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
