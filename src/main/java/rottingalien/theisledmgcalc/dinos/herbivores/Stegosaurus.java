package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Stegosaurus extends Dino {

    public Stegosaurus() {
        wire();
    }

    public void wire() {

        setName("Stegosaurus");
        setCarnivore(false);
        setTier(4.5);
        setGrowthDurationJuvi(120);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(120);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                26.3,
                0,
                0,
                0,
                0,
                0,
                17,
                17,
                4,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                26.3,
                0,
                0,
                0,
                0,
                0,
                1137,
                1137,
                100,
                0,
                0,
                0,
                0);


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                26.3,
                0,
                0,
                0,
                0,
                0,
                1137,
                1137,
                100,
                15,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                26.3,
                0,
                0,
                0,
                0,
                0,
                4883,
                4883,
                1200,
                30,
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
