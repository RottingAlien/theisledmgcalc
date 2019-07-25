package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class GiganotosaurusWire {

    private Dino giganotosaurus = new Dino("Giganotosaurus");

    public Dino wire(){

        //----- JUVENILE

        giganotosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                70,
                25,
                70,
                100,
                500,
                250,
                50,
                2));

        giganotosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                70,
                25,
                70,
                100,
                2100,
                2000,
                150,
                5));


        //----- SUB-ADULT

        giganotosaurus.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                30,
                15,
                50,
                80,
                2200,
                2000,
                150,
                5));

        giganotosaurus.getGrowthStates().put("Full Sub-Adult", new GrowthState(
                "Full Sub-Adult",
                30,
                15,
                50,
                80,
                3200,
                4000,
                455,
                10));

        //----- ADULT

        giganotosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                30,
                15,
                50,
                80,
                3550,
                4000,
                480,
                10));

        giganotosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                30,
                15,
                50,
                80,
                6450,
                6000,
                700,
                50));

        return giganotosaurus;
    }


}
