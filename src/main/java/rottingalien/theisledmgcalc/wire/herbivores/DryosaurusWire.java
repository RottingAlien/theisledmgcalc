package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class DryosaurusWire {

    private Dino dryosaurus = new Dino("Dryosaurus");

    public Dino wire(){

        //----- JUVENILE

        dryosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                40,
                20,
                100,
                100,
                100,
                7,
                5,
                0));

        dryosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                40,
                20,
                100,
                100,
                400,
                50,
                10,
                0));

        dryosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        dryosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        dryosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                50,
                20,
                100,
                200,
                400,
                175,
                10,
                0));

        dryosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                50,
                25,
                100,
                200,
                700,
                500,
                20,
                0));

        dryosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        dryosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        dryosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        dryosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        dryosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        dryosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        dryosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        dryosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(dryosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        dryosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return dryosaurus;
    }


}
