package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] arr = new int[m][n];
        int summa = 0;
        int tempSumma;
        int indMaxSumma = 0;

        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            tempSumma = 0;
            for (int j = 0; j < arr[i].length; j++) {
                tempSumma = tempSumma + arr[i][j];
                if (tempSumma >= summa) {
                    summa = tempSumma;
                    indMaxSumma = i;
                }
            }
        }
        System.out.println("Ответ: " + indMaxSumma);


    }
}
