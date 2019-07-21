package rottingalien.theisledmgcalc;

import java.util.Map;

public abstract class AbstractGrowthState {

    private String name;

    private Map<String, Integer> dinoPropertyMap;


    public String getName() {
        return name;
    }

    public Map<String, Integer> getDinoPropertyMap() {
        return dinoPropertyMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDinoPropertyMap(Map<String, Integer> dinoPropertyMap) {
        this.dinoPropertyMap = dinoPropertyMap;
    }
}
