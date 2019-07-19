package rottingalien.theisle.dmgcalc;

public enum Growth {

    private String state;
    private int bleedStandResist;
    private int bleedSitResist;
    private int bleedWalkResist;
    private int bleedRunResist;
    private int weight;
    private int health;
    private int biteForce;
    private int bleedDamage;


    FRESHJUVI(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
    int weight, int health, int biteForce, int bleedDamage),

    MIDJUVI(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
            int weight, int health, int biteForce, int bleedDamage),

    FULLJUVI(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
             int weight, int health, int biteForce, int bleedDamage),

    FRESHSUB(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
             int weight, int health, int biteForce, int bleedDamage),

    MIDSUB(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
           int weight, int health, int biteForce, int bleedDamage),

    FULLSUB(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
            int weight, int health, int biteForce, int bleedDamage),

    FRESHADULT(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
               int weight, int health, int biteForce, int bleedDamage),

    MIDADULT(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
             int weight, int health, int biteForce, int bleedDamage),

    FULLADULT(String state, int bleedStandResist, int bleedSitResist, int bleedWalkResist, int bleedRunResist,
              int weight, int health, int biteForce, int bleedDamage);


    Growth(){

        this.state =

    }
}
