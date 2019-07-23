package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class CarnotaurusWire {

    private Dino carnotaurus = new Dino("Carnotaurus");

    public Dino wireCarnotaurus(){

        //----- JUVENILE

        carnotaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        carnotaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
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

        carnotaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        carnotaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        return carnotaurus;
    }

}
