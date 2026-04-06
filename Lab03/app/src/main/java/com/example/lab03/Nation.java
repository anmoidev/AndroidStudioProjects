package com.example.lab03;

public class Nation {
    private String name;
    private String  population;
    private String area;
    private int nation;

    public Nation(){

    }
    public Nation(String name, String population, String area, int nation){
        this.name = name;
        this.population = population;
        this.area = area;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", area='" + area + '\'' +
                ", nation=" + nation +
                '}';
    }
}
