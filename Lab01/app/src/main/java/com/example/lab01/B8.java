package com.example.lab01;

import java.io.Serializable;

public class B8 implements Serializable {
    String hoTen;
    String gioiTinh;
    String queQuan;

    public B8() {

    }
    public B8(String hoTen, String gioiTinh, String queQuan) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return hoTen + "-" + gioiTinh + "-" + queQuan;
    }
}
