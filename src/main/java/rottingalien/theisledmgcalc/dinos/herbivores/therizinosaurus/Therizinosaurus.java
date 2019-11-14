package rottingalien.theisledmgcalc.dinos.herbivores.therizinosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Therizinosaurus extends Dino {

    public Therizinosaurus() {
        wire();
    }

    public void wire() {

        setName("Therizinosaurus");
        setCarnivore(false);
        setTier(4.5);
        setGrowthDurationJuvi(180);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(120);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                38.2,
                0,
                0,
                0,
                0,
                0,
                22,
                22,
                2*2,
                0,
                2*8,
                0,
                0,
                "theri");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                38.2,
                0,
                0,
                0,
                0,
                0,
                2540,
                2540,
                245*2,
                0,
                245*8,
                0,
                0,
                "theri");


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                38.2,
                0,
                0,
                0,
                0,
                0,
                2540,
                2540,
                245*2,
                0,
                245*8,
                0,
                0,
                "theri");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                38.2,
                0,
                0,
                0,
                0,
                0,
                4536,
                4536,
                350*2,
                0,
                350*8,
                0,
                0,
                "theri");


        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }


}
