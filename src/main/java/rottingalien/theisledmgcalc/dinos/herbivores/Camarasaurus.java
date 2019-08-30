package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Camarasaurus extends Dino {

    public Camarasaurus() {
        wire();
    }

    public void wire() {

        setName("Camarasaurus");
        setCarnivore(false);
        setTier(5.5);
        setGrowthDurationJuvi(0);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(0);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());


        //----- ADULT

        getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                20.7,
                0,
                40,
                25,
                40,
                100,
                12000,
                12000,
                750,
                0,
                5150,
                0));

    }
}
