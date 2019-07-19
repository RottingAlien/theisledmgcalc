package rottingalien.theisledmgcalc;

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
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, GrowthState> getGrowthStateMap() {
        return growthStateMap;
    }
}
