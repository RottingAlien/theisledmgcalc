package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Herrerasaurus extends Dino {

    public Herrerasaurus() {
        wire();
    }

    public void wire(){

        setName("Herrerasaurus");
        setCarnivore(true);
        setTier(2);
        setGrowthDurationJuvi(20);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                55.8,
                61.3,
                0,
                0,
                0,
                0,
                50,
                50,
                1,
                10,
                0,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                55.8,
                61.3,
                0,
                0,
                0,
                0,
                100,
                100,
                25,
                10,
                0,
                0,
                0);


        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                55.8,
                61.3,
                0,
                0,
                0,
                0,
                500,
                500,
                50,
                10,
                0,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                55.8,
                61.3,
                0,
                0,
                0,
                0,
                500,
                500,
                50,
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
