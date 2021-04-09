package day11.task2;

public abstract class Hero {
    private double health;
    private double physDef;
    private double magicDef;


    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
