package rottingalien.theisledmgcalc.wire.carnivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class AustroraptorWire {

    private Dino austroraptor = new Dino("Austroraptor");

    public Dino wire() {

        austroraptor.setCarnivore(true);
        austroraptor.setTier(2);
        austroraptor.setGrowthDurationJuvi(60);
        austroraptor.setGrowthDurationSub(0);
        austroraptor.setGrowthDurationAdult(60);
        austroraptor.setGrowthDurationTotal(austroraptor.getGrowthDurationJuvi() + austroraptor.getGrowthDurationSub() + austroraptor.getGrowthDurationAdult());
        
        //----- JUVENILE

        austroraptor.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                39.6,
                0,
                0,
                0,
                0,
                0,
                1.25,
                1,
                25,
                0));

        austroraptor.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                39.6,
                0,
                0,
                0,
                0,
                0,
                25,
                20,
                25,
                0));

        austroraptor.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        austroraptor.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));


        //----- ADULT

        austroraptor.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                51.5,
                0,
                0,
                0,
                0,
                0,
                20,
                20,
                25,
                2));

        austroraptor.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                51.5,
                0,
                0,
                0,
                0,
                0,
                250,
                250,
                60,
                2));

        austroraptor.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getSpeed(),
                        austroraptor.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getAmbush(),
                        austroraptor.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        austroraptor.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        austroraptor.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        austroraptor.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        austroraptor.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getWeight(),
                        austroraptor.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getHealth(),
                        austroraptor.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        austroraptor.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(austroraptor.getGrowthStates().get("Fresh Adult").getBleed(),
                        austroraptor.getGrowthStates().get("Full Adult").getBleed(),
                        50)));


        return austroraptor;
    }


}
