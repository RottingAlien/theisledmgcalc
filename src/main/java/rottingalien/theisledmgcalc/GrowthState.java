package rottingalien.theisledmgcalc;

public class GrowthState {

    private String name;

    private double bleedStandResist;
    private double bleedSitResist;
    private double bleedWalkResist;
    private double bleedRunResist;

    private double weight;
    private double health;
    private double biteForce;
    private double bleed;

    private double special;
    private double specialBleed;

    private boolean hasSpecial;

    public GrowthState(String name, double bleedStandResist, double bleedSitResist, double bleedWalkResist, double bleedRunResist, double weight, double health, double biteForce, double bleed) {
        this.name = name;
        this.bleedStandResist = bleedStandResist;
        this.bleedSitResist = bleedSitResist;
        this.bleedWalkResist = bleedWalkResist;
        this.bleedRunResist = bleedRunResist;
        this.weight = weight;
        this.health = health;
        this.biteForce = biteForce;
        this.bleed = bleed;
    }

    public GrowthState(String name, double bleedStandResist, double bleedSitResist, double bleedWalkResist, double bleedRunResist, double weight, double health, double biteForce, double bleed, double special, double specialBleed) {
        this.name = name;
        this.bleedStandResist = bleedStandResist;
        this.bleedSitResist = bleedSitResist;
        this.bleedWalkResist = bleedWalkResist;
        this.bleedRunResist = bleedRunResist;
        this.weight = weight;
        this.health = health;
        this.biteForce = biteForce;
        this.bleed = bleed;
        this.special = special;
        this.specialBleed = specialBleed;
    }

    public String getName() {
        return name;
    }

    public double getBleedStandResist() {
        return bleedStandResist;
    }

    public double getBleedSitResist() {
        return bleedSitResist;
    }

    public double getBleedWalkResist() {
        return bleedWalkResist;
    }

    public double getBleedRunResist() {
        return bleedRunResist;
    }

    public double getWeight() {
        return weight;
    }

    public double getHealth() {
        return health;
    }

    public double getBiteForce() {
        return biteForce;
    }

    public double getBleed() {
        return bleed;
    }

    public double getSpecial() {
        return special;
    }

    public double getSpecialBleed() {
        return specialBleed;
    }

    public boolean hasSpecial() {
        return hasSpecial;
    }

    public void setHasSpecial(boolean hasSpecial) {
        this.hasSpecial = hasSpecial;
    }
}
