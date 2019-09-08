package rottingalien.theisledmgcalc;

import org.springframework.stereotype.Component;
import rottingalien.utils.Terminal.Terminal;

import java.util.LinkedList;
import java.util.List;

@Component
public class FightSimulator {

    private List<String> outcome = new LinkedList<>();

    private DinosaurList dinosaurList;
    private Dino chosenDino1;
    private Dino chosenDino2;
    private GrowthState dino1GrowthState;
    private GrowthState dino2GrowthState;
    private double actualDino1Damage;
    private double actualDino2Damage;
    private double actualDino1SDamage;
    private double actualDino2SDamage;
    private double actualDino1Bleed;
    private double actualDino2Bleed;



    private int numberOfBites1;
    private int numberOfBites2;
    private int numberOfSpecials1;
    private int numberOfSpecials2;


    public FightSimulator() {
        this.dinosaurList = new DinosaurList();
    }
    public void fight(String dino1, String dino1Growth, String dino2, String dino2Growth) {

        chosenDino1 = dinosaurList.getDinoMap().get(dino1);
        dino1GrowthState = chosenDino1.getGrowthStates().get(dino1Growth);
        chosenDino2 = dinosaurList.getDinoMap().get(dino2);
        dino2GrowthState = chosenDino2.getGrowthStates().get(dino2Growth);

        actualDino1Damage = Math.round(actualDamage(dino1GrowthState.getBiteForce(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight())*10)/10.0;
        actualDino2Damage = Math.round(actualDamage(dino2GrowthState.getBiteForce(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight())*10)/10.0;

        actualDino1SDamage = Math.round(actualDamage(dino1GrowthState.getSpecial(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight())*10)/10.0;
        actualDino2SDamage = Math.round(actualDamage(dino2GrowthState.getSpecial(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight())*10)/10.0;;

        actualDino1Bleed = actualDamage(dino1GrowthState.getBleed(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight());
        actualDino2Bleed = actualDamage(dino2GrowthState.getBleed(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight());

        numberOfBites1 = ((int) (Math.ceil(dino2GrowthState.getHealth() / actualDino1Damage)));
        numberOfBites2 = ((int) (Math.ceil(dino1GrowthState.getHealth() / actualDino2Damage)));

        numberOfSpecials1 = ((int) (Math.ceil(dino2GrowthState.getHealth() / actualDino1SDamage)));
        numberOfSpecials2 = ((int) (Math.ceil(dino1GrowthState.getHealth() / actualDino2SDamage)));
    }

    public void prepareOutcome() {
        outcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " (" + dino1GrowthState.getHealth() + " Health)" + " VS " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " (" + dino2GrowthState.getHealth() + " Health)");
        outcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " Kills " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " with " + numberOfBites1 + " Basic Attacks. (" + actualDino1Damage + " Damage/hit)");
        if (numberOfSpecials1 <= 1000000) {
            outcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " Kills " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " with " + numberOfSpecials1 + " Special Attacks. (" + actualDino1SDamage + " Damage/hit)");
        }
        outcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " Kills " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " with " + numberOfBites2 + " Basic Attacks. (" + actualDino2Damage + " Damage/hit)");
        if (numberOfSpecials2 <= 1000000) {
            outcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " Kills " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " with " + numberOfSpecials2 + " Special Attacks. (" + actualDino2SDamage + " Damage/hit)");
        }
        if (dino1GrowthState.getSpeed() == dino2GrowthState.getSpeed()) {
            outcome.add("Both dinos have the same speed");
        }
        if (dino1GrowthState.getSpeed() > dino2GrowthState.getSpeed()) {
            outcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " can outrun the " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " in speed.");
        }
        if (dino1GrowthState.getSpeed() < dino2GrowthState.getSpeed()) {
            outcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " can outrun the " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " in speed.");
        }
        if (dino1GrowthState.getAmbush() > dino2GrowthState.getSpeed()) {
            outcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " can outrun the " + chosenDino2.getName() + " " + dino2GrowthState.getName() + "'s normal speed in ambush.");
        }
        if (dino1GrowthState.getSpeed() < dino2GrowthState.getAmbush() && dino2GrowthState.hasAmbush()) {
            outcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " can outrun the " + chosenDino1.getName() + " " + dino1GrowthState.getName() + "'s normal speed in ambush.");
        }
    }

    public List<String> prepareDinoInfo(String dinoName, String growthName) {
        List<String> dinoInfo = new LinkedList<>();
        dinoInfo.clear();
        Dino dino = dinosaurList.getDinoMap().get(dinoName);
        GrowthState growth = dino.getGrowthStates().get(growthName);
        dinoInfo.add(dino.getName() + " " + growth.getName() + ":");
        dinoInfo.add("Tier: " + dino.getTier());
        dinoInfo.add("Total growth duration: " + dino.getGrowthDurationTotal());
        if (dino.hasJuviGrowth()) {
            dinoInfo.add("Juvi Growth Duration: " + dino.getGrowthDurationJuvi());
        }
        if (dino.hasSubGrowth()) {
            dinoInfo.add("Sub Growth Duration: " + dino.getGrowthDurationSub());
        }
        dinoInfo.add("Adult Growth duration: " + dino.getGrowthDurationAdult());
        dinoInfo.add("Speed: " + growth.getSpeed());
        if (growth.hasAmbush()) {
            dinoInfo.add("Ambush: " + growth.getAmbush());
        }

        return dinoInfo;
    }


    private double actualDamage(double damage, double weight1, double weight2) {
        return damage * (weight1 / weight2);
    }

    public List<String> getOutcome() {
        return outcome;
    }

    public DinosaurList getDinosaurList() {
        return dinosaurList;
    }

    public Dino getChosenDino1() {
        return chosenDino1;
    }

    public Dino getChosenDino2() {
        return chosenDino2;
    }

    public GrowthState getDino1GrowthState() {
        return dino1GrowthState;
    }

    public GrowthState getDino2GrowthState() {
        return dino2GrowthState;
    }

    public double getActualDino1Damage() {
        return actualDino1Damage;
    }

    public double getActualDino2Damage() {
        return actualDino2Damage;
    }

    public double getActualDino1SDamage() {
        return actualDino1SDamage;
    }

    public double getActualDino2SDamage() {
        return actualDino2SDamage;
    }

    public double getActualDino1Bleed() {
        return actualDino1Bleed;
    }

    public double getActualDino2Bleed() {
        return actualDino2Bleed;
    }

    public int getNumberOfBites1() {
        return numberOfBites1;
    }

    public int getNumberOfBites2() {
        return numberOfBites2;
    }

    public int getNumberOfSpecials1() {
        return numberOfSpecials1;
    }

    public int getNumberOfSpecials2() {
        return numberOfSpecials2;
    }
}
