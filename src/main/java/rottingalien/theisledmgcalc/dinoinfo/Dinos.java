package rottingalien.theisledmgcalc.dinoinfo;

import java.util.HashMap;
import java.util.Map;

public enum Dinos {

    //Carnies

    CARNOTAURUS("Carnotaurus"),
    DILOPHOSAURUS("Dilophosaurus"),
    UTAHRAPTOR("Utahraptor"),
    ALLOSAURUS("Allosaurus"),
    CERATOSAURUS("Ceratosaurus"),
    SUCHOMINUS("Suchominus"),
    GIGANOTOSAURUS("Giganotosaurus"),
    TYRANNOSAURUS("Tyrannosaurus"),

    //Veggies

    DRYOSAURUS("Dryosaurus"),
    GALLIMINUS("Galliminus"),
    PACHYCEPHALOSAURUS("Pachycephalosaurus"),
    DIABLOCERATOPS("Diabloceratops"),
    MAIASAURA("Maiasaura"),
    PARASAUROLOPHUS("Parasaurolophus"),
    TRICERATOPS("Triceratops");

    private String name;
    private Map<String, GrowthState> growthStateMap;

    Dinos(String name) {
        this.name=name;
        growthStateMap = new HashMap<>();
    }

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
