/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Statictical {
    private String Nam;
    private String Thang;
    private int SoLuong;
    private String DoanhThu;

    public Statictical() {
    }

    public Statictical(String Nam, String Thang, int SoLuong, String DoanhThu) {
        this.Nam = Nam;
        this.Thang = Thang;
        this.SoLuong = SoLuong;
        this.DoanhThu = DoanhThu;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String Nam) {
        this.Nam = Nam;
    }

    public String getThang() {
        return Thang;
    }

    public void setThang(String Thang) {
        this.Thang = Thang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(String DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

    
    
    
}
