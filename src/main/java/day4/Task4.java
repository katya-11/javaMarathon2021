package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        int summa = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        for (int i = 0; i < arr.length - 2; i++) {
            int tempSumma = arr[i] + arr[i + 1] + arr[i + 2];
            if (tempSumma >= summa) {
                summa = tempSumma;
                index = i;
            }
        }
        System.out.println(summa);
        System.out.println(index);
    }
}
