package com.example.lab03;

public class Player {
    private String fullName;
    private String address;
    private int avatar;
    private  int flag;

    public Player() {
    }
    public Player(String fullName, String address, int avatar, int flag) {
        this.fullName = fullName;
        this.address = address;
        this.avatar = avatar;
        this.flag = flag;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Player{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", avatar=" + avatar +
                ", flag=" + flag +
                '}';
    }
}
