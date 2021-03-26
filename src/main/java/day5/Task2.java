package day5;


public class Task2 {
    public static void main(String[] args) {

        class Motobike {
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

        Motobike motobike1 = new Motobike(2020, "BMW");
        Motobike motobike2 = new Motobike(2010, "Yamaha", "Red");

        System.out.println("Год выпуска: " + motobike1.getYear() + ", Модель: " + motobike1.getModel() + ", Цвет: " + motobike1.getColor());
        System.out.println("Год выпуска: " + motobike2.getYear() + ", Модель: " + motobike2.getModel() + ", Цвет: " + motobike2.getColor());

    }
}
