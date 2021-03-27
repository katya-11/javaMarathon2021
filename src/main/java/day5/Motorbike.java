package day5;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Motorbike(String model, int year) {
        this.year = year;
        this.model = model;
        this.color = "Цвет не задан";
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
