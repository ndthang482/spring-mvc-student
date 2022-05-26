package com.example.addanddelete.major;

import javax.persistence.*;

@Entity
@Table(name ="chuyennganh")
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_chuyennganh;
    @Column(length = 50, name="HovaTen")
    private String HovaTen;
    private int Tuoi;

    private int Sodienthoai;
    @Column(length = 50, nullable = false)

    private String Chuyennganh;

    public Integer getID_chuyennganh() {
        return ID_chuyennganh;
    }

    public void setID_chuyennganh(Integer ID_chuyennganh) {
        this.ID_chuyennganh = ID_chuyennganh;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String hovaTen) {
        HovaTen = hovaTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public int getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getChuyennganh() {
        return Chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        Chuyennganh = chuyennganh;
    }


}
