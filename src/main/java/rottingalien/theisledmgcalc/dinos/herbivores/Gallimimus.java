package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Gallimimus extends Dino {

    public Gallimimus() {
        wire();
    }

    public void wire(){

        setName("Gallimimus");
        setCarnivore(false);
        setTier(3);
        setGrowthDurationJuvi(40);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(50);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                48.6,
                0,
                70,
                25,
                100,
                200,
                80,
                260,
                9,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                48.6,
                0,
                70,
                25,
                100,
                200,
                700,
                148,
                18,
                0,
                0,
                0,
                0);



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                48.6,
                0,
                70,
                25,
                100,
                200,
                720,
                260,
                20,
                0,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                48.6,
                0,
                70,
                25,
                100,
                200,
                1000,
                800,
                150,
                0,
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
