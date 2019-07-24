package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class CarnotaurusWire {

    private Dino carnotaurus = new Dino("Carnotaurus");

    public Dino wire(){

        //----- JUVENILE

        carnotaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                30,
                10,
                50,
                100,
                150,
                120,
                50,
                15));

        carnotaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                30,
                10,
                50,
                100,
                850,
                350,
                75,
                15));


        //----- ADULT

        carnotaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                70,
                20,
                50,
                60,
                880,
                350,
                75,
                15));

        carnotaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                70,
                20,
                50,
                60,
                2170,
                2170,
                200,
                15));

        return carnotaurus;
    }

}
