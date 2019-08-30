package rottingalien.theisledmgcalc.wire.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class MaiasauraWire {

    private Dino maiasaura = new Dino("Maiasaura");

    public Dino wire(){

        //----- JUVENILE

        maiasaura.getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                50,
                25,
                100,
                100,
                300,
                50,
                30,
                0));

        maiasaura.getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                50,
                25,
                100,
                100,
                950,
                748,
                60,
                0));

        maiasaura.getGrowthStates().put("Mid Juvenile", new GrowthState(
                "Mid Juvenile",
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getBleedStandResist(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getBleedSitResist(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getBleedWalkResist(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getBleedRunResist(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getWeight(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getWeight(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getHealth(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getHealth(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getBiteForce(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getBiteForce(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Juvenile").getBleed(),
                        maiasaura.getGrowthStates().get("Full Juvenile").getBleed(),
                        50)));



        //----- ADULT

        maiasaura.getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                25,
                20,
                100,
                200,
                960,
                1000,
                100,
                0));

        maiasaura.getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                25,
                20,
                100,
                200,
                2868,
                2868,
                175,
                0));

        maiasaura.getGrowthStates().put("Mid Adult", new GrowthState(
                "Mid Adult",
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getBleedStandResist(),
                        maiasaura.getGrowthStates().get("Full Adult").getBleedStandResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getBleedSitResist(),
                        maiasaura.getGrowthStates().get("Full Adult").getBleedSitResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getBleedWalkResist(),
                        maiasaura.getGrowthStates().get("Full Adult").getBleedWalkResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getBleedRunResist(),
                        maiasaura.getGrowthStates().get("Full Adult").getBleedRunResist(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getWeight(),
                        maiasaura.getGrowthStates().get("Full Adult").getWeight(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getHealth(),
                        maiasaura.getGrowthStates().get("Full Adult").getHealth(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getBiteForce(),
                        maiasaura.getGrowthStates().get("Full Adult").getBiteForce(),
                        50),
                FindMidValues.findMidValue(maiasaura.getGrowthStates().get("Fresh Adult").getBleed(),
                        maiasaura.getGrowthStates().get("Full Adult").getBleed(),
                        50)));




        return maiasaura;
    }


}
