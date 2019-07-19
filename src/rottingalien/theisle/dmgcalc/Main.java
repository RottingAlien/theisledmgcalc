package rottingalien.theisle.dmgcalc;

public class Main {

    public static void main(String[] args) {


        String firstDinosaur = "Carnotaurus";
        String secondDinosaur = "Dilophosaurus";

        int actualDamage = Carnotaurus.getFreshJuvi().getBiteForce() * (Carnotaurus.getFreshJuvi().getWeight() / Dilophosaurus.getFreshJuvi().getWeight());
        int numOfBites = Dilophosaurus.getFreshJuvi().getHealth()/actualDamage;

        System.out.println(firstDinosaur + " VS " + secondDinosaur);
        System.out.println(actualDamage + " Damage");
        System.out.println(numOfBites + " Bites");



    }


}
