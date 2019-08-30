package rottingalien.theisledmgcalc.wire;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class DINOSAURWire {

    private Dino DINOSAUR = new Dino("DINOSAUR");

    public Dino wire(){

        DINOSAUR.setCarnivore(true);
        DINOSAUR.setTier(0);
        DINOSAUR.setGrowthDurationJuvi(0);
        DINOSAUR.setGrowthDurationSub(0);
        DINOSAUR.setGrowthDurationAdult(0);
        DINOSAUR.setGrowthDurationTotal(DINOSAUR.getGrowthDurationJuvi() + DINOSAUR.getGrowthDurationSub() + DINOSAUR.getGrowthDurationAdult());

        //----- JUVENILE

        DINOSAUR.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        DINOSAUR.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));




        //----- SUB-ADULT

        DINOSAUR.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Full Sub-Adult", new GrowthState(
                "Full Sub-Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Mid Sub-Adult", new GrowthState(
                "Mid Sub-Adult",
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getSpeed(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getAmbush(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getBleedStandResist(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getBleedSitResist(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getBleedWalkResist(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getBleedRunResist(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getWeight(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getHealth(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getBiteForce(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Sub-Adult").getBleed(),
                        DINOSAUR.getGrowthStates().get("Full Sub-Adult").getBleed(),
                        50)));



        //----- ADULT

        DINOSAUR.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0));

        DINOSAUR.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getSpeed(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getAmbush(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getWeight(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getHealth(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(DINOSAUR.getGrowthStates().get("Fresh Adult").getBleed(),
                        DINOSAUR.getGrowthStates().get("Full Adult").getBleed(),
                        50)));




        return DINOSAUR;
    }


}
