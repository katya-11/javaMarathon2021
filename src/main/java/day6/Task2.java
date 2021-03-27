package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2017, 135, 500);
        airplane.info();

        //change year, length and fuel 1st time
        airplane.setYear(2020);
        airplane.setLength(150);
        airplane.fillUp(100);
        airplane.info();

        //change year, length, fuel 2nd time
        airplane.setYear(2015);
        airplane.setLength(160);
        airplane.fillUp(150);
        airplane.info();
    }
}
