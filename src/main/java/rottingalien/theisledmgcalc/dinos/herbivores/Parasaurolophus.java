package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Parasaurolophus extends Dino {

    public Parasaurolophus() {
        wire();
    }

    public void wire(){

        setName("Parasaurolophus");
        setCarnivore(false);
        setTier(4);
        setGrowthDurationJuvi(60);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(120);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
                "Fresh Juvenile",
                24.4,
                0,
                50,
                25,
                100,
                100,
                350,
                50,
                40,
                0,
                525,
                0,
                0);

        GrowthState fullJuvi = new GrowthState(
                "Full Juvenile",
                24.4,
                0,
                100,
                100,
                1800,
                1750,
                80,
                1750,
                40,
                0,
                525,
                0,
                0);

        //----- ADULT

        GrowthState freshAdult = new GrowthState(
                "Fresh Adult",
                34.2,
                0,
                30,
                20,
                50,
                80,
                2000,
                2000,
                115,
                0,
                750,
                0,
                0);

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                34.2,
                0,
                30,
                20,
                50,
                80,
                3600,
                3600,
                250,
                0,
                750,
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
