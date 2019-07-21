package rottingalien.theisledmgcalc;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDino {

    private String name;
    private Map<String, GrowthState> growthStateMap = new HashMap<>();


    public String getName() {
        return name;
    }

    public Map<String, GrowthState> getGrowthStateMap() {
        return growthStateMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrowthStateMap(Map<String, GrowthState> growthStateMap) {
        this.growthStateMap = growthStateMap;
    }

}
