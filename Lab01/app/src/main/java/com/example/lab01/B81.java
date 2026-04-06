package com.example.lab01;

import java.io.Serializable;

public class B81 implements Serializable {
    String hoTen;
    String gioiTinh;
    String queQuan;

    public B81() {

    }
    public B81(String hoTen, String gioiTinh, String queQuan) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return hoTen + "-" + gioiTinh + "-" + queQuan;
    }
}
