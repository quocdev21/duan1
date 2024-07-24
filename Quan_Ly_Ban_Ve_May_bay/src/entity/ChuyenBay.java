/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Simp
 */
public class ChuyenBay {

    private String idChuyenBay;
    private Date ngayDi;
    private Date thoiGianDi;
    private Date thoiGianDen;
    private Integer thoiGianTre;
    private String ghiChu;

    private MayBay idMaybay;

    public ChuyenBay() {
    }

    public ChuyenBay(String idChuyenBay, Date ngayDi, Date thoiGianDi, Date thoiGianDen, Integer thoiGianTre, String ghiChu, MayBay idMaybay) {
        this.idChuyenBay = idChuyenBay;
        this.ngayDi = ngayDi;
        this.thoiGianDi = thoiGianDi;
        this.thoiGianDen = thoiGianDen;
        this.thoiGianTre = thoiGianTre;
        this.ghiChu = ghiChu;
        this.idMaybay = idMaybay;
    }

    public String getIdChuyenBay() {
        return idChuyenBay;
    }

    public void setIdChuyenBay(String idChuyenBay) {
        this.idChuyenBay = idChuyenBay;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }

    public int getThoiGianTre() {
        return thoiGianTre;
    }

    public void setThoiGianTre(int thoiGianTre) {
        this.thoiGianTre = thoiGianTre;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "ChuyenBay{" + "idChuyenBay=" + idChuyenBay + ", ngayDi=" + ngayDi + ", thoiGianDi=" + thoiGianDi + ", thoiGianDen=" + thoiGianDen + ", thoiGianTre=" + thoiGianTre + ", ghiChu=" + ghiChu + '}';
    }
}
