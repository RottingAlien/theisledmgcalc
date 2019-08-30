package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class CarnotaurusWire {

    private Dino carnotaurus = new Dino("Carnotaurus");

    public Dino wire(){

        carnotaurus.setCarnivore(true);
        carnotaurus.setTier(4);
        carnotaurus.setGrowthDurationJuvi(40);
        carnotaurus.setGrowthDurationSub(0);
        carnotaurus.setGrowthDurationAdult(70);
        carnotaurus.setGrowthDurationTotal(carnotaurus.getGrowthDurationJuvi() + carnotaurus.getGrowthDurationSub() + carnotaurus.getGrowthDurationAdult());

        //----- JUVENILE

        carnotaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                36.7,
                0,
                30,
                10,
                50,
                100,
                150,
                120,
                50,
                15));

        carnotaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                36.7,
                0,
                30,
                10,
                50,
                100,
                850,
                350,
                75,
                15));


        carnotaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        carnotaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));
        
        //----- ADULT

        carnotaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                52.2,
                0,
                70,
                20,
                50,
                60,
                880,
                350,
                75,
                15));

        carnotaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                52.2,
                0,
                70,
                20,
                50,
                60,
                2170,
                2170,
                200,
                15));

        carnotaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getSpeed(),
                        carnotaurus.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getAmbush(),
                        carnotaurus.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        carnotaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        carnotaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        carnotaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        carnotaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        carnotaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        carnotaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        carnotaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(carnotaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        carnotaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return carnotaurus;
    }

}
