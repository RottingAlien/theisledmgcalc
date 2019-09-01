package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Maiasaura extends Dino {

    public Maiasaura() {
        wire();
    }

    public void wire(){

        setName("Maiasaura");
        setCarnivore(false);
        setTier(3);
        setGrowthDurationJuvi(50);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                44.6,
                0,
                50,
                25,
                100,
                100,
                300,
                50,
                30,
                0,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                44.6,
                0,
                50,
                25,
                100,
                100,
                950,
                748,
                60,
                0,
                0,
                0,
                0);




        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                44.6,
                0,
                25,
                20,
                100,
                200,
                960,
                1000,
                100,
                0,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                44.6,
                0,
                25,
                20,
                100,
                200,
                2868,
                2868,
                175,
                0,
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
