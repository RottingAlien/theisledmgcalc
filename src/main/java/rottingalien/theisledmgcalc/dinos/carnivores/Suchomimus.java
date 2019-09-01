package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Suchomimus extends Dino {

    public Suchomimus() {
        wire();
    }

    public void wire(){

        setName("Suchomimus");
        setCarnivore(true);
        setTier(4);
        setGrowthDurationJuvi(85);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(150);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                30.9,
                39.3,
                60,
                25,
                80,
                100,
                450,
                350,
                25,
                5,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                30.9,
                39.3,
                60,
                25,
                80,
                100,
                2000,
                850,
                145,
                5,
                0,
                0,
                0);



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                30.9,
                39.3,
                25,
                20,
                80,
                100,
                2000,
                1450,
                150,
                10,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                30.9,
                39.3,
                25,
                20,
                80,
                100,
                3600,
                3600,
                350,
                10,
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
