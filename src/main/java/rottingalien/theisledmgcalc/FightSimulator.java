package rottingalien.theisledmgcalc;

public class FightSimulator {

    private DinosaurList dinosaurList;
    private Dino chosenDino1;
    private Dino chosenDino2;
    private GrowthState dino1GrowthState;
    private GrowthState dino2GrowthState;
    private View view;
    private String[] dinoStringArr;
    private String[] growStringArr;


    public FightSimulator() {
        this.dinosaurList = new DinosaurList();
        dinosaurList.makeList();
        dinoStringArr = new String[dinosaurList.getDinoMap().size()];
        //init();

    }

    public int askDino(){
        int dinoArrIndex = 0;
        for (Dino dino : dinosaurList.getDinoMap().values()) {
            dinoStringArr[dinoArrIndex] = dino.getName();
            dinoArrIndex++;
        }
        view = new View(dinoStringArr,"Choose Dino:");
        return view.getUserInput();
    }

    public int askGrowState(Dino dino){
        growStringArr = new String[dino.getGrowthStates().size()];
        int growArrIndex = 0;
        for (GrowthState growthState : dino.getGrowthStates().values()) {
            growStringArr[growArrIndex] = growthState.getName();
            growArrIndex++;
        }
        view = new View(growStringArr,"Choose " + dino.getName() + " growth:");
        return view.getUserInput();
    }

    public void init() {
        fight();

    }

    public void fight(){
        chosenDino1 = dinosaurList.getDinoMap().get(dinoStringArr[askDino()-1]);
        int userInput1 = askGrowState(chosenDino1)-1;
        dino1GrowthState = chosenDino1.getGrowthStates().get(growStringArr[userInput1]);
        chosenDino2 = dinosaurList.getDinoMap().get(dinoStringArr[askDino()-1]);
        int userInput2 = askGrowState(chosenDino2)-1;
        dino2GrowthState = chosenDino2.getGrowthStates().get(growStringArr[userInput2]);

        double actualDino1Damage = actualDamage(dino1GrowthState.getBiteForce(),dino1GrowthState.getWeight(),dino2GrowthState.getWeight());
        double actualDino2Damage = actualDamage(dino2GrowthState.getBiteForce(),dino2GrowthState.getWeight(),dino1GrowthState.getWeight());

        double actualDino1Bleed = actualDamage(dino1GrowthState.getBleed(),dino1GrowthState.getWeight(),dino2GrowthState.getWeight());
        double actualDino2Bleed = actualDamage(dino2GrowthState.getBleed(),dino2GrowthState.getWeight(),dino1GrowthState.getWeight());

        int numberOfBites1 = ((int) (Math.ceil(dino2GrowthState.getHealth()/actualDino1Damage)));
        int numberOfBites2 = ((int) (Math.ceil(dino1GrowthState.getHealth()/actualDino2Damage)));

        view.showOutCome(chosenDino1,dino1GrowthState,numberOfBites1,chosenDino2,dino2GrowthState,numberOfBites2);


    }

    private double actualDamage(double damage, double weight1, double weight2){
        return damage*(weight1/weight2);
    }
    private double actualBleed(double bleed, double weight1, double weight2){
        return bleed*(weight1/weight2);
    }
}
