package rottingalien.theisledmgcalc;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import rottingalien.utils.Terminal.Terminal;

public class View {

    Prompt prompt = new Prompt(System.in, System.out);
    private MenuInputScanner menuInputScanner;

    public View(String[] options, String message) {
        menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage(message);

    }

    public int getUserInput() {
        return prompt.getUserInput(menuInputScanner);
    }

    public void showOutCome(Dino dino1, GrowthState growthState1, double actualDino1Damage, double actualDino1SDamage, int numberOfBites1, int numberOfSpecials1, Dino dino2, GrowthState growthState2, double actualDino2Damage, double actualDino2SDamage, int numberOfBites2, int numberOfSpecials2) {
        System.out.println(dino1.getName() + " " + growthState1.getName() + " (" + growthState1.getHealth() + " Health)" + " VS " + dino2.getName() + " " + growthState2.getName() + " (" + growthState2.getHealth() + " Health)");
        System.out.println("");
        System.out.println(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfBites1 + " Basic Attacks. (" + actualDino1Damage + " Damage/hit)");
        if (numberOfSpecials1 <= 1000000) {
            System.out.println(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfSpecials1 + " Special Attacks. (" + actualDino1SDamage + " Damage/hit)");
        }
        System.out.println(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfBites2 + " Basic Attacks. (" + actualDino2Damage + " Damage/hit)");
        if (numberOfSpecials2 <= 1000000) {
            System.out.println(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfSpecials2 + " Special Attacks. (" + actualDino2SDamage + " Damage/hit)");
        }
        if (growthState1.getSpeed() == growthState2.getSpeed()) {
            System.out.println("Both dinos have the same speed");
        }
        if (growthState1.getSpeed() > growthState2.getSpeed()) {
            System.out.println(dino1.getName() + " " + growthState1.getName() + " can outrun the " + dino2.getName() + " " + growthState2.getName() + " in speed.");
        }
        if (growthState1.getSpeed() < growthState2.getSpeed()) {
            System.out.println(dino2.getName() + " " + growthState2.getName() + " can outrun the " + dino1.getName() + " " + growthState1.getName() + " in speed.");
        }
        if (growthState1.getAmbush() > growthState2.getSpeed()) {
            System.out.println(dino1.getName() + " " + growthState1.getName() + " can outrun the " + dino2.getName() + " " + growthState2.getName() + "'s normal speed in ambush.");
        }
        if (growthState1.getSpeed() < growthState2.getAmbush() && growthState2.hasAmbush()) {
            System.out.println(dino2.getName() + " " + growthState2.getName() + " can outrun the " + dino1.getName() + " " + growthState1.getName() + "'s normal speed in ambush.");
        }

    }

    public void showDinoInfo(Dino dino, GrowthState growth) {
        Terminal.clearScreen();
        System.out.println(dino.getName() + " " + growth.getName() + ":");
        System.out.println("Tier: " + dino.getTier());
        System.out.println("Total growth duration: " + dino.getGrowthDurationTotal());
        if (dino.hasJuviGrowth()) {
            System.out.println("Juvi Growth Duration: " + dino.getGrowthDurationJuvi());
        }
        if (dino.hasSubGrowth()) {
            System.out.println("Sub Growth Duration: " + dino.getGrowthDurationSub());
        }
        System.out.println("Adult Growth duration: " + dino.getGrowthDurationAdult());
        System.out.println("Speed: " + growth.getSpeed());
        if (growth.hasAmbush()) {
            System.out.println("Ambush: " + growth.getAmbush());
        }
        System.out.println("");

    }


}
