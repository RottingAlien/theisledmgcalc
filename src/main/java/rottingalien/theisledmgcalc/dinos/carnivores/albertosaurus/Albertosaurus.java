package rottingalien.theisledmgcalc.dinos.carnivores.albertosaurus;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class Albertosaurus extends Dino {

    public Albertosaurus() {
        wire();
    }

    public void wire() {

        setName("Albertosaurus");
        setCarnivore(true);
        setTier(4);
        setGrowthDurationJuvi(0);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(180);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- ADULT

        GrowthState fullAdult = new GrowthState(
                "Full Adult",
                33.8,
                42.1,
                0,
                0,
                0,
                0,
                3000,
                3000,
                424,
                0,
                0,
                0,
                0,
                "alberto");

        getGrowthStates().put("Full Adult", fullAdult);

    }


}
