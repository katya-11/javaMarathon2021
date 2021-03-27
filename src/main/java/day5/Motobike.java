package day5;

public class Motobike {
    private int year;
    private String model;
    private String color;

    public Motobike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Motobike(int year, String model) {
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
