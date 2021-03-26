package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        while (true) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0) {
                break;
            } else {
                System.out.println(a / b);

            }
        }
    }
}
