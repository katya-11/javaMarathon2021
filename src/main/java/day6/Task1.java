package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        Motorbike motorbike = new Motorbike("Yava", "White", 2019);

        car.info();
        motorbike.info();

        System.out.println("Разница между переданным годом и годом выпуска автомобиля = " + car.yearDifference( 2018));
        System.out.println("Разница между переданным годом и годом выпуска мотоцикла = " + motorbike.yearDifference(2000));
    }
}
