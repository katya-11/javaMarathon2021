package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Введи корректный год");
        } else {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Ты ввел пустой цвет");
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Ты ввел пустую модель");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int diff = this.year - inputYear;
        return diff;
    }


}
