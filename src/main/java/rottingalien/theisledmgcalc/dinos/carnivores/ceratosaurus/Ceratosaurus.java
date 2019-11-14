package rottingalien.theisledmgcalc.dinos.carnivores.ceratosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Ceratosaurus extends Dino {

    public Ceratosaurus(){
        wire();
    }

    public void wire() {
        setName("Ceratosaurus");
        setCarnivore(true);
        setTier(4);
        setGrowthDurationJuvi(50);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(100);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                36.6,
                0,
                80,
                25,
                100,
                200,
                150,
                150,
                60,
                8,
                0,
                0,
                0,
                "ceraJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                36.6,
                0,
                80,
                25,
                100,
                200,
                1900,
                1900,
                140,
                8,
                0,
                0,
                0,
                "ceraJ");

        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                36.6,
                40.3,
                80,
                25,
                100,
                200,
                1900,
                1900,
                225,
                8,
                0,
                0,
                0,
                "ceraA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                36.6,
                40.3,
                80,
                25,
                100,
                200,
                2250,
                2250,
                350,
                8,
                0,
                0,
                0,
                "ceraA");


        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }


}
