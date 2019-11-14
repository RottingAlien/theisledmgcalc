package rottingalien.theisledmgcalc.dinos.herbivores.pachycephalosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Pachycephalosaurus extends Dino {

    public Pachycephalosaurus() {
        wire();
    }

    public void wire(){

        setName("Pachycephalosaurus");
        setCarnivore(false);
        setTier(3);
        setGrowthDurationJuvi(70);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                40,
                0,
                50,
                25,
                100,
                200,
                350,
                175,
                40,
                0,
                0,
                0,
                0,
                "pachyJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                40,
                0,
                50,
                25,
                100,
                200,
                750,
                450,
                120,
                0,
                0,
                0,
                0,
                "pachyJ");


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                40.1,
                0,
                30,
                25,
                100,
                200,
                980,
                1040,
                110,
                0,
                0,
                0,
                0,
                "pachyA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                40.1,
                0,
                30,
                25,
                100,
                200,
                1300,
                1300,
                350,
                0,
                0,
                0,
                0,
                "pachyA");

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);
    }


}
