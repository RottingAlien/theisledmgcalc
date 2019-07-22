package rottingalien.theisledmgcalc;

import rottingalien.theisledmgcalc.dinoinfo.Dinos;
import rottingalien.theisledmgcalc.dinoinfo.GrowthState;
import rottingalien.theisledmgcalc.dinoinfo.Property;

import java.util.HashMap;

public class Bootstrap {


    public void init() {

        for (Dinos dino : Dinos.values()) {
            dino.setGrowthStateMap(new HashMap<>());
            for (GrowthState growthState : GrowthState.values()) {
                growthState.setDinoPropertyMap(new HashMap<>());
                dino.getGrowthStateMap().put(growthState.getName(),growthState);
                GrowthState currentDinoState = dino.getGrowthStateMap().get(growthState.getName());
                for (Property property: Property.values()){
                    currentDinoState.getDinoPropertyMap().put(property.getName(),property);
                }
            }
        }


        populateCarnotaurus();


    }

    public void setValue(Dinos dino, GrowthState growthState, Property property, double value) {

        dino.getGrowthStateMap().get(growthState.getName()).getDinoPropertyMap().get(property.getName()).setValue(value);

    }

    public void populateCarnotaurus(){

        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.BLEEDSTANDRESIST, 30);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.BLEEDSITRESIST, 10);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.BLEEDWALKRESIST, 50);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.BLEEDRUNRESIST, 100);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.WEIGHT, 150);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.HEALTH, 120);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.BITEFORCE, 50);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHJUVI, Property.BLEED, 15);

        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.BLEEDSTANDRESIST, 30);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.BLEEDSITRESIST, 10);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.BLEEDWALKRESIST, 50);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.BLEEDRUNRESIST, 100);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.WEIGHT, 850);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.HEALTH, 350);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.BITEFORCE, 75);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLJUVI, Property.BLEED, 15);

        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.BLEEDSTANDRESIST, 70);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.BLEEDSITRESIST, 20);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.BLEEDWALKRESIST, 50);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.BLEEDRUNRESIST, 60);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.WEIGHT, 880);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.HEALTH, 350);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.BITEFORCE, 75);
        setValue(Dinos.CARNOTAURUS, GrowthState.FRESHADULT, Property.BLEED, 15);

        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.BLEEDSTANDRESIST, 70);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.BLEEDSITRESIST, 20);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.BLEEDWALKRESIST, 50);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.BLEEDRUNRESIST, 60);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.WEIGHT, 2170);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.HEALTH, 2170);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.BITEFORCE, 200);
        setValue(Dinos.CARNOTAURUS, GrowthState.FULLADULT, Property.BLEED, 15);
    }

}
