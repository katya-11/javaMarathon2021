package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double health = 100;
    private final double physDef = 0.2;
    private final double magicDef = 0.2;
    private final int physAtt = 10;
    private final int magicAtt = 15;

    public Shaman() {
    }

    @Override
    public void healHimself() {
        double heroHealth = this.getHealth() + 50;
        if (heroHealth < 0) {
            setHealth(0);
        } else if (heroHealth > 100) {
            setHealth(100);
        } else
            setHealth(heroHealth);
    }

    @Override
    public void healTeammate(Hero hero) {
        double heroHealth = hero.getHealth() + 30;
        if (heroHealth < 0) {
            hero.setHealth(0);
        } else if (heroHealth > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(heroHealth);
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
        return "Shaman(health= " + this.getHealth() + ")";
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
