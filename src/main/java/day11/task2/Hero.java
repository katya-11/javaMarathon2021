package day11.task2;

public abstract class Hero {
    double health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        this.health = 100;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public double getHealth() {
        return health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setHealth(double health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else
            this.health = health;
    }

    public void physicalAttack(Hero hero) {
        double heroHealth = hero.getHealth() - (this.getPhysAtt() -
                this.getPhysAtt() * hero.getPhysDef());
        hero.setHealth(heroHealth);
    }

}
