package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class UtahraptorWire {

    private Dino utahraptor = new Dino("Utahraptor");

    public Dino wire(){

        utahraptor.setCarnivore(true);
        utahraptor.setTier(3);
        utahraptor.setGrowthDurationJuvi(50);
        utahraptor.setGrowthDurationSub(0);
        utahraptor.setGrowthDurationAdult(60);
        utahraptor.setGrowthDurationTotal(utahraptor.getGrowthDurationJuvi() + utahraptor.getGrowthDurationSub() + utahraptor.getGrowthDurationAdult());

        //----- JUVENILE

        utahraptor.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                21.6,
                0,
                50,
                25,
                80,
                100,
                60,
                20,
                10,
                5));

        utahraptor.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                21.6,
                0,
                50,
                25,
                80,
                100,
                600,
                100,
                40,
                10));

        utahraptor.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        utahraptor.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        utahraptor.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                43.2,
                56,
                20,
                10,
                50,
                70,
                250,
                300,
                60,
                10));

        utahraptor.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                43.2,
                56,
                20,
                10,
                50,
                70,
                1000,
                1200,
                200,
                20));

        utahraptor.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getSpeed(),
                        utahraptor.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getAmbush(),
                        utahraptor.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        utahraptor.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        utahraptor.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        utahraptor.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        utahraptor.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getWeight(),
                        utahraptor.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getHealth(),
                        utahraptor.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        utahraptor.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(utahraptor.getGrowthStates().get("Fresh Adult").getBleed(),
                        utahraptor.getGrowthStates().get("Full Adult").getBleed(),
                        50)));

        return utahraptor;
    }


}
