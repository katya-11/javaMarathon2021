package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    final int magicAtt = 15;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public void healHimself() {
        double heroHealth = this.getHealth() + 50;
        setHealth(heroHealth);
    }

    @Override
    public void healTeammate(Hero hero) {
        double heroHealth = hero.getHealth() + 30;
        hero.setHealth(heroHealth);
    }

    @Override
    public void magicalAttack(Hero hero) {
        double heroHealth = hero.getHealth() - (magicAtt -
                magicAtt * hero.getMagicDef());
        hero.setHealth(heroHealth);
    }


    @Override
    public String toString() {
        return "Shaman(health= " + this.getHealth() + ")";
    }

}
