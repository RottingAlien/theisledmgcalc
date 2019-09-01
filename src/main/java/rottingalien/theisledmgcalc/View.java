package rottingalien.theisledmgcalc;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

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

    public void showOutCome(Dino dino1, GrowthState growthState1, int numberOfBites1, int numberOfSpecials1, Dino dino2, GrowthState growthState2, int numberOfBites2, int numberOfSpecials2) {
        System.out.println(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfBites1 + " Basic Attacks.");
        if (numberOfSpecials1 <= 1000000) {
            System.out.println(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfSpecials1 + " Special Attacks.");
        }
        System.out.println(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfBites2 + " Basic Attacks.");
        if (numberOfSpecials2 <= 1000000) {
            System.out.println(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfSpecials2 + " Special Attacks.");
        }
        if (growthState1.getSpeed() == growthState2.getSpeed()) {
            System.out.println("Both dinos have the same speed");
            return;
        }
        if (growthState1.getSpeed() > growthState2.getSpeed()) {
            System.out.println("The " + dino1.getName() + " " + growthState1.getName() + " can outrun the " + dino2.getName() + " " + growthState2.getName() + " in speed.");
            return;
        }
        System.out.println("The " + dino2.getName() + " " + growthState2.getName() + " can outrun the " + dino1.getName() + " " + growthState1.getName() + " in speed.");

    }


}
