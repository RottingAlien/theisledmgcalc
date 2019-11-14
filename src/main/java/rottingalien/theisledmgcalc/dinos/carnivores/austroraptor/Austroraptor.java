package rottingalien.theisledmgcalc.dinos.carnivores.austroraptor;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Austroraptor extends Dino{

    public Austroraptor() {
        wire();
    }

    public void wire() {
        setName("Austroraptor");
        setCarnivore(true);
        setTier(2);
        setGrowthDurationJuvi(60);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());
        
        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
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
                0,
                0,
                0,
                0,
                "austro");

        GrowthState fullJuvi = new GrowthState(
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
                0,
                0,
                0,
                0,
                "austro");

        //----- ADULT

        GrowthState freshAdult = new GrowthState(
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
                2,
                0,
                0,
                0,
                "austro");

        GrowthState fullAdult = new GrowthState(
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
                2,
                0,
                0,
                0,
                "austro");

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }


}
