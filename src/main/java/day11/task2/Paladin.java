package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    final int healHimself = 25;
    final int healTeammate = 10;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }


    @Override
    public void healHimself() {
        double heroHealth = this.getHealth() + healHimself;
        setHealth(heroHealth);
    }

    @Override
    public void healTeammate(Hero hero) {
        double heroHealth = hero.getHealth() + healTeammate;
        hero.setHealth(heroHealth);
    }

    @Override
    public String toString() {
        return "Paladin(health= " + this.getHealth() + ")";
    }
}

