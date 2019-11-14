package rottingalien.theisledmgcalc.dinos.herbivores.dryosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Dryosaurus extends Dino {

    public Dryosaurus() {
        wire();
    }

    public void wire(){

        setName("Dryosaurus");
        setCarnivore(false);
        setTier(2);
        setGrowthDurationJuvi(15);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(15);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                41.5,
                0,
                40,
                20,
                100,
                100,
                100,
                7,
                5,
                0,
                0,
                0,
                0,
                "dryoJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                41.5,
                0,
                40,
                20,
                100,
                100,
                400,
                50,
                10,
                0,
                0,
                0,
                0,
                "dryoJ");



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                41.5,
                0,
                50,
                20,
                100,
                200,
                400,
                175,
                10,
                0,
                0,
                0,
                0,
                "dryoA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                41.5,
                0,
                50,
                25,
                100,
                200,
                700,
                500,
                20,
                0,
                0,
                0,
                0,
                "dryoA");

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);
    }


}
