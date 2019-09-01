package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Shantungosaurus extends Dino {

    public Shantungosaurus() {
        wire();
    }

    public void wire() {

        setName("Shantungosaurus");
        setCarnivore(false);
        setTier(5.5);
        setGrowthDurationJuvi(120);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(240);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                36.1,
                0,
                40,
                25,
                100,
                200,
                45,
                45,
                1,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                36.1,
                0,
                40,
                25,
                100,
                200,
                3892,
                3891,
                82,
                0,
                0,
                0,
                0);




        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                32.5,
                0,
                40,
                25,
                100,
                200,
                3891,
                3891,
                85,
                0,
                1100,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                32.5,
                0,
                40,
                25,
                100,
                200,
                11793,
                11793,
                250,
                0,
                1100,
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
