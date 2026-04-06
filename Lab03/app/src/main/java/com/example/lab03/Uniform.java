package com.example.lab03;

public class Uniform {
    private String NameUniform;
    private String Price;
    private String Brand;
    private String RatingUni;
    private int imageUni;

    public Uniform() {

    }
    public Uniform(String NameUniform, String Price, String Brand, String RatingUni, int imageUni) {
        this.NameUniform = NameUniform;
        this.Price = Price;
        this.Brand = Brand;
        this.RatingUni = RatingUni;
        this.imageUni = imageUni;
    }

    public String getNameUniform() {
        return NameUniform;
    }

    public void setNameUniform(String nameUniform) {
        NameUniform = nameUniform;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getRatingUni() {
        return RatingUni;
    }

    public void setRatingUni(String ratingUni) {
        RatingUni = ratingUni;
    }

    public int getImageUni() {
        return imageUni;
    }

    public void setImageUni(int imageUni) {
        this.imageUni = imageUni;
    }
}
