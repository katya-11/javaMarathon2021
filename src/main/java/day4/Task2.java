package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count0 = 0;
        int summa0 = 0;
        int max = 0;
        int min = 10000;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        for (int number : arr) {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (number <= min) {
                        min = number;
                    } else if (number > max) {
                        max = number;
                    }

                }
            if (number % 10 == 0) {
                count0++;
                summa0 = summa0 + number;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
        System.out.println(count0);
        System.out.println(summa0);
    }
}
