package rottingalien.theisledmgcalc.dinos.carnivores.carnotaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Carnotaurus extends Dino{

    public Carnotaurus(){
        wire();
    }

    public void wire(){

        setName("Carnotaurus");
        setCarnivore(true);
        setTier(4);
        setGrowthDurationJuvi(40);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(70);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                36.7,
                0,
                30,
                10,
                50,
                100,
                150,
                120,
                50,
                15,
                0,
                0,
                0,
                "carnoJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                36.7,
                0,
                30,
                10,
                50,
                100,
                850,
                350,
                75,
                15,
                0,
                0,
                0,
                "carnoJ");

        
        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                52.2,
                0,
                70,
                20,
                50,
                60,
                880,
                350,
                75,
                15,
                0,
                0,
                0,
                "carnoA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                52.2,
                0,
                70,
                20,
                50,
                60,
                2170,
                2170,
                200,
                15,
                0,
                0,
                0,
                "carnoA");


        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }

}
