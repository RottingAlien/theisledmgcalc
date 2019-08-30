package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class TyrannosaurusWire {

    private Dino tyrannosaurus = new Dino("Tyrannosaurus");

    public Dino wire(){

        tyrannosaurus.setCarnivore(true);
        tyrannosaurus.setTier(5);
        tyrannosaurus.setGrowthDurationJuvi(100);
        tyrannosaurus.setGrowthDurationSub(180);
        tyrannosaurus.setGrowthDurationAdult(100);
        tyrannosaurus.setGrowthDurationTotal(tyrannosaurus.getGrowthDurationJuvi() + tyrannosaurus.getGrowthDurationSub() + tyrannosaurus.getGrowthDurationAdult());

        //----- JUVENILE

        tyrannosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                36,
                0,
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
                36,
                0,
                70,
                25,
                100,
                100,
                1400,
                2000,
                100,
                5));

        tyrannosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        tyrannosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- SUB-ADULT

        tyrannosaurus.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                33.7,
                44,
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
                33.7,
                44,
                40,
                10,
                50,
                70,
                2875,
                4000,
                450,
                10));

        tyrannosaurus.getGrowthStates().put("Mid Sub-Adult", new GrowthState(
                "Mid Sub-Adult",
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getSpeed(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getAmbush(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedStandResist(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedSitResist(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedWalkResist(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedRunResist(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getWeight(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getHealth(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getBiteForce(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleed(),
                        tyrannosaurus.getGrowthStates().get("Full Sub-Adult").getBleed(),
                        50)));

        //----- ADULT

        tyrannosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                33.2,
                43.1,
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
                33.2,
                43.1,
                30,
                10,
                50,
                70,
                5800,
                6500,
                1200,
                10));

        tyrannosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getSpeed(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getAmbush(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(tyrannosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        tyrannosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return tyrannosaurus;
    }


}
