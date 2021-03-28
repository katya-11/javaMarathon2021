package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing1", 2018, 101, 500);
        Airplane airplane2 = new Airplane("Boeing2", 2018, 123, 500);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
