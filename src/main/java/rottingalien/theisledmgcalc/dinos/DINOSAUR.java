package rottingalien.theisledmgcalc.dinos;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class DINOSAUR extends Dino {

    public DINOSAUR() {
        wire();
    }

    public void wire() {

        setName("DINOSAUR");
        setCarnivore(true);
        setTier(0);
        setGrowthDurationJuvi(0);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(0);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0);


        //----- SUB-ADULT

        GrowthState freshSubAdult = new GrowthState(
                "Fresh Sub-Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0);

        GrowthState fullSubAdult = new GrowthState(
                "Full Sub-Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0);



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0);


        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Sub-Adult", freshSubAdult);
        getGrowthStates().put("Mid Sub-Adult", getMidGrowth("Mid Sub-Adult", freshSubAdult, fullSubAdult));
        getGrowthStates().put("Full Sub-Adult", fullSubAdult);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }


}
