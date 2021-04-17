package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int sum = 0;
            int arrayLength = 0;

            while (scanner.hasNextInt()) {
                String line = scanner.nextLine();
                String[] numberS = line.split(" ");
                arrayLength += numberS.length;

                for (String s : numberS) {
                    sum += Integer.parseInt(s);
                }
            }

            if (arrayLength != 10) {
                throw new ArrayLengthException();
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (ArrayLengthException exception) {
            System.out.println("Некорректный входной файл");
        }
    }
}

