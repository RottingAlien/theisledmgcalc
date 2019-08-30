package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

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

        dilophosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        dilophosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


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

        dilophosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(dilophosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        dilophosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return dilophosaurus;
    }

}
