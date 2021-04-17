package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes.txt");
        PrintWriter printWriter = null;
        Scanner scanner = null;

        try {
            scanner = new Scanner(file1);
            printWriter = new PrintWriter(file2);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesData = line.split(";");
                if (Integer.parseInt(shoesData[2]) == 0) {
                    printWriter.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (printWriter != null) {
                printWriter.close();
                scanner.close();
            }
        }

    }
}
