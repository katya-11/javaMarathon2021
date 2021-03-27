package day5;


public class Task2 {
    public static void main(String[] args) {

        Motobike motobike1 = new Motobike(2020, "BMW");
        Motobike motobike2 = new Motobike(2010, "Yamaha", "Red");

        System.out.println("Год выпуска: " + motobike1.getYear() + ", Модель: " + motobike1.getModel() + ", Цвет: " + motobike1.getColor());
        System.out.println("Год выпуска: " + motobike2.getYear() + ", Модель: " + motobike2.getModel() + ", Цвет: " + motobike2.getColor());

    }
}
