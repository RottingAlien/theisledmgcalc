package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Dilophosaurus extends Dino {

    public Dilophosaurus(){
        wire();
    }

    public void wire(){

        setName("Dilophosaurus");
        setCarnivore(true);
        setTier(3);
        setGrowthDurationJuvi(50);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                38.9,
                0,
                50,
                25,
                80,
                100,
                150,
                250,
                27,
                20,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                38.9,
                0,
                50,
                25,
                80,
                100,
                900,
                650,
                70,
                20,
                0,
                0,
                0);



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                38.9,
                45.5,
                25,
                10,
                50,
                100,
                900,
                650,
                75,
                50,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                38.9,
                45.5,
                25,
                10,
                50,
                100,
                1200,
                1050,
                150,
                50,
                0,
                0,
                0);

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }

}
