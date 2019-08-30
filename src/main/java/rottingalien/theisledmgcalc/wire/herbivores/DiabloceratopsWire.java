package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class DiabloceratopsWire {

    private Dino diabloceratops = new Dino("Diabloceratops");

    public Dino wire(){

        diabloceratops.setCarnivore(false);
        diabloceratops.setTier(4);
        diabloceratops.setGrowthDurationJuvi(80);
        diabloceratops.setGrowthDurationSub(0);
        diabloceratops.setGrowthDurationAdult(100);
        diabloceratops.setGrowthDurationTotal(diabloceratops.getGrowthDurationJuvi() + diabloceratops.getGrowthDurationSub() + diabloceratops.getGrowthDurationAdult());

        //----- JUVENILE

        diabloceratops.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                30.2,
                0,
                30,
                25,
                100,
                100,
                400,
                350,
                60,
                25));

        diabloceratops.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                30.2,
                0,
                30,
                25,
                100,
                100,
                1850,
                950,
                115,
                25));

        diabloceratops.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        diabloceratops.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        diabloceratops.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                31.6,
                0,
                30,
                25,
                100,
                200,
                1650,
                1700,
                175,
                25));

        diabloceratops.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                31.6,
                0,
                30,
                25,
                100,
                200,
                3250,
                3250,
                350,
                25));

        diabloceratops.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getSpeed(),
                        diabloceratops.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getAmbush(),
                        diabloceratops.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        diabloceratops.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        diabloceratops.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        diabloceratops.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        diabloceratops.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getWeight(),
                        diabloceratops.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getHealth(),
                        diabloceratops.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        diabloceratops.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(diabloceratops.getGrowthStates().get("Fresh Adult").getBleed(),
                        diabloceratops.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return diabloceratops;
    }


}
