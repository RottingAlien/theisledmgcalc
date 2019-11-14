package rottingalien.theisledmgcalc.dinos.carnivores.giganotosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Giganotosaurus extends Dino {

    public Giganotosaurus() {
        wire();
    }

    public void wire() {
        setName("Giganotosaurus");
        setCarnivore(true);
        setTier(5);
        setGrowthDurationJuvi(110);
        setGrowthDurationSub(220);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                28.8,
                0,
                70,
                25,
                70,
                100,
                500,
                250,
                50,
                2,
                0,
                0,
                0,
                "gigaJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                28.8,
                0,
                70,
                25,
                70,
                100,
                2100,
                2000,
                150,
                5,
                0,
                0,
                0,
                "gigaJ");



        //----- SUB-ADULT

        GrowthState freshSubAdult = new GrowthState(
                "Fresh Sub-Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                2200,
                2000,
                150,
                5,
                0,
                0,
                0,
                "gigaS");

        GrowthState fullSubAdult = new GrowthState(
                "Full Sub-Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                3200,
                4000,
                455,
                10,
                0,
                0,
                0,
                "gigaS");

        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                3550,
                4000,
                480,
                10,
                0,
                0,
                0,
                "gigaA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                6450,
                6000,
                700,
                50,
                0,
                0,
                0,
                "gigaA");

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
