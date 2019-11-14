package rottingalien.theisledmgcalc.dinos.herbivores.puertasaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Puertasaurus extends Dino {

    public Puertasaurus() {
        wire();
    }

    public void wire() {

        setName("Puertasaurus");
        setCarnivore(false);
        setTier(6);
        setGrowthDurationJuvi(0);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(0);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- ADULT

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                12.3,
                0,
                0,
                0,
                0,
                0,
                49895,
                49895,
                5000,
                0,
                0,
                0,
                0,
                "puerta");

        getGrowthStates().put("Full Adult", fullAdult);

    }


}
