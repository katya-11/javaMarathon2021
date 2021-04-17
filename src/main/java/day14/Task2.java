package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> userDataList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] userData = line.split(" ");
                String name = userData[0];
                String age = userData[1];
                if (Integer.parseInt(age) < 0) {
                    userDataList = null;
                    throw new AgeException();
                } else {
                    String nameAndAge = name + " " + age;
                    userDataList.add(nameAndAge);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (AgeException e) {
            System.out.println("Некорректный входной файл");
        }
        return userDataList;
    }

}
