package day7;

public class Player {
    private int stamina;

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public static int countPlayers;


    public Player(int stamina) {
        if(countPlayers < 6) {
            this.stamina = stamina;
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            return;}
        stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }

    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 5:
                    System.out.println("Команды неполные. " +
                            "На поле еще есть " + (6 - countPlayers) + " свободное место");
                    break;
                case 4: case 3: case 2:
                    System.out.println("Команды неполные. " +
                            "На поле еще есть " + (6 - countPlayers) + " свободных места");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободых мест");
                    break;
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
