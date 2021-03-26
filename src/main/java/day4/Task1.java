package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int a = scanner.nextInt();
        int[] arr = new int[a];
        int count8 = 0;
        int count1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int summa = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int number : arr) {
            summa = summa + number;
            if (number > 8) {
                count8++;
            } else if (number == 1) {
                count1++;
            } else if (number % 2 == 0) {
                countEven++;
            } else if (number % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел:" + countOdd);
        System.out.println("Сумма всех элементов массива:" + summa);
    }
}
