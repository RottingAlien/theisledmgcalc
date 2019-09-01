package rottingalien.theisledmgcalc;

import rottingalien.utils.Terminal.Terminal;

public class FightSimulator {

    private DinosaurList dinosaurList;
    private Dino chosenDino1;
    private Dino chosenDino2;
    private GrowthState dino1GrowthState;
    private GrowthState dino2GrowthState;
    private int userInput1;
    private int userInput2;
    private View view;
    private String[] dinoStringArr;
    private String[] growStringArr;


    public FightSimulator() {
        this.dinosaurList = new DinosaurList();
        dinosaurList.makeList();
        dinoStringArr = new String[dinosaurList.getDinoMap().size()];
        //init();

    }

    public int askDino(String dinoNumber) {
        int dinoArrIndex = 0;
        for (Dino dino : dinosaurList.getDinoMap().values()) {
            dinoStringArr[dinoArrIndex] = dino.getName();
            dinoArrIndex++;
        }
        view = new View(dinoStringArr, "Choose " + dinoNumber + " Dino:");
        return view.getUserInput();
    }

    public int askGrowState(Dino dino) {
        growStringArr = new String[dino.getGrowthStates().size()];
        int growArrIndex = 0;
        for (GrowthState growthState : dino.getGrowthStates().values()) {
            growStringArr[growArrIndex] = growthState.getName();
            growArrIndex++;
        }
        view = new View(growStringArr, "Choose " + dino.getName() + " growth:");
        return view.getUserInput();
    }

    public void init() {
        chosenDino1 = dinosaurList.getDinoMap().get(dinoStringArr[askDino("1st") - 1]);
        Terminal.clearScreen();
        userInput1 = askGrowState(chosenDino1) - 1;
        dino1GrowthState = chosenDino1.getGrowthStates().get(growStringArr[userInput1]);
        Terminal.clearScreen();
        chosenDino2 = dinosaurList.getDinoMap().get(dinoStringArr[askDino("2nd") - 1]);
        Terminal.clearScreen();
        userInput2 = askGrowState(chosenDino2) - 1;
        dino2GrowthState = chosenDino2.getGrowthStates().get(growStringArr[userInput2]);
        Terminal.clearScreen();

        while (true) {
            fight();

            view = new View(new String[]{"Change Dino 1", "Change Dino 2", "Change Both", "Show Dino 1 Info", "Show Dino 2 Info", "Exit"}, "Choose an option");
            switch (view.getUserInput()) {
                case 1:
                    chosenDino1 = dinosaurList.getDinoMap().get(dinoStringArr[askDino("1st") - 1]);
                    Terminal.clearScreen();
                    userInput1 = askGrowState(chosenDino1) - 1;
                    dino1GrowthState = chosenDino1.getGrowthStates().get(growStringArr[userInput1]);
                    Terminal.clearScreen();
                    break;
                case 2:
                    chosenDino2 = dinosaurList.getDinoMap().get(dinoStringArr[askDino("2nd") - 1]);
                    Terminal.clearScreen();
                    userInput2 = askGrowState(chosenDino2) - 1;
                    dino2GrowthState = chosenDino2.getGrowthStates().get(growStringArr[userInput2]);
                    Terminal.clearScreen();
                    break;
                case 3:
                    chosenDino1 = dinosaurList.getDinoMap().get(dinoStringArr[askDino("1st") - 1]);
                    Terminal.clearScreen();
                    userInput1 = askGrowState(chosenDino1) - 1;
                    dino1GrowthState = chosenDino1.getGrowthStates().get(growStringArr[userInput1]);
                    Terminal.clearScreen();
                    chosenDino2 = dinosaurList.getDinoMap().get(dinoStringArr[askDino("2nd") - 1]);
                    Terminal.clearScreen();
                    userInput2 = askGrowState(chosenDino2) - 1;
                    dino2GrowthState = chosenDino2.getGrowthStates().get(growStringArr[userInput2]);
                    Terminal.clearScreen();
                    break;
                case 4:
                    view.showDinoInfo(chosenDino1, dino1GrowthState);
                    break;
                case 5:
                    view.showDinoInfo(chosenDino2, dino2GrowthState);
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }

    public void fight() {


        double actualDino1Damage = actualDamage(dino1GrowthState.getBiteForce(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight());
        double actualDino2Damage = actualDamage(dino2GrowthState.getBiteForce(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight());

        double actualDino1SDamage = actualDamage(dino1GrowthState.getSpecial(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight());
        double actualDino2SDamage = actualDamage(dino2GrowthState.getSpecial(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight());

        double actualDino1Bleed = actualDamage(dino1GrowthState.getBleed(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight());
        double actualDino2Bleed = actualDamage(dino2GrowthState.getBleed(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight());

        int numberOfBites1 = ((int) (Math.ceil(dino2GrowthState.getHealth() / actualDino1Damage)));
        int numberOfBites2 = ((int) (Math.ceil(dino1GrowthState.getHealth() / actualDino2Damage)));

        int numberOfSpecials1 = ((int) (Math.ceil(dino2GrowthState.getHealth() / actualDino1SDamage)));
        int numberOfSpecials2 = ((int) (Math.ceil(dino1GrowthState.getHealth() / actualDino2SDamage)));

        view.showOutCome(chosenDino1, dino1GrowthState, numberOfBites1, numberOfSpecials1, chosenDino2, dino2GrowthState, numberOfBites2, numberOfSpecials2);

    }


    private double actualDamage(double damage, double weight1, double weight2) {
        return damage * (weight1 / weight2);
    }
}
