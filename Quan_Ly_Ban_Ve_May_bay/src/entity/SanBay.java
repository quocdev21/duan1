/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class SanBay {
    private String maSanBay;
    private String tenSanbay;
    private String quocGia;
    private String diaDiem;

    public SanBay() {
    }

    public SanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public SanBay(String maSanBay, String tenSanbay) {
        this.maSanBay = maSanBay;
        this.tenSanbay = tenSanbay;
    }

    public SanBay(String maSanBay, String tenSanbay, String quocGia, String diaDiem) {
        this.maSanBay = maSanBay;
        this.tenSanbay = tenSanbay;
        this.quocGia = quocGia;
        this.diaDiem = diaDiem;
    }

    public String getMaSanBay() {
        return maSanBay;
    }

    public void setMaSanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public String getTenSanbay() {
        return tenSanbay;
    }

    public void setTenSanbay(String tenSanbay) {
        this.tenSanbay = tenSanbay;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
}
