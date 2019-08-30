package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class GallimimusWire {

    private Dino gallimimus = new Dino("Gallimimus");

    public Dino wire(){

        //----- JUVENILE

        gallimimus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                70,
                25,
                100,
                200,
                80,
                260,
                9,
                0));

        gallimimus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                70,
                25,
                100,
                200,
                700,
                148,
                18,
                0));

        gallimimus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        gallimimus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        gallimimus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                70,
                25,
                100,
                200,
                720,
                260,
                20,
                0));

        gallimimus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                70,
                25,
                100,
                200,
                1000,
                800,
                150,
                0));

        gallimimus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        gallimimus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        gallimimus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        gallimimus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        gallimimus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getWeight(),
                        gallimimus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getHealth(),
                        gallimimus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        gallimimus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(gallimimus.getGrowthStates().get("Fresh Adult").getBleed(),
                        gallimimus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return gallimimus;
    }


}
