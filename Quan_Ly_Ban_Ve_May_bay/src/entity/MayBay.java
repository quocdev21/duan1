/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Simp
 */
public class MayBay {
    private String idMaybay;
    private String soHieuMayBay;
    private String hangMaybay;
    private int soLuongGhe;

    public MayBay() {
    }

    public MayBay(String idMaybay, String soHieuMayBay, String hangMaybay, int soLuongGhe) {
        this.idMaybay = idMaybay;
        this.soHieuMayBay = soHieuMayBay;
        this.hangMaybay = hangMaybay;
        this.soLuongGhe = soLuongGhe;
    }

    public String getIdMaybay() {
        return idMaybay;
    }

    public void setIdMaybay(String idMaybay) {
        this.idMaybay = idMaybay;
    }

    public String getSoHieuMayBay() {
        return soHieuMayBay;
    }

    public void setSoHieuMayBay(String soHieuMayBay) {
        this.soHieuMayBay = soHieuMayBay;
    }

    public String getHangMaybay() {
        return hangMaybay;
    }

    public void setHangMaybay(String hangMaybay) {
        this.hangMaybay = hangMaybay;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    @Override
    public String toString() {
        return "MayBay{" + "idMaybay=" + idMaybay + ", soHieuMayBay=" + soHieuMayBay + ", hangMaybay=" + hangMaybay + ", soLuongGhe=" + soLuongGhe + '}';
    }
    
    
}
