package rottingalien.theisledmgcalc.dinos.herbivores;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Maiasaura extends Dino {

    public Maiasaura() {
        wire();
    }

    public void wire(){

        setName("Maiasaura");
        setCarnivore(false);
        setTier(3);
        setGrowthDurationJuvi(50);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        getGrowthStates().put("Fresh Juvenile", new GrowthState(
                "Fresh Juvenile",
                44.6,
                0,
                50,
                25,
                100,
                100,
                300,
                50,
                30,
                0));

        getGrowthStates().put("Full Juvenile", new GrowthState(
                "Full Juvenile",
                44.6,
                0,
                50,
                25,
                100,
                100,
                950,
                748,
                60,
                0));

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



        //----- ADULT

        getGrowthStates().put("Fresh Adult", new GrowthState(
                "Fresh Adult",
                44.6,
                0,
                25,
                20,
                100,
                200,
                960,
                1000,
                100,
                0));

        getGrowthStates().put("Full Adult", new GrowthState(
                "Full Adult",
                44.6,
                0,
                25,
                20,
                100,
                200,
                2868,
                2868,
                175,
                0));

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
