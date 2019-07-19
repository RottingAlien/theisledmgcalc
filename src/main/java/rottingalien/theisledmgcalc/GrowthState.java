package rottingalien.theisledmgcalc;

import java.util.Map;

public enum GrowthState {

    FRESHJUVI("Fresh Juvenile"),
    MIDJUVI("Mid Juvenile"),
    FULLJUVI("Full Juvenile"),
    FRESHSUB("Fresh Sub-Adult"),
    MIDSUB("Mid Sub-Adult"),
    FULLSUB("Full Sub-Adult"),
    FRESHADULT("Fresh Adult"),
    MIDADULT("Mid Adult"),
    FULLADULT("Full Adult");


    private String name;

    private Map<String, DinoProperty> dinoPropertyMap;

    GrowthState(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Map<String, DinoProperty> getDinoPropertyMap() {
        return dinoPropertyMap;
    }
}
