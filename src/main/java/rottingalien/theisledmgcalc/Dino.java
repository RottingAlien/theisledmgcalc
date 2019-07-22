package rottingalien.theisledmgcalc;

import java.util.*;

public class Dino {

    private String name;

    public Dino(String name){
        this.name=name;
    }

    private Map<String,GrowthState> growthStates = new HashMap<>();

    public Map<String,GrowthState> getGrowthStates() {
        return growthStates;
    }

    public String getName() {
        return name;
    }
}
