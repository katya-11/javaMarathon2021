package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random random = new Random();

//Создание файла 1 и его заполнение рандомными числами от 0 до 100
        try {
            if (file1.exists()) {
                System.out.println("Файл1 уже создан");

            } else {
                file1.createNewFile();
                PrintWriter printWriter = new PrintWriter(file1);
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 100; j++) {
                        printWriter.print(random.nextInt(100) + " ");
                    }
                    printWriter.println();
                }
                printWriter.close();
            }

//Создание файла2 и его заполнние из файла1 средним арифметическим 20 чисел
            if (file2.exists()) {
                System.out.println("Файл2 уже создан");

            } else {
                file2.createNewFile();
                Scanner scanner = new Scanner(file1);
                PrintWriter printWriter = new PrintWriter(file2);
                int sum = 0;
                int counter = 0;
                while (scanner.hasNextInt()) {
                    String line = scanner.nextLine();
                    String[] numbers = line.split(" ");
                    for (String number : numbers) {
                        sum += Integer.parseInt(number);
                        counter++;
                        if (counter == 20) {
                            printWriter.print((float) sum / counter + " ");
                            counter = 0;
                            sum = 0;
                        }
                    }
                }
                scanner.close();
                printWriter.close();
            }

            printResult(file2);

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Деление на 0 запрещено");

        }
    }


    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            double sumFloat = 0;
            while (scanner.hasNextDouble()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    sumFloat += Double.parseDouble(number);
                }
            }
            System.out.println((int) sumFloat);

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        }
    }
}
