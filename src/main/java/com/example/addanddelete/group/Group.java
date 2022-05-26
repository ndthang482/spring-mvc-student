package com.example.addanddelete.group;

import javax.persistence.*;

@Entity
@Table(name = "nhom")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_nhom;

    @Column(length = 50, nullable = false)

    private String Sinhvien;
    @Column(length = 50, nullable = false)

    private String Detai;
    @Column(length = 50, nullable = false)

    private String giangvien;

    private float Diem;

    public Integer getID_nhom() {
        return ID_nhom;
    }

    public void setID_nhom(Integer ID_nhom) {
        this.ID_nhom = ID_nhom;
    }

    public String getSinhvien() {
        return Sinhvien;
    }

    public void setSinhvien(String sinhvien) {
        Sinhvien = sinhvien;
    }

    public String getDetai() {
        return Detai;
    }

    public void setDetai(String detai) {
        Detai = detai;
    }

    public String getGiangvien() {
        return giangvien;
    }

    public void setGiangvien(String giangvien) {
        this.giangvien = giangvien;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float diem) {
        Diem = diem;
    }
}
