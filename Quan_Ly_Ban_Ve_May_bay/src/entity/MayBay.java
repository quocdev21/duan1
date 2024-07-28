/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class MayBay {
    private String maMaybay;
    private String maHang;

    public MayBay() {
    }

    public MayBay(String maMaybay) {
        this.maMaybay = maMaybay;
    }

    public MayBay(String maMaybay, String maHang) {
        this.maMaybay = maMaybay;
        this.maHang = maHang;
    }

    public String getMaMaybay() {
        return maMaybay;
    }

    public void setMaMaybay(String maMaybay) {
        this.maMaybay = maMaybay;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
}
