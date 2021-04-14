package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> userDataList = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                Person person = new Person();
                String line = scanner.nextLine();
                String[] userData = line.split(" ");
                person.setName(userData[0]);
                person.setAge(Integer.parseInt(userData[1]));
                if (person.getAge() < 0) {
                    userDataList = null;
                    throw new AgeException();
                } else {
                    userDataList.add(person);
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
