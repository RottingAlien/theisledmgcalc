package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class TyrannosaurusWire {

    private Dino tyrannosaurus = new Dino("Tyrannosaurus");

    public Dino wire(){

        //----- JUVENILE

        tyrannosaurus.getGrowthStates().put("Juvenile", new GrowthState(
                "Juvenile",
                70,
                25,
                100,
                100,
                200,
                200,
                50,
                2));

        tyrannosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                70,
                25,
                100,
                100,
                200,
                200,
                50,
                2));

        tyrannosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                70,
                25,
                100,
                100,
                1400,
                2000,
                100,
                5));


        //----- SUB-ADULT

        tyrannosaurus.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                40,
                10,
                50,
                70,
                1450,
                2000,
                100,
                5));

        tyrannosaurus.getGrowthStates().put("Full Sub-Adult", new GrowthState(
                "Full Sub-Adult",
                40,
                10,
                50,
                70,
                2875,
                4000,
                450,
                10));

        //----- ADULT

        tyrannosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                30,
                10,
                50,
                70,
                3200,
                4000,
                450,
                10));

        tyrannosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                30,
                10,
                50,
                70,
                5800,
                6500,
                1200,
                10));

        return tyrannosaurus;
    }


}
