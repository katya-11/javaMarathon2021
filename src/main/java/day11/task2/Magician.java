package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double health = 100;
    private final double physDef = 0;
    private final double magicDef = 0.8;
    private final int physAtt = 5;
    private final int magicAtt = 20;

    public Magician() {
    }

    @Override
    public void magicalAttack(Hero hero) {
        double heroHealth = hero.getHealth() - (this.getMagicAtt() -
                this.getMagicAtt() * hero.getMagicDef());
        if (heroHealth < 0) {
            hero.setHealth(0);
        } else if (heroHealth > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(heroHealth);
    }

    @Override
    public void physicalAttack(Hero hero) {
        double heroHealth = hero.getHealth() - (this.getPhysAtt() -
                this.getPhysAtt() * hero.getPhysDef());
        if (heroHealth < 0) {
            hero.setHealth(0);
        } else if (heroHealth > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(heroHealth);
    }

    @Override
    public String toString() {
        return "Magician(health= " + this.getHealth() + ")";
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getPhysDef() {
        return physDef;
    }

    @Override
    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }
}
