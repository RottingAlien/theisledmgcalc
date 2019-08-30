package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class GiganotosaurusWire {

    private Dino giganotosaurus = new Dino("Giganotosaurus");

    public Dino wire(){

        giganotosaurus.setCarnivore(true);
        giganotosaurus.setTier(5);
        giganotosaurus.setGrowthDurationJuvi(110);
        giganotosaurus.setGrowthDurationSub(220);
        giganotosaurus.setGrowthDurationAdult(60);
        giganotosaurus.setGrowthDurationTotal(giganotosaurus.getGrowthDurationJuvi() + giganotosaurus.getGrowthDurationSub() + giganotosaurus.getGrowthDurationAdult());

        //----- JUVENILE

        giganotosaurus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                28.8,
                0,
                70,
                25,
                70,
                100,
                500,
                250,
                50,
                2));

        giganotosaurus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                28.8,
                0,
                70,
                25,
                70,
                100,
                2100,
                2000,
                150,
                5));

        giganotosaurus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        giganotosaurus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- SUB-ADULT

        giganotosaurus.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                2200,
                2000,
                150,
                5));

        giganotosaurus.getGrowthStates().put("Full Sub-Adult", new GrowthState(
                "Full Sub-Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                3200,
                4000,
                455,
                10));

        giganotosaurus.getGrowthStates().put("Mid Sub-Adult", new GrowthState(
                "Mid Sub-Adult",
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getSpeed(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getAmbush(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedStandResist(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedSitResist(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedWalkResist(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleedRunResist(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getWeight(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getHealth(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getBiteForce(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Sub-Adult").getBleed(),
                        giganotosaurus.getGrowthStates().get("Full Sub-Adult").getBleed(),
                        50)));

        //----- ADULT

        giganotosaurus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                3550,
                4000,
                480,
                10));

        giganotosaurus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                30.6,
                39.8,
                30,
                15,
                50,
                80,
                6450,
                6000,
                700,
                50));

        giganotosaurus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getSpeed(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getAmbush(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getWeight(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getHealth(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(giganotosaurus.getGrowthStates().get("Fresh Adult").getBleed(),
                        giganotosaurus.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return giganotosaurus;
    }


}
