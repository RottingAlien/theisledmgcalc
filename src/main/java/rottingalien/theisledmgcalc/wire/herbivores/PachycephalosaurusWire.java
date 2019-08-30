package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class PachycephalosaurusWire {

    private Dino pachycephalosaurus = new Dino("Pachycephalosaurus");

    public Dino wire(){

        pachycephalosaurus.setCarnivore(false);
        pachycephalosaurus.setTier(3);
        pachycephalosaurus.setGrowthDurationJuvi(70);
        pachycephalosaurus.setGrowthDurationSub(0);
        pachycephalosaurus.setGrowthDurationAdult(60);
        pachycephalosaurus.setGrowthDurationTotal(pachycephalosaurus.getGrowthDurationJuvi() + pachycephalosaurus.getGrowthDurationSub() + pachycephalosaurus.getGrowthDurationAdult());

        //----- JUVENILE

        pachycephalosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                40,
                0,
                50,
                25,
                100,
                200,
                350,
                175,
                40,
                0));

        pachycephalosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                40,
                0,
                50,
                25,
                100,
                200,
                750,
                450,
                120,
                0));

        pachycephalosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        pachycephalosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        pachycephalosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                40.1,
                0,
                30,
                25,
                100,
                200,
                980,
                1040,
                110,
                0));

        pachycephalosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                40.1,
                0,
                30,
                25,
                100,
                200,
                1300,
                1300,
                350,
                0));

        pachycephalosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getSpeed(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getAmbush(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(pachycephalosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        pachycephalosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));
        
        return pachycephalosaurus;
    }


}
