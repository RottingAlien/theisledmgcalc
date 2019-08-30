package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

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

        allosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        allosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


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

        allosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        allosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        allosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        allosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        allosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        allosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        allosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        allosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(allosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        allosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return allosaurus;
    }


}
