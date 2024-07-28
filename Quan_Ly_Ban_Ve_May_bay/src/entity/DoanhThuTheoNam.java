/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class DoanhThuTheoNam {
    private String maVe;
    private int nam;
    private double thanhTien;

    public DoanhThuTheoNam() {
    }

    public DoanhThuTheoNam(String maVe, int nam) {
        this.maVe = maVe;
        this.nam = nam;
    }

    public DoanhThuTheoNam(String maVe, int nam, double thanhTien) {
        this.maVe = maVe;
        this.nam = nam;
        this.thanhTien = thanhTien;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
}
