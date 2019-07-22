package rottingalien.theisledmgcalc;

import rottingalien.theisledmgcalc.dinoinfo.Dinos;
import rottingalien.theisledmgcalc.dinoinfo.GrowthState;
import rottingalien.theisledmgcalc.dinoinfo.Property;

public class App {

    public void init(){
        System.out.println(showStat(Dinos.CARNOTAURUS,GrowthState.FULLADULT,Property.BLEEDRUNRESIST));
    }

    public double showStat(Dinos dino, GrowthState growthState, Property property){
        return dino.getGrowthStateMap().get(growthState.getName()).getDinoPropertyMap().get(property.getName()).getValue();
    }

}
