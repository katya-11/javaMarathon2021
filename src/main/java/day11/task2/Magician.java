package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    final int magicAtt = 20;

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double heroHealth = hero.getHealth() - (magicAtt -
                magicAtt * hero.getMagicDef());
        hero.setHealth(heroHealth);
    }

    @Override
    public String toString() {
        return "Magician(health= " + this.getHealth() + ")";
    }


}
