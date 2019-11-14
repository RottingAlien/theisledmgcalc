package rottingalien.theisledmgcalc.dinos.carnivores.tyrannosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Tyrannosaurus extends Dino {

    public Tyrannosaurus(){
        wire();
    }

    public void wire(){

        setName("Tyrannosaurus");
        setCarnivore(true);
        setTier(5);
        setGrowthDurationJuvi(100);
        setGrowthDurationSub(180);
        setGrowthDurationAdult(100);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                36,
                0,
                70,
                25,
                100,
                100,
                200,
                200,
                50,
                2,
                0,
                0,
                0,
                "tyrJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                36,
                0,
                70,
                25,
                100,
                100,
                1400,
                2000,
                100,
                5,
                0,
                0,
                0,
                "tyrJ");


        //----- SUB-ADULT

        GrowthState freshSubAdult = new GrowthState(
                "Fresh Sub-Adult",
                33.7,
                44,
                40,
                10,
                50,
                70,
                1450,
                2000,
                100,
                5,
                0,
                0,
                0,
                "tyrS");

        GrowthState fullSubAdult = new GrowthState(
                "Full Sub-Adult",
                33.7,
                44,
                40,
                10,
                50,
                70,
                2875,
                4000,
                450,
                10,
                0,
                0,
                0,
                "tyrS");


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                33.2,
                43.1,
                30,
                10,
                50,
                70,
                3200,
                4000,
                450,
                10,
                0,
                0,
                0,
                "tyrA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                33.2,
                43.1,
                30,
                10,
                50,
                70,
                5800,
                6500,
                1200,
                10,
                0,
                0,
                0,
                "tyrA");

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
