package rottingalien.theisledmgcalc.dinos.herbivores.camarasaurus;

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

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                20.7,
                0,
                40,
                25,
                40,
                100,
                12000,
                12000,
                650,
                0,
                4420,
                0,
                130,
                "cama");

        getGrowthStates().put("Full Adult", fullAdult);

    }
}
