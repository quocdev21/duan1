/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class DichVu {
    private String maDichVu;
    private String maVe;
    private String tenDichVu;
    private float giaDichVu;

    public DichVu() {
    }

    public DichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public DichVu(String maDichVu, String maVe, String tenDichVu, float giaDichVu) {
        this.maDichVu = maDichVu;
        this.maVe = maVe;
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(float giaDichVu) {
        this.giaDichVu = giaDichVu;
    }
}
