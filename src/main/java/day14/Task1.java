package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int sum = 0;
            List<String> num = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numberS = line.split(" ");
                num.addAll(Arrays.asList(numberS));
            }

            try {
                String[] numbersCopy = new String[10];
                for (int i = 0; i < num.size(); i++) {
                    numbersCopy[i] = num.get(i);
                }

                for (String s : numbersCopy) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            } catch (Exception e) {
                System.out.println("Некорректный входной файл");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
    }
}

