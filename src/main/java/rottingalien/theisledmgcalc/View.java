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

    public int getUserInput(){
        return prompt.getUserInput(menuInputScanner);
    }

    public void showOutCome(Dino dino1, GrowthState growthState1, int numberOfBites1, Dino dino2, GrowthState growthState2, int numberOfBites2){
        System.out.println(dino1.getName() + " " + growthState1.getName() + " Kills " + dino2.getName() + " " + growthState2.getName() + " with " + numberOfBites1 + " Bites.");
        System.out.println(dino2.getName() + " " + growthState2.getName() + " Kills " + dino1.getName() + " " + growthState1.getName() + " with " + numberOfBites2 + " Bites.");
    }




}
