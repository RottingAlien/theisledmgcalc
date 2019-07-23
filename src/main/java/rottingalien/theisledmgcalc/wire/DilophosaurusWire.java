package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class DilophosaurusWire {

    private Dino dilophosaurus = new Dino("Dilophosaurus");

    public Dino wiredilophosaurus(){

        //----- JUVENILE

        dilophosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        dilophosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));


        //----- ADULT

        dilophosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        dilophosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        return dilophosaurus;
    }

}
