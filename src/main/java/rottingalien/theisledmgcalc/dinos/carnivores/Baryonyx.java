package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Baryonyx extends Dino {

    public Baryonyx() {
        wire();
    }

    public void wire() {

        setName("Baryonyx");
        setCarnivore(true);
        setTier(3);
        setGrowthDurationJuvi(90);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(90);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                41.3,
                0,
                0,
                0,
                0,
                0,
                5,
                5,
                1,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                41.3,
                0,
                0,
                0,
                0,
                0,
                180,
                180,
                25,
                0,
                0,
                0,
                0);


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                41.3,
                49.6,
                0,
                0,
                0,
                0,
                190,
                609,
                25,
                9,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                41.3,
                49.6,
                0,
                0,
                0,
                0,
                1450,
                1450,
                150,
                15,
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
