/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class HoaDonChiTiet {
    private String maHoaDon;
    private String maVe;
    private int soGheDat;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public HoaDonChiTiet(String maHoaDon, String maVe) {
        this.maHoaDon = maHoaDon;
        this.maVe = maVe;
    }

    public HoaDonChiTiet(String maHoaDon, String maVe, int soGheDat) {
        this.maHoaDon = maHoaDon;
        this.maVe = maVe;
        this.soGheDat = soGheDat;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public int getSoGheDat() {
        return soGheDat;
    }

    public void setSoGheDat(int soGheDat) {
        this.soGheDat = soGheDat;
    }
}
