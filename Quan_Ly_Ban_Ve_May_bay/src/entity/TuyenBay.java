/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class TuyenBay {
    private String maTuyenBay;
    private String maSanBayDi;
    private String maSanBayDen;

    public TuyenBay() {
    }

    public TuyenBay(String maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public TuyenBay(String maTuyenBay, String maSanBayDi, String maSanBayDen) {
        this.maTuyenBay = maTuyenBay;
        this.maSanBayDi = maSanBayDi;
        this.maSanBayDen = maSanBayDen;
    }

    public String getMaTuyenBay() {
        return maTuyenBay;
    }

    public void setMaTuyenBay(String maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public String getMaSanBayDi() {
        return maSanBayDi;
    }

    public void setMaSanBayDi(String maSanBayDi) {
        this.maSanBayDi = maSanBayDi;
    }

    public String getMaSanBayDen() {
        return maSanBayDen;
    }

    public void setMaSanBayDen(String maSanBayDen) {
        this.maSanBayDen = maSanBayDen;
    }
}
