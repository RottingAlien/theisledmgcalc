package rottingalien.theisle.dmgcalc;

public class Main {

    public static void main(String[] args) {


        String firstDinosaur = "Carnotaurus";
        String secondDinosaur = "Dilophosaurus";
        System.out.println(firstDinosaur + " VS " + secondDinosaur);

        int actualDamage = Carnotaurus.freshJuvi.getBiteForce() * (Carnotaurus.freshJuvi.getWeight() / Dilophosaurus.freshJuvi.getWeight());

        int numOfBites = Dilophosaurus.freshJuvi.getHealth()/actualDamage;
        System.out.println(actualDamage + " Damage");
        System.out.println(numOfBites + " Bites");


    }
}
