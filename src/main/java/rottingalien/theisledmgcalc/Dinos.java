package rottingalien.theisledmgcalc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum Dinos {

    //Carnies

    CARNOTAURUS,
    DILOPHOSAURUS,
    UTAHRAPTOR,
    ALLOSAURUS,
    CERATOSAURUS,
    SUCHOMINUS,
    GIGANOTOSAURUS,
    TYRANNOSAURUS,

    //Veggies

    DRYOSAURUS,
    GALLIMINUS,
    PACHYCEPHALOSAURUS,
    DIABLOCERATOPS,
    MAIASAURA,
    PARASAUROLOPHUS,
    TRICERATOPS;


    private String name;


    private Map<String, GrowthState> growthStateMap = new HashMap<>();


    public String getName() {
        return name;
    }

    public void addGrowth(String growthName, GrowthState growthState){
        growthStateMap.put(growthName,growthState);
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
