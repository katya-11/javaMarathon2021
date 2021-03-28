package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player ronaldo = new Player(random.nextInt(10) + 90);
        Player terry = new Player(random.nextInt(10) + 90);
        Player haverts = new Player(random.nextInt(10) + 90);
        Player werner = new Player(random.nextInt(10) + 90);
        Player pulisic = new Player(random.nextInt(10) + 90);
        Player lampard = new Player(random.nextInt(10) + 90);
        Player cole = new Player(random.nextInt(10) + 90);
        Player drogba= new Player(random.nextInt(10) + 90);

        //Инфо до начала игры
        System.out.print("В начале игры на поле " + Player.getCountPlayers() + " игроков. ");
        Player.info();

        for(int i = ronaldo.getStamina(); i > 0; i--){
            ronaldo.run();
        }

        //Игроки из цикла for должны уйти
        System.out.print("Уставшие игроки ушли. ");
        Player.info();
    }
}
