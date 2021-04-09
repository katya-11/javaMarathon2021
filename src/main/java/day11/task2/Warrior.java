package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private double health = 100;
    private final double physDef = 0.8;
    private final double magicDef = 0;
    private final int physAtt = 30;

    public Warrior() {
    }

    @Override
    //расчет атаки с учетом защиты
    //атака = 10, здоровье = 10, защита на 20%
    // здоровье = здоровье - (атака - атака * защиту)
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

    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    @Override
    public String toString() {
        return "Warrior(health= " + this.getHealth() + ")";
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }
}
