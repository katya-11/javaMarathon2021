package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike1 = new Motorbike("BMW", 2000);
        Motorbike motorbike2 = new Motorbike("Yamaha", "Red", 2019);

        System.out.println("Год выпуска: " + motorbike1.getYear() + ", Модель: " + motorbike1.getModel() + ", Цвет: " + motorbike1.getColor());
        System.out.println("Год выпуска: " + motorbike2.getYear() + ", Модель: " + motorbike2.getModel() + ", Цвет: " + motorbike2.getColor());

    }
}
