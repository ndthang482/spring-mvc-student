package com.example.addanddelete.teacher;

import javax.persistence.*;

@Entity
@Table(name = "giangvien")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_giangvien;

    @Column(length = 50, nullable = false)

    private String Hoten;
    @Column(length = 50, nullable = false)
    private String Ten;
    @Column(length = 50, nullable = false)
    private String Chuyennganh;

    public Integer getID_giangvien() {
        return ID_giangvien;
    }

    public void setID_giangvien(Integer ID_giangvien) {
        this.ID_giangvien = ID_giangvien;
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

    public String getChuyennganh() {
        return Chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        Chuyennganh = chuyennganh;
    }
}
