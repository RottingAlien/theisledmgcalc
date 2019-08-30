package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class ParasaurolophusWire {

    private Dino parasaurolophus = new Dino("Parasaurolophus");

    public Dino wire(){

        parasaurolophus.setCarnivore(false);
        parasaurolophus.setTier(0);
        parasaurolophus.setGrowthDurationJuvi(0);
        parasaurolophus.setGrowthDurationSub(0);
        parasaurolophus.setGrowthDurationAdult(0);
        parasaurolophus.setGrowthDurationTotal(parasaurolophus.getGrowthDurationJuvi() + parasaurolophus.getGrowthDurationSub() + parasaurolophus.getGrowthDurationAdult());

        //----- JUVENILE

        parasaurolophus.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                24.4,
                0,
                50,
                25,
                100,
                100,
                350,
                50,
                40,
                0,
                525,
                0));

        parasaurolophus.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                24.4,
                0,
                100,
                100,
                1800,
                1750,
                80,
                0,
                525,
                0));

        parasaurolophus.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getSpeed(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getSpeed(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getAmbush(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getAmbush(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getBleed(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getSpecial(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getSpecial(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Juvenile").getSpecialBleed(),
                        parasaurolophus.getGrowthStates().get("Full Juvenile").getSpecialBleed(),
                        50)));

        //----- ADULT

        parasaurolophus.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                34.2,
                0,
                30,
                20,
                50,
                80,
                2000,
                2000,
                115,
                0,
                750,
                0));

        parasaurolophus.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                34.2,
                0,
                30,
                20,
                50,
                80,
                3600,
                3600,
                250,
                0,
                750,
                0));

        parasaurolophus.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getSpeed(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getSpeed(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getAmbush(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getAmbush(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getWeight(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getHealth(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getBleed(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getBleed(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getSpecial(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getSpecial(),
                        50),
                FindMidValues.findMidValue(parasaurolophus.getGrowthStates().get("Fresh Adult").getSpecialBleed(),
                        parasaurolophus.getGrowthStates().get("Full Adult").getSpecialBleed(),
                        50)));




        return parasaurolophus;
    }


}
