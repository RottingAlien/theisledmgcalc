package rottingalien.theisledmgcalc;

import rottingalien.utils.Maths.FindMidValues;

import java.util.*;

public abstract class Dino {

    private String name;

    private boolean isCarnivore;
    private double growthDurationJuvi;
    private double growthDurationSub;
    private double growthDurationAdult;
    private double growthDurationTotal;

    private double tier;

    private Map<String, GrowthState> growthStates;


    public Dino() {
        growthStates = new LinkedHashMap<>();
    }

    public GrowthState getMidGrowth(String name, GrowthState fresh, GrowthState full) {
        return new GrowthState(
                name,
                FindMidValues.findMidValue(fresh.getSpeed(), full.getSpeed(), 50),
                FindMidValues.findMidValue(fresh.getAmbush(), full.getAmbush(), 50),
                FindMidValues.findMidValue(fresh.getBleedStandResist(), full.getBleedStandResist(), 50),
                FindMidValues.findMidValue(fresh.getBleedSitResist(), full.getBleedSitResist(), 50),
                FindMidValues.findMidValue(fresh.getBleedWalkResist(), full.getBleedWalkResist(), 50),
                FindMidValues.findMidValue(fresh.getBleedRunResist(), full.getBleedRunResist(), 50),
                FindMidValues.findMidValue(fresh.getWeight(), full.getWeight(), 50),
                FindMidValues.findMidValue(fresh.getHealth(), full.getHealth(), 50),
                FindMidValues.findMidValue(fresh.getBiteForce(), full.getBiteForce(), 50),
                FindMidValues.findMidValue(fresh.getBleed(), full.getBleed(), 50),
                FindMidValues.findMidValue(fresh.getSpecial(), full.getSpecial(), 50),
                FindMidValues.findMidValue(fresh.getSpecialBleed(), full.getSpecialBleed(), 50),
                FindMidValues.findMidValue(fresh.getTrample(), full.getTrample(), 50));
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, GrowthState> getGrowthStates() {
        return growthStates;
    }

    public String[] getGrowthStatesArray() {
        String[] growArray = new String[getGrowthStates().values().size()];
        int index = 0;
        for (GrowthState grow : getGrowthStates().values()) {
            growArray[index] = grow.getName();
            index += 1;
        }

        return growArray;
    }

    public String getName() {
        return name;
    }

    public double getGrowthDurationTotal() {
        return growthDurationTotal;
    }

    public void setGrowthDurationTotal(double growthDurationTotal) {
        this.growthDurationTotal = growthDurationTotal;
    }

    public double getGrowthDurationJuvi() {
        return growthDurationJuvi;
    }

    public void setGrowthDurationJuvi(double growthDurationJuvi) {
        this.growthDurationJuvi = growthDurationJuvi;
    }

    public double getGrowthDurationSub() {
        return growthDurationSub;
    }

    public void setGrowthDurationSub(double growthDurationSub) {
        this.growthDurationSub = growthDurationSub;
    }

    public double getGrowthDurationAdult() {
        return growthDurationAdult;
    }

    public void setGrowthDurationAdult(double growthDurationAdult) {
        this.growthDurationAdult = growthDurationAdult;
    }

    public boolean hasJuviGrowth() {
        return growthDurationJuvi != 0;
    }

    public boolean hasSubGrowth() {
        return growthDurationSub != 0;
    }

    public double getTier() {
        return tier;
    }

    public void setTier(double tier) {
        this.tier = tier;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean isCarnivore) {
        this.isCarnivore = isCarnivore;
    }

}
