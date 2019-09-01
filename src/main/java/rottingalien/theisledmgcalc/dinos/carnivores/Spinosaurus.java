package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Spinosaurus extends Dino {

    public Spinosaurus() {
        wire();
    }

    public void wire(){

        setName("Spinosaurus");
        setCarnivore(true);
        setTier(5);
        setGrowthDurationJuvi(180);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(180);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                29.3,
                0,
                50,
                20,
                80,
                80,
                15,
                15,
                2,
                1,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                29.3,
                0,
                50,
                20,
                80,
                80,
                2328,
                2328,
                170,
                15,
                0,
                0,
                0);


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                34.4,
                41.3,
                50,
                20,
                80,
                80,
                2328,
                2328,
                170,
                15,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                34.4,
                41.3,
                50,
                20,
                80,
                80,
                9071,
                9071,
                250,
                18,
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
