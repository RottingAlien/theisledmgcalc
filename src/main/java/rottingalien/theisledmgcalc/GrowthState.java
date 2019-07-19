package rottingalien.theisledmgcalc;

import java.util.Map;
import java.util.Set;

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

  private Set<DinoProperty> dinoPropertyMap;

    GrowthState(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Set<DinoProperty> getDinoPropertyMap() {
        return dinoPropertyMap;
    }
}
