/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class HoaDonCT {

    private String IDHoaDonCT;
    private String IDVe;
    private String SoLuongVe;
    private float ThanhTien;

    public HoaDonCT() {
    }

    public HoaDonCT(String IDHoaDonCT, String IDVe, String SoLuongVe, float ThanhTien) {
        this.IDHoaDonCT = IDHoaDonCT;
        this.IDVe = IDVe;
        this.SoLuongVe = SoLuongVe;
        this.ThanhTien = ThanhTien;
    }

    public String getIDHoaDonCT() {
        return IDHoaDonCT;
    }

    public void setIDHoaDonCT(String IDHoaDonCT) {
        this.IDHoaDonCT = IDHoaDonCT;
    }

    public String getIDVe() {
        return IDVe;
    }

    public void setIDVe(String IDVe) {
        this.IDVe = IDVe;
    }

    public String getSoLuongVe() {
        return SoLuongVe;
    }

    public void setSoLuongVe(String SoLuongVe) {
        this.SoLuongVe = SoLuongVe;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    
    
    

}
