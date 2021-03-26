package day5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        class Car {
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
        }

        Car car1 = new Car();
        System.out.println("Введи год выпуска авто");
        car1.setYear(Integer.parseInt(reader.readLine()));

        System.out.println("Введи модель авто");
        car1.setModel(reader.readLine());

        System.out.println("Введи цвет авто");
        car1.setColor(reader.readLine());

        System.out.println("Цвет авто: " + car1.getColor());
        System.out.println("Год выпуска авто: " + car1.getYear());
        System.out.println("Модель авто: " + car1.getModel());
    }
}
