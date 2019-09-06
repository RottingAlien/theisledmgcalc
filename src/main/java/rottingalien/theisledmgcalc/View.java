package rottingalien.theisledmgcalc;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import rottingalien.utils.Terminal.Terminal;

import java.util.LinkedList;
import java.util.List;

public class View {

    private List<String> outcome = new LinkedList<>();
    private List<String> dinoInfo = new LinkedList<>();

    public List<String> getOutcome(Dino dino1, GrowthState growthState1, double actualDino1Damage, double actualDino1SDamage, int numberOfBites1, int numberOfSpecials1, Dino dino2, GrowthState growthState2, double actualDino2Damage, double actualDino2SDamage, int numberOfBites2, int numberOfSpecials2) {
        outcome.add(dino1.getName() + " " + growthState1.getName() + " (" + growthState1.getHealth() + " Health)" + " VS " + dino2.getName() + " " + growthState2.getName() + " (" + growthState2.getHealth() + " Health)");
        outcome.add(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfBites1 + " Basic Attacks. (" + actualDino1Damage + " Damage/hit)");
        if (numberOfSpecials1 <= 1000000) {
            outcome.add(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfSpecials1 + " Special Attacks. (" + actualDino1SDamage + " Damage/hit)");
        }
        outcome.add(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfBites2 + " Basic Attacks. (" + actualDino2Damage + " Damage/hit)");
        if (numberOfSpecials2 <= 1000000) {
            outcome.add(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfSpecials2 + " Special Attacks. (" + actualDino2SDamage + " Damage/hit)");
        }
        if (growthState1.getSpeed() == growthState2.getSpeed()) {
            outcome.add("Both dinos have the same speed");
        }
        if (growthState1.getSpeed() > growthState2.getSpeed()) {
            outcome.add(dino1.getName() + " " + growthState1.getName() + " can outrun the " + dino2.getName() + " " + growthState2.getName() + " in speed.");
        }
        if (growthState1.getSpeed() < growthState2.getSpeed()) {
            outcome.add(dino2.getName() + " " + growthState2.getName() + " can outrun the " + dino1.getName() + " " + growthState1.getName() + " in speed.");
        }
        if (growthState1.getAmbush() > growthState2.getSpeed()) {
            outcome.add(dino1.getName() + " " + growthState1.getName() + " can outrun the " + dino2.getName() + " " + growthState2.getName() + "'s normal speed in ambush.");
        }
        if (growthState1.getSpeed() < growthState2.getAmbush() && growthState2.hasAmbush()) {
            outcome.add(dino2.getName() + " " + growthState2.getName() + " can outrun the " + dino1.getName() + " " + growthState1.getName() + "'s normal speed in ambush.");
        }
        return outcome;
    }

    public List<String> getDinoInfo(Dino dino, GrowthState growth) {
        Terminal.clearScreen();
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
}
