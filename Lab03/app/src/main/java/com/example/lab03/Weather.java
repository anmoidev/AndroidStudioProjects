package com.example.lab03;

public class Weather {
    private String city;
    private String weather;
    private String temp;
    int imgWeather;

    public Weather() {

    }
    public Weather(String city, String weather, String temp, int imgWeather) {
        this.city = city;
        this.weather = weather;
        this.temp = temp;
        this.imgWeather = imgWeather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getImgWeather() {
        return imgWeather;
    }

    public void setImgWeather(int imgWeather) {
        this.imgWeather = imgWeather;
    }
}
