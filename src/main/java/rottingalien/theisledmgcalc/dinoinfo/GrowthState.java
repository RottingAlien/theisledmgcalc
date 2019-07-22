package rottingalien.theisledmgcalc.dinoinfo;

import java.util.HashMap;
import java.util.Map;

public enum GrowthState {

    FRESHJUVI("Fresh Juvenile"),
    FULLJUVI("Full Juvenile"),
    FRESHSUB("Fresh Sub-Adult"),
    FULLSUB("Full Sub-Adult"),
    FRESHADULT("Fresh Adult"),
    FULLADULT("Full Adult");

    private String name;

    private Map<String, Property> dinoPropertyMap;

    GrowthState(String name){
        this.name=name;
        dinoPropertyMap = new HashMap<>();

    }

    public String getName() {
        return name;
    }

    public Map<String, Property> getDinoPropertyMap() {
        return dinoPropertyMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDinoPropertyMap(Map<String, Property> dinoPropertyMap) {
        this.dinoPropertyMap = dinoPropertyMap;
    }
}
