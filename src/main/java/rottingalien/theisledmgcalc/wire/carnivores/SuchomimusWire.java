package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class SuchomimusWire {

    private Dino suchomimus = new Dino("Suchomimus");

    public Dino wire(){

        suchomimus.setCarnivore(true);
        suchomimus.setTier(4);
        suchomimus.setGrowthDurationJuvi(85);
        suchomimus.setGrowthDurationSub(0);
        suchomimus.setGrowthDurationAdult(150);
        suchomimus.setGrowthDurationTotal(suchomimus.getGrowthDurationJuvi() + suchomimus.getGrowthDurationSub() + suchomimus.getGrowthDurationAdult());

        //----- JUVENILE

        suchomimus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                30.9,
                39.3,
                60,
                25,
                80,
                100,
                450,
                350,
                25,
                5));

        suchomimus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                30.9,
                39.3,
                60,
                25,
                80,
                100,
                2000,
                850,
                145,
                5));

        suchomimus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        suchomimus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        suchomimus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                30.9,
                39.3,
                25,
                20,
                80,
                100,
                2000,
                1450,
                150,
                10));

        suchomimus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                30.9,
                39.3,
                25,
                20,
                80,
                100,
                3600,
                3600,
                350,
                10));

        suchomimus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getSpeed(),
                        suchomimus.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getAmbush(),
                        suchomimus.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        suchomimus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        suchomimus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        suchomimus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        suchomimus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getWeight(),
                        suchomimus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getHealth(),
                        suchomimus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        suchomimus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(suchomimus.getGrowthStates().get("Fresh Adult").getBleed(),
                        suchomimus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return suchomimus;
    }


}
