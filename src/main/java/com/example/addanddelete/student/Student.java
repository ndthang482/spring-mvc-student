package com.example.addanddelete.student;

import javax.persistence.*;

@Entity
@Table(name = "sinhvien")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_sinhvien;

    @Column(length = 50, nullable = false)

    private String Hoten;

    @Column(length = 50, nullable = false)
    private String Ten;


    private int Tuoi;
    @Column(length = 50, nullable = false)
    private String Sodienthoai;
    @Column(length = 50, nullable = false)
    private String Chuyennganh;
    @Column(length = 50, nullable = false)
    private String Giangvien;

    private int Detai;

    private int Diem;
    @Column(length = 45, nullable = false)
    private String TenDetai;

    public Integer getID_sinhvien() {
        return ID_sinhvien;
    }

    public void setID_sinhvien(Integer ID_sinhvien) {
        this.ID_sinhvien = ID_sinhvien;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getChuyennganh() {
        return Chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        Chuyennganh = chuyennganh;
    }

    public String getGiangvien() {
        return Giangvien;
    }

    public void setGiangvien(String giangvien) {
        Giangvien = giangvien;
    }

    public int getDetai() {
        return Detai;
    }

    public void setDetai(int detai) {
        Detai = detai;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int diem) {
        Diem = diem;
    }

    public String getTenDetai() {
        return TenDetai;
    }

    public void setTenDetai(String tenDetai) {
        TenDetai = tenDetai;
    }
}
