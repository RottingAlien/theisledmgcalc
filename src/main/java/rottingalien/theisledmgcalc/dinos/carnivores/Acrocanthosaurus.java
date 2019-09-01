package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Acrocanthosaurus extends Dino {

    public Acrocanthosaurus() {
        wire();
    }

    public void wire() {

        setName("Acrocanthosaurus");
        setCarnivore(true);
        setTier(4.5);
        setGrowthDurationJuvi(120);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(120);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                35.5,
                0,
                0,
                0,
                0,
                0,
                10,
                10,
                1,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                35.5,
                0,
                0,
                0,
                0,
                0,
                2382,
                2382,
                225,
                0,
                0,
                0,
                0);


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                42.6,
                52.2,
                0,
                0,
                0,
                0,
                2685,
                2685,
                225,
                8,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                42.6,
                52.2,
                0,
                0,
                0,
                0,
                4790,
                4790,
                250,
                20,
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
