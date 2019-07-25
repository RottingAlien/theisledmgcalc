package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class DINOSAURWire {

    private Dino DINOSAUR = new Dino("DINOSAUR");

    public Dino wire(){

        //----- JUVENILE

        DINOSAUR.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));


        //----- SUB-ADULT

        DINOSAUR.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Full Sub-Adult", new GrowthState(
                "Full Sub-Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        //----- ADULT

        DINOSAUR.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        return DINOSAUR;
    }


}
