package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private double health = 100;
    private final double physDef = 0.5;
    private final double magicDef = 0.2;
    private final int physAtt = 15;

    public Paladin() {
    }


    @Override
    public void healHimself() {
        double heroHealth = this.getHealth() + 25;
        if (heroHealth < 0) {
            setHealth(0);
        } else if (heroHealth > 100) {
            setHealth(100);
        } else
            setHealth(heroHealth);
    }

    @Override
    public void healTeammate(Hero hero) {
        double heroHealth = hero.getHealth() + 10;
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
        return "Paladin(health= " + this.getHealth() + ")";
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


    @Override
    public void setHealth(double health) {
        this.health = health;
    }
}
