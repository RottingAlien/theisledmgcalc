package rottingalien.theisledmgcalc;


public class Main {
    public static void main(String[] args) {

        DinosaurList dinosaurList=new DinosaurList();

        dinosaurList.makeList();

        for (Dino dino : dinosaurList.getDinoMap().values()) {
            System.out.println("--- " + dino.getName() + " ---");
            for (GrowthState growthstate : dino.getGrowthStates().values()) {
                System.out.println(growthstate.getName());
            }
        }

    }

}
