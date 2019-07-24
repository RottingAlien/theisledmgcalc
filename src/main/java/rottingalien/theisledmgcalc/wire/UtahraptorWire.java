package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;

public class UtahraptorWire {

    private Dino utahraptor = new Dino("Utahraptor");

    public Dino wire(){

        //----- JUVENILE

        utahraptor.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                50,
                25,
                80,
                100,
                60,
                20,
                10,
                5));

        utahraptor.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                50,
                25,
                80,
                100,
                600,
                100,
                40,
                10));


        //----- ADULT

        utahraptor.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                20,
                10,
                50,
                70,
                250,
                300,
                60,
                10));

        utahraptor.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                20,
                10,
                50,
                70,
                1000,
                1200,
                200,
                20));

        return utahraptor;
    }


}
