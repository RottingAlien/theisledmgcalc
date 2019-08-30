package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

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

        ceratosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        ceratosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));

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

        ceratosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(ceratosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        ceratosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return ceratosaurus;
    }


}
