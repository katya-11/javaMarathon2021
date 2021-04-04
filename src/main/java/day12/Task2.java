package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i <= 350; i = i + 2) {
            if (i <= 30) {
                even.add(i);
                if (i == 30) {
                    i = 298;
                }
            } else if (i >= 300 && i <= 350) {
                even.add(i);
            }
        }
        System.out.println(even);
    }
}
