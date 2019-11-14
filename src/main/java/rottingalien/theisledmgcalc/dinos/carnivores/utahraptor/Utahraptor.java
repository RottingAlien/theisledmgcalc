package rottingalien.theisledmgcalc.dinos.carnivores.utahraptor;

import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

public class Utahraptor extends Dino{

    public Utahraptor() {
        wire();
    }

    public void wire(){

        setName("Utahraptor");
        setCarnivore(true);
        setTier(3);
        setGrowthDurationJuvi(50);
        setGrowthDurationSub(0);
        setGrowthDurationAdult(60);
        setGrowthDurationTotal(getGrowthDurationJuvi() + getGrowthDurationSub() + getGrowthDurationAdult());

        //----- JUVENILE

        GrowthState freshJuvi = new GrowthState(
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
                5,
                0,
                0,
                0,
                "utahJ");

        GrowthState fullJuvi = new GrowthState(
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
                10,
                0,
                0,
                0,
                "utahJ");



        //----- ADULT

        GrowthState freshAdult = new GrowthState(
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
                10,
                0,
                0,
                0,
                "utahA");

        GrowthState fullAdult = new GrowthState(
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
                20,
                0,
                0,
                0,
                "utahA");

        getGrowthStates().put("Fresh Juvenile", freshJuvi);
        getGrowthStates().put("Mid Juvenile", getMidGrowth("Mid Juvenile", freshJuvi, fullJuvi));
        getGrowthStates().put("Full Juvenile", fullJuvi);

        getGrowthStates().put("Fresh Adult", freshAdult);
        getGrowthStates().put("Mid Adult", getMidGrowth("Mid Adult", freshAdult, fullAdult));
        getGrowthStates().put("Full Adult", fullAdult);

    }


}
