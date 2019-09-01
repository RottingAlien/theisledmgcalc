package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Triceratops extends Dino {

    public Triceratops() {
        wire();
    }

    public void wire(){

        setName("Triceratops");
        setCarnivore(false);
        setTier(5);
        setGrowthDurationJuvi(60);
        setGrowthDurationSub(200);
        setGrowthDurationAdult(100);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                13,
                0,
                50,
                25,
                100,
                100,
                420,
                400,
                60,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                13,
                0,
                50,
                25,
                100,
                100,
                1850,
                760,
                120,
                0,
                0,
                0,
                0);


        //----- SUB-ADULT

        GrowthState freshSubAdult = new GrowthState(
                "Fresh Sub-Adult",
                23.4,
                0,
                50,
                10,
                50,
                100,
                2000,
                1250,
                120,
                4,
                680,
                4,
                0);

        GrowthState fullSubAdult = new GrowthState(
                "Full Sub-Adult",
                23.4,
                0,
                50,
                10,
                50,
                100,
                4100,
                3570,
                200,
                8,
                1380,
                8,
                0);

        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                25.3,
                0,
                40,
                20,
                90,
                180,
                4150,
                4000,
                160,
                15,
                700,
                15,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                25.3,
                0,
                40,
                20,
                90,
                180,
                8300,
                8200,
                360,
                20,
                850,
                25,
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
