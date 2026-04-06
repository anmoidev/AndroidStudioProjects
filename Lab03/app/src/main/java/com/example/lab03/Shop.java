package com.example.lab03;

public class Shop {
    private String name;
    private String rating;
    private String stock;
    private String price;
    int img;

    public Shop(){}
    public Shop(String name, String rating, String stock, String price, int img) {
        this.name = name;
        this.rating = rating;
        this.stock = stock;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", stock='" + stock + '\'' +
                ", price='" + price + '\'' +
                ", img=" + img +
                '}';
    }
}
