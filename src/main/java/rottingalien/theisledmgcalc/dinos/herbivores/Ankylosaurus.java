package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Ankylosaurus extends Dino {

    public Ankylosaurus() {
        wire();
    }

    public void wire() {

        setName("Ankylosaurus");
        setCarnivore(false);
        setTier(4);
        setGrowthDurationJuvi(120);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(120);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                23.9,
                0,
                0,
                0,
                0,
                0,
                20,
                20,
                3,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                23.9,
                0,
                0,
                0,
                0,
                0,
                3048,
                3048,
                420,
                0,
                0,
                0,
                0);


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                19.3,
                0,
                0,
                0,
                0,
                0,
                3048,
                3048,
                570,
                0,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                19.3,
                0,
                0,
                0,
                0,
                0,
                5443,
                5443,
                1260,
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
