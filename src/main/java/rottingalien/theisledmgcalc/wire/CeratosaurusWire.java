package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class CeratosaurusWire {

    private Dino ceratosaurus = new Dino("Ceratosaurus");

    public Dino wire(){

        //----- JUVENILE

        ceratosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                80,
                25,
                100,
                200,
                150,
                150,
                60,
                8));

        ceratosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                80,
                25,
                100,
                200,
                1900,
                1900,
                140,
                8));

        //----- ADULT

        ceratosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                80,
                25,
                100,
                200,
                1900,
                1900,
                225,
                8));

        ceratosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                80,
                25,
                100,
                200,
                2250,
                2250,
                350,
                8));

        return ceratosaurus;
    }


}
