package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("BMW", "Tesla", "Opel", "Mazda", "Suzuki"));
        cars.add(2, "Audi");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
    }
}
