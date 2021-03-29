package day8;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        Date dateStart = new Date();

        for(int i = 0; i <= 20000; i++) {
            stringBuilder.append(i + " ");
        }

        Date dateFinish = new Date();
        System.out.println(stringBuilder.toString());
        long result1 = dateFinish.getTime() - dateStart.getTime();

        Date dateStart2 = new Date();
        String s = "";
        for(int i = 0; i <= 20000; i++) {
            s = s + i + " ";
        }
        Date dateFinish2 = new Date();
        System.out.println(s);
        long result2 = dateFinish2.getTime() - dateStart2.getTime();

        System.out.println("StringBuilder затраченное время: " + result1 + " in ms");
        System.out.println("String затраченное время: " + result2 + " in ms");
    }
}
