package rottingalien.theisledmgcalc.dinos.herbivores.diabloceratops;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Diabloceratops extends Dino {

    public Diabloceratops() {
        wire();
    }

    public void wire(){

        setName("Diabloceratops");
        setCarnivore(false);
        setTier(4);
        setGrowthDurationJuvi(80);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(100);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                30.2,
                0,
                30,
                25,
                100,
                100,
                400,
                350,
                60,
                25,
                0,
                0,
                0,
                "diabloJ");

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                30.2,
                0,
                30,
                25,
                100,
                100,
                1850,
                950,
                115,
                25,
                0,
                0,
                0,
                "diabloJ");



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                31.6,
                0,
                30,
                25,
                100,
                200,
                1650,
                1700,
                175,
                25,
                0,
                0,
                0,
                "diabloA");

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                31.6,
                0,
                30,
                25,
                100,
                200,
                3250,
                3250,
                350,
                25,
                0,
                0,
                0,
                "diabloA");

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);
    }


}
