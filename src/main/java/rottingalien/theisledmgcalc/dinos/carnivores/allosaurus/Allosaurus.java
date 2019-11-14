package rottingalien.theisledmgcalc.dinos.carnivores.allosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Allosaurus extends Dino {

    public Allosaurus() {
        wire();
    }

    public void wire() {
        setName("Allosaurus");
        setCarnivore(true);
        setTier(4);
        setGrowthDurationJuvi(60);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(120);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                30.6,
                0,
                30,
                10,
                50,
                70,
                300,
                200,
                50,
                25,
                0,
                0,
                0,
                "alloJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                30.6,
                0,
                30,
                10,
                50,
                70,
                1800,
                1100,
                100,
                25,
                0,
                0,
                0,
                "alloJ");


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                34.2,
                44.5,
                60,
                25,
                100,
                200,
                1850,
                1050,
                75,
                25,
                0,
                0,
                0,
                "alloA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                34.2,
                44.5,
                60,
                25,
                100,
                200,
                2800,
                2800,
                300,
                25,
                0,
                0,
                0,
                "alloA");

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }


}
