package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class AllosaurusWire {

    private Dino allosaurus = new Dino("Allosaurus");

    public Dino wire(){

        //----- JUVENILE

        allosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                30,
                10,
                50,
                70,
                300,
                200,
                50,
                25));

        allosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                30,
                10,
                50,
                70,
                1800,
                1100,
                100,
                25));


        //----- ADULT

        allosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                60,
                25,
                100,
                200,
                1850,
                1050,
                75,
                25));

        allosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                60,
                25,
                100,
                200,
                2800,
                2800,
                300,
                25));

        return allosaurus;
    }


}
