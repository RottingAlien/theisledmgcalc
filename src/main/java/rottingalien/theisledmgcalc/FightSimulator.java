package rottingalien.theisledmgcalc;

public class FightSimulator {

    private DinosaurList dinosaurList;

    public FightSimulator() {
        this.dinosaurList = new DinosaurList();
        init();
    }

    public void init() {
        dinosaurList.makeList();

        for (Dino dino : dinosaurList.getDinoMap().values()) {
            System.out.println("--- " + dino.getName() + " ---");
            for (GrowthState growthstate : dino.getGrowthStates().values()) {
                System.out.println(growthstate.getName());
            }
        }

    }

    public void fight(String dino1, String growthState1, String dino2, String growthState2){
        Dino chosenDino1 = dinosaurList.getDinoMap().get(dino1);
        Dino chosenDino2 = dinosaurList.getDinoMap().get(dino2);
        GrowthState dino1GrowthState = chosenDino1.getGrowthStates().get(growthState1);
        GrowthState dino2GrowthState = chosenDino2.getGrowthStates().get(growthState2);

        double actualDino1Damage = actualDamage(dino1GrowthState.getBiteForce(),dino1GrowthState.getWeight(),dino2GrowthState.getWeight());
        double actualDino2Damage = actualDamage(dino2GrowthState.getBiteForce(),dino2GrowthState.getWeight(),dino1GrowthState.getWeight());

        int numberOfBites1 = ((int) (Math.ceil(dino2GrowthState.getHealth()/actualDino1Damage)));
        int numberOfBites2 = ((int) (Math.ceil(dino1GrowthState.getHealth()/actualDino2Damage)));

        System.out.println(chosenDino1.getName() + " Kills " + chosenDino2.getName() + " with " + numberOfBites1 + " Bites.");
        System.out.println(chosenDino2.getName() + " Kills " + chosenDino1.getName() + " with " + numberOfBites2 + " Bites.");

    }

    private double actualDamage(double damage, double weight1, double weight2){
        return damage*(weight1/weight2);
    }
}
