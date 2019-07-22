package rottingalien.theisledmgcalc;

import rottingalien.theisledmgcalc.dinoinfo.Dinos;
import rottingalien.theisledmgcalc.dinoinfo.GrowthState;
import rottingalien.theisledmgcalc.dinoinfo.Property;

import java.util.HashMap;

public class Bootstrap {


    public void init() {

        for (Dinos dino : Dinos.values()) {
            for (GrowthState growthState : GrowthState.values()) {
                dino.getGrowthStateMap().put(growthState.getName(), growthState);
                for (Property property : Property.values()) {
                    dino.getGrowthStateMap().get(growthState.getName()).getDinoPropertyMap().put(property.getName(), property);
                }
            }
        }


        populateCarnotaurus();


    }


    public void populateCarnotaurus() {

        Dinos.CARNOTAURUS.getGrowthStateMap().get(GrowthState.FRESHJUVI.getName()).getDinoPropertyMap().get(Property.BLEEDSTANDRESIST.getName()).setValue(30);

        Dinos.CARNOTAURUS.getGrowthStateMap().get(GrowthState.FULLADULT.getName()).getDinoPropertyMap().get(Property.BLEEDSTANDRESIST.getName()).setValue(70);

    }

}
