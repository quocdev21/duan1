/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Simp
 */
public class HangVe {
    private String idHangVe;
    private String tenHang;

    public HangVe() {
    }

    public HangVe(String idHangVe, String tenHang) {
        this.idHangVe = idHangVe;
        this.tenHang = tenHang;
    }

    public String getIdHangVe() {
        return idHangVe;
    }

    public void setIdHangVe(String idHangVe) {
        this.idHangVe = idHangVe;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    @Override
    public String toString() {
        return "HangVe{" + "idHangVe=" + idHangVe + ", tenHang=" + tenHang + '}';
    }
}
