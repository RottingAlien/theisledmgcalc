package rottingalien.theisledmgcalc.dinos.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Tyrannosaurus extends Dino {

    public Tyrannosaurus(){
        wire();
    }

    public void wire(){

        setName("Tyrannosaurus");
        setCarnivore(true);
        setTier(5);
        setGrowthDurationJuvi(100);
        setGrowthDurationSub(180);
        setGrowthDurationAdult(100);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        getGrowthStates().put("Fresh Juvenile", new GrowthState(
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

        getGrowthStates().put("Full Juvenile", new GrowthState(
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

        getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getWeight(),
                        getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getHealth(),
                        getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Juvenile").getBleed(),
                        getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- SUB-ADULT

        getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
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

        getGrowthStates().put("Full Sub-Adult", new GrowthState(
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

        getGrowthStates().put("Mid Sub-Adult", new GrowthState(
                "Mid Sub-Adult",
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getSpeed(),
                        getGrowthStates().get("Full Sub-Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getAmbush(),
                        getGrowthStates().get("Full Sub-Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getBleedStandResist(),
                        getGrowthStates().get("Full Sub-Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getBleedSitResist(),
                        getGrowthStates().get("Full Sub-Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getBleedWalkResist(),
                        getGrowthStates().get("Full Sub-Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getBleedRunResist(),
                        getGrowthStates().get("Full Sub-Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getWeight(),
                        getGrowthStates().get("Full Sub-Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getHealth(),
                        getGrowthStates().get("Full Sub-Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getBiteForce(),
                        getGrowthStates().get("Full Sub-Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Sub-Adult").getBleed(),
                        getGrowthStates().get("Full Sub-Adult").getBleed(),
                        50)));

        //----- ADULT

        getGrowthStates().put("Fresh Adult", new GrowthState(
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

        getGrowthStates().put("Full Adult", new GrowthState(
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

        getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getSpeed(),
                        getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getAmbush(),
                        getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getWeight(),
                        getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getHealth(),
                        getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getBiteForce(),
                        getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(getGrowthStates().get("Fresh Adult").getBleed(),
                        getGrowthStates().get("Full Adult").getBleed(),
                        50)));
    }


}
