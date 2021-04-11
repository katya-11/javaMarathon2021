package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());

        paladin.physicalAttack(magician);
        System.out.println(magician.toString());

        shaman.healTeammate(magician);
        System.out.println(magician.toString());

        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());

        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());

        paladin.healHimself();
        System.out.println(paladin.toString());

        System.out.println();

        for(int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }

    }
}
