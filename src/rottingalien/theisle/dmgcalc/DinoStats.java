package rottingalien.theisle.dmgcalc;


public class DinoStats {

    private int bleedStandResist;
    private int bleedSitResist;
    private int bleedWalkResist;
    private int bleedRunResist;
    private int weight;
    private int health;
    private int biteForce;
    private int bleedDamage;


    public DinoStats(int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
                     int weight, int health, int biteForce, int bleedDamage) {

        this.bleedStandResist = bleedStandResist;
        this.bleedSitResist = bleedSitResist;
        this.bleedWalkResist = bleedWalkResist;
        this.bleedRunResist = bleedRunResist;
        this.weight = weight;
        this.health = health;
        this.biteForce = biteForce;
        this.bleedDamage = bleedDamage;

    }

    public int getBleedStandResist() {
        return bleedStandResist;
    }


    public int getBleedSitResist() {
        return bleedSitResist;
    }


    public int getBleedWalkResist() {
        return bleedWalkResist;
    }


    public int getBleedRunResist() {
        return bleedRunResist;
    }


    public int getWeight() {
        return weight;
    }


    public int getHealth() {
        return health;
    }


    public int getBiteForce() {
        return biteForce;
    }


    public int getBleedDamage() {
        return bleedDamage;
    }
}

/*
    public void setBleedStandResist(int bleedStandResist) {
        this.bleedStandResist = bleedStandResist;
    }

    public void setBleedSitResist(int bleedSitResist) {
        this.bleedSitResist = bleedSitResist;
    }

    public void setBleedWalkResist(int bleedWalkResist) {
        this.bleedWalkResist = bleedWalkResist;
    }

    public void setBleedRunResist(int bleedRunResist) {
        this.bleedRunResist = bleedRunResist;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setBiteForce(int biteForce) {
        this.biteForce = biteForce;
    }

    public void setBleedDamage(int bleedDamage) {
        this.bleedDamage = bleedDamage;
    }
 */