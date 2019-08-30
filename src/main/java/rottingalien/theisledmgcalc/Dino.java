package rottingalien.theisledmgcalc;

import java.util.*;

public class Dino {

    private String name;

    private boolean isCarnivore;

    private double growthDurationJuvi;
    private double growthDurationSub;
    private double growthDurationAdult;
    private double growthDurationTotal;

    private int tier;

    private Map<String,GrowthState> growthStates;


    public Dino(String name){
        this.name=name;
        growthStates = new HashMap<>();
    }

    public Map<String,GrowthState> getGrowthStates() {
        return growthStates;
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

    public boolean hasSubGrowth() {
        return growthDurationSub!=0;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public boolean isCarnivore(){
        return isCarnivore;
    }

    public void setCarnivore(boolean isCarnivore){
        this.isCarnivore = isCarnivore;
    }

}
