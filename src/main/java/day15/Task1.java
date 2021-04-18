package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes.txt");

        try (Scanner scanner = new Scanner(file1); PrintWriter printWriter = new PrintWriter(file2)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesData = line.split(";");
                if (Integer.parseInt(shoesData[2]) == 0) {
                    printWriter.println(shoesData[0] + ", " + shoesData[1] + ", " + shoesData[2]);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
