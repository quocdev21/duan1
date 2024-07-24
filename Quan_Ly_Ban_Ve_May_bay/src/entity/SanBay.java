/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Simp
 */
public class SanBay {
    private String idSanBay;
    private String tenSanBay;
    private String tenThanhPho;
    private String quocGia;

    public SanBay() {
    }

    public SanBay(String idSanBay, String tenSanBay, String tenThanhPho, String quocGia) {
        this.idSanBay = idSanBay;
        this.tenSanBay = tenSanBay;
        this.tenThanhPho = tenThanhPho;
        this.quocGia = quocGia;
    }

    public String getIdSanBay() {
        return idSanBay;
    }

    public void setIdSanBay(String idSanBay) {
        this.idSanBay = idSanBay;
    }

    public String getTenSanBay() {
        return tenSanBay;
    }

    public void setTenSanBay(String tenSanBay) {
        this.tenSanBay = tenSanBay;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "SanBay{" + "idSanBay=" + idSanBay + ", tenSanBay=" + tenSanBay + ", tenThanhPho=" + tenThanhPho + ", quocGia=" + quocGia + '}';
    }
    
    
}
