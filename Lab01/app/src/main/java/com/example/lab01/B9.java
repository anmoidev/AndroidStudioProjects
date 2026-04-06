package com.example.lab01;

import java.io.Serializable;

public class B9 implements Serializable {
    private String hoTen;
    private String gioiTinh;
    private boolean ckvanBang;
    private int imgId;

    public B9() {

    }

    public B9 (String hoTen, String gioiTinh, boolean ckvanBang, int imgId) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ckvanBang = ckvanBang;
        this.imgId = imgId;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isCkvanBang() {
        return ckvanBang;
    }

    public void setCkvanBang(boolean ckvanBang) {
        this.ckvanBang = ckvanBang;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
