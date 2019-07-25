package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class SuchomimusWire {

    private Dino suchomimus = new Dino("Suchomimus");

    public Dino wire(){

        //----- JUVENILE

        suchomimus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                60,
                25,
                80,
                100,
                450,
                350,
                25,
                5));

        suchomimus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                60,
                25,
                80,
                100,
                2000,
                850,
                145,
                5));


        //----- ADULT

        suchomimus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                25,
                20,
                80,
                100,
                2000,
                1450,
                150,
                10));

        suchomimus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                25,
                20,
                80,
                100,
                3600,
                3600,
                350,
                10));

        return suchomimus;
    }


}
