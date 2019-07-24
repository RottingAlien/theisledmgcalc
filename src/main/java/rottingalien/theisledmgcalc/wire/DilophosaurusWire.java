package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class DilophosaurusWire {

    private Dino dilophosaurus = new Dino("Dilophosaurus");

    public Dino wire(){

        //----- JUVENILE

        dilophosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                50,
                25,
                80,
                100,
                150,
                250,
                27,
                20));

        dilophosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                50,
                25,
                80,
                100,
                900,
                650,
                70,
                20));


        //----- ADULT

        dilophosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                25,
                10,
                50,
                100,
                900,
                650,
                75,
                50));

        dilophosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                25,
                10,
                50,
                100,
                1200,
                1050,
                150,
                50));

        return dilophosaurus;
    }

}
