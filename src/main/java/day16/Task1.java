package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int sum = 0;
            int counter = 0;
            while (scanner.hasNextInt()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                    counter++;
                }
            }

            DecimalFormat decimalFormat = new DecimalFormat(".###");

            System.out.print((double) sum / counter + " --> ");
            System.out.print(decimalFormat.format((double) sum / counter));

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Деление на 0 запрещено");
        }

    }
}

