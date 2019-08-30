package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class TriceratopsWire {

    private Dino triceratops = new Dino("Triceratops");

    public Dino wire(){

        //----- JUVENILE

        triceratops.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                50,
                25,
                100,
                100,
                420,
                400,
                60,
                0));

        triceratops.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                50,
                25,
                100,
                100,
                1850,
                760,
                120,
                0));

        triceratops.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        triceratops.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        triceratops.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        triceratops.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        triceratops.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        triceratops.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        triceratops.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        triceratops.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        triceratops.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));




        //----- SUB-ADULT

        triceratops.getGrowthStates().put("Fresh Sub-Adult", new GrowthState(
                "Fresh Sub-Adult",
                50,
                10,
                50,
                100,
                2000,
                1250,
                120,
                4,
                680,
                4));

        triceratops.getGrowthStates().get("Fresh Sub-Adult").setHasSpecial(true);

        triceratops.getGrowthStates().put("Full Sub-Adult", new GrowthState(
                "Full Sub-Adult",
                50,
                10,
                50,
                100,
                4100,
                3570,
                200,
                8,
                1380,
                8));

        triceratops.getGrowthStates().get("Full Sub-Adult").setHasSpecial(true);

        triceratops.getGrowthStates().put("Mid Sub-Adult", new GrowthState(
                "Mid Sub-Adult",
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getBleedStandResist(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getBleedSitResist(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getBleedWalkResist(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getBleedRunResist(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getWeight(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getHealth(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getBiteForce(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getBleed(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getBleed(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getSpecial(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getSpecial(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Sub-Adult").getSpecialBleed(),
                        triceratops.getGrowthStates().get("Full Sub-Adult").getSpecialBleed(),
                        50)));

        triceratops.getGrowthStates().get("Mid Sub-Adult").setHasSpecial(true);



        //----- ADULT

        triceratops.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                40,
                20,
                90,
                180,
                4150,
                4000,
                160,
                15,
                700,
                15));

        triceratops.getGrowthStates().get("Fresh Adult").setHasSpecial(true);

        triceratops.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                40,
                20,
                90,
                180,
                8300,
                8200,
                360,
                20,
                850,
                25));

        triceratops.getGrowthStates().get("Full Adult").setHasSpecial(true);

        triceratops.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        triceratops.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        triceratops.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        triceratops.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        triceratops.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getWeight(),
                        triceratops.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getHealth(),
                        triceratops.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        triceratops.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getBleed(),
                        triceratops.getGrowthStates().get("Full Adult").getBleed(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getSpecial(),
                        triceratops.getGrowthStates().get("Full Adult").getSpecial(),
                        50),
                FindMidValues.findMidValue(triceratops.getGrowthStates().get("Fresh Adult").getSpecialBleed(),
                        triceratops.getGrowthStates().get("Full Adult").getSpecialBleed(),
                        50)));

        triceratops.getGrowthStates().get("Mid Adult").setHasSpecial(true);


        return triceratops;
    }


}
