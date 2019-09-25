package rottingalien.theisledmgcalc;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class FightSimulator {

    private String fighters;
    private List<String> damageOutcome = new LinkedList<>();
    private List<String> bleedOutcome = new LinkedList<>();
    private List<String> speedOutcome = new LinkedList<>();

    private DinosaurList dinosaurList;
    private Dino chosenDino1;
    private Dino chosenDino2;
    private GrowthState dino1GrowthState;
    private GrowthState dino2GrowthState;
    private double actualDino1Damage;
    private double actualDino2Damage;
    private double actualDino1SDamage;
    private double actualDino2SDamage;

    private double actualDino1TrampleDamage;
    private double actualDino2TrampleDamage;

    private double actualDino1Bleed;
    private double actualDino2Bleed;
    private double actualDino1SpecialBleed;
    private double actualDino2SpecialBleed;

    private double actualDino1StandBleed;
    private double actualDino2StandBleed;
    private double actualDino1SitBleed;
    private double actualDino2SitBleed;
    private double actualDino1WalkBleed;
    private double actualDino2WalkBleed;
    private double actualDino1RunBleed;
    private double actualDino2RunBleed;

    private double actualDino1SpecialStandBleed;
    private double actualDino2SpecialStandBleed;
    private double actualDino1SpecialSitBleed;
    private double actualDino2SpecialSitBleed;
    private double actualDino1SpecialWalkBleed;
    private double actualDino2SpecialWalkBleed;
    private double actualDino1SpecialRunBleed;
    private double actualDino2SpecialRunBleed;


    private int numberOfBites1;
    private int numberOfBites2;
    private int numberOfSpecials1;
    private int numberOfSpecials2;


    public FightSimulator() {
        this.dinosaurList = new DinosaurList();
    }

    public void fight(String dino1, String dino1Growth, String dino2, String dino2Growth) {

        chosenDino1 = dinosaurList.getDinoMap().get(dino1);
        dino1GrowthState = chosenDino1.getGrowthStates().get(dino1Growth);
        chosenDino2 = dinosaurList.getDinoMap().get(dino2);
        dino2GrowthState = chosenDino2.getGrowthStates().get(dino2Growth);

        actualDino1Damage = Math.round(actualDamage(dino1GrowthState.getBiteForce(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight()) * 10) / 10.0;
        actualDino2Damage = Math.round(actualDamage(dino2GrowthState.getBiteForce(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight()) * 10) / 10.0;

        actualDino1SDamage = Math.round(actualDamage(dino1GrowthState.getSpecial(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight()) * 10) / 10.0;
        actualDino2SDamage = Math.round(actualDamage(dino2GrowthState.getSpecial(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight()) * 10) / 10.0;

        actualDino1TrampleDamage = Math.round(actualDamage(dino1GrowthState.getTrample(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight()) * 10) / 10.0;
        actualDino2TrampleDamage = Math.round(actualDamage(dino2GrowthState.getTrample(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight()) * 10) / 10.0;

        actualDino1Bleed = actualDamage(dino1GrowthState.getBleed(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight());
        actualDino2Bleed = actualDamage(dino2GrowthState.getBleed(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight());

        actualDino1SpecialBleed = actualDamage(dino1GrowthState.getSpecialBleed(), dino1GrowthState.getWeight(), dino2GrowthState.getWeight());
        actualDino2SpecialBleed = actualDamage(dino2GrowthState.getSpecialBleed(), dino2GrowthState.getWeight(), dino1GrowthState.getWeight());


        actualDino1SitBleed = Math.round(((dino1GrowthState.getBleedSitResist()/100)*actualDino2Bleed)*10)/10.0;
        actualDino1StandBleed = Math.round(((dino1GrowthState.getBleedStandResist()/100)*actualDino2Bleed)*10)/10.0;
        actualDino1WalkBleed = Math.round(((dino1GrowthState.getBleedWalkResist()/100)*actualDino2Bleed)*10)/10.0;
        actualDino1RunBleed = Math.round(((dino1GrowthState.getBleedRunResist()/100)*actualDino2Bleed)*10)/10.0;
        actualDino2SitBleed = Math.round(((dino2GrowthState.getBleedSitResist()/100)*actualDino1Bleed)*10)/10.0;
        actualDino2StandBleed = Math.round(((dino2GrowthState.getBleedStandResist()/100)*actualDino1Bleed)*10)/10.0;
        actualDino2WalkBleed = Math.round(((dino2GrowthState.getBleedWalkResist()/100)*actualDino1Bleed)*10)/10.0;
        actualDino2RunBleed = Math.round(((dino2GrowthState.getBleedRunResist()/100)*actualDino1Bleed)*10)/10.0;

        actualDino1SpecialSitBleed = Math.round(((dino1GrowthState.getBleedSitResist()/100)*actualDino2SpecialBleed)*10)/10.0;
        actualDino1SpecialStandBleed = Math.round(((dino1GrowthState.getBleedStandResist()/100)*actualDino2SpecialBleed)*10)/10.0;
        actualDino1SpecialWalkBleed = Math.round(((dino1GrowthState.getBleedWalkResist()/100)*actualDino2SpecialBleed)*10)/10.0;
        actualDino1SpecialRunBleed = Math.round(((dino1GrowthState.getBleedRunResist()/100)*actualDino2SpecialBleed)*10)/10.0;
        actualDino2SpecialSitBleed = Math.round(((dino2GrowthState.getBleedSitResist()/100)*actualDino1SpecialBleed)*10)/10.0;
        actualDino2SpecialStandBleed = Math.round(((dino2GrowthState.getBleedStandResist()/100)*actualDino1SpecialBleed)*10)/10.0;
        actualDino2SpecialWalkBleed = Math.round(((dino2GrowthState.getBleedWalkResist()/100)*actualDino1SpecialBleed)*10)/10.0;
        actualDino2SpecialRunBleed = Math.round(((dino2GrowthState.getBleedRunResist()/100)*actualDino1SpecialBleed)*10)/10.0;



        numberOfBites1 = ((int) (Math.ceil(dino2GrowthState.getHealth() / actualDino1Damage)));
        numberOfBites2 = ((int) (Math.ceil(dino1GrowthState.getHealth() / actualDino2Damage)));

        numberOfSpecials1 = ((int) (Math.ceil(dino2GrowthState.getHealth() / actualDino1SDamage)));
        numberOfSpecials2 = ((int) (Math.ceil(dino1GrowthState.getHealth() / actualDino2SDamage)));
    }

    public void prepareOutcome() {
        fighters = chosenDino1.getName() + " " + dino1GrowthState.getName() + " (" + dino1GrowthState.getHealth() + " Health)" + " VS " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " (" + dino2GrowthState.getHealth() + " Health)";
        if (chosenDino1 == chosenDino2 && dino1GrowthState == dino2GrowthState) {
            damageOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " Kills " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " with " + numberOfBites1 + " Basic Attacks. (" + actualDino1Damage + " Damage/hit)");

            if (numberOfSpecials1 <= 1000000) {
                damageOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " Kills " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " with " + numberOfSpecials1 + " Special Attacks. (" + actualDino1SDamage + " Damage/hit)");
            }
            if (dino1GrowthState.hasTrample()){
                damageOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " does " + actualDino1TrampleDamage + " trample damage to " + chosenDino2.getName() + " " + dino2GrowthState.getName());
            }

            if (dino1GrowthState.hasBleed()) {
                if (dino1GrowthState.hasBleed() && actualDino2StandBleed > 0) {
                    bleedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " inflicts " + actualDino2StandBleed + " bleed to " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " per bite with the basic attack. (" + actualDino2SitBleed + " Sitting)");
                }
                if (dino1GrowthState.hasSpecialBleed() && actualDino2SpecialStandBleed > 0) {
                    bleedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " inflicts " + actualDino2SpecialStandBleed + " bleed to " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " per bite with the special attack. (" + actualDino2SpecialSitBleed + " Sitting)");
                }
            }
            if (dino1GrowthState.getSpeed() == dino2GrowthState.getSpeed()) {
                speedOutcome.add("Both dinos have the same speed");
            }
            return;
        }
        damageOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " Kills " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " with " + numberOfBites1 + " Basic Attacks. (" + actualDino1Damage + " Damage/hit)");
        if (numberOfSpecials1 <= 1000000) {
            damageOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " Kills " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " with " + numberOfSpecials1 + " Special Attacks. (" + actualDino1SDamage + " Damage/hit)");
        }
        damageOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " Kills " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " with " + numberOfBites2 + " Basic Attacks. (" + actualDino2Damage + " Damage/hit)");
        if (numberOfSpecials2 <= 1000000) {
            damageOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " Kills " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " with " + numberOfSpecials2 + " Special Attacks. (" + actualDino2SDamage + " Damage/hit)");
        }
        if (dino1GrowthState.hasTrample()){
            damageOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " does " + actualDino1TrampleDamage + " trample damage to " + chosenDino2.getName() + " " + dino2GrowthState.getName());
        }
        if (dino2GrowthState.hasTrample()){
            damageOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " does " + actualDino2TrampleDamage + " trample damage to " + chosenDino1.getName() + " " + dino1GrowthState.getName());
        }
        if (!dino1GrowthState.hasBleed() && !dino2GrowthState.hasBleed()){
            bleedOutcome.add("There is no bleed in this fight");
        }
        if (dino1GrowthState.hasBleed() || dino2GrowthState.hasBleed()) {
            if (dino1GrowthState.hasBleed() && actualDino2StandBleed > 0) {
                bleedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " inflicts " + actualDino2StandBleed + " bleed to " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " per bite with the basic attack. (" + actualDino2SitBleed + " Sitting)");
            }
            if (dino2GrowthState.hasBleed() && actualDino1StandBleed > 0) {
                bleedOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " inflicts " + actualDino1StandBleed + " bleed to " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " per bite with the basic attack. (" + actualDino1SitBleed + " Sitting)");
            }
            if (dino1GrowthState.hasSpecialBleed() && actualDino2SpecialStandBleed > 0) {
                bleedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " inflicts " + actualDino2SpecialStandBleed + " bleed to " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " per bite with the special attack. (" + actualDino2SpecialSitBleed + " Sitting)");
            }
            if (dino2GrowthState.hasSpecialBleed() && actualDino1SpecialStandBleed > 0) {
                bleedOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " inflicts " + actualDino1SpecialStandBleed + " bleed to " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " per bite with the special attack. (" + actualDino1SpecialSitBleed + " Sitting)");
            }

        }
        if (dino1GrowthState.getSpeed() == dino2GrowthState.getSpeed()) {
            speedOutcome.add("Both dinos have the same speed");
        }
        if (dino1GrowthState.getSpeed() > dino2GrowthState.getSpeed()) {
            speedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " can outrun the " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " in speed.");
        }
        if (dino1GrowthState.getSpeed() < dino2GrowthState.getSpeed()) {
            speedOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " can outrun the " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " in speed.");
        }
        if (dino1GrowthState.getAmbush() > dino2GrowthState.getSpeed()) {
            speedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " can outrun the " + chosenDino2.getName() + " " + dino2GrowthState.getName() + "'s running speed in ambush.");
        }
        if (dino1GrowthState.getSpeed() < dino2GrowthState.getAmbush()) {
            speedOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " can outrun the " + chosenDino1.getName() + " " + dino1GrowthState.getName() + "'s running speed in ambush.");
        }
        if (dino1GrowthState.getAmbush() > dino2GrowthState.getAmbush() && (dino1GrowthState.hasAmbush() && dino2GrowthState.hasAmbush())){
            speedOutcome.add(chosenDino1.getName() + " " + dino1GrowthState.getName() + " can outrun the " + chosenDino2.getName() + " " + dino2GrowthState.getName() + " if they are both in ambush.");
        }
        if (dino1GrowthState.getAmbush() < dino2GrowthState.getAmbush() && (dino1GrowthState.hasAmbush() && dino2GrowthState.hasAmbush())){
            speedOutcome.add(chosenDino2.getName() + " " + dino2GrowthState.getName() + " can outrun the " + chosenDino1.getName() + " " + dino1GrowthState.getName() + " if they are both in ambush.");
        }
    }

    public List<String> prepareDinoInfo(String dinoName, String growthName) {
        List<String> dinoInfo = new LinkedList<>();
        dinoInfo.clear();
        Dino dino = dinosaurList.getDinoMap().get(dinoName);
        GrowthState growth = dino.getGrowthStates().get(growthName);
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


    private double actualDamage(double damage, double weight1, double weight2) {
        return damage * (weight1 / weight2);
    }

    public String getFighters() {
        return fighters;
    }
    public void resetFighters(){
        fighters = "";
    }

    public List<String> getDamageOutcome() {
        return damageOutcome;
    }

    public List<String> getBleedOutcome() {
        return bleedOutcome;
    }

    public List<String> getSpeedOutcome() {
        return speedOutcome;
    }

    public DinosaurList getDinosaurList() {
        return dinosaurList;
    }

    public Dino getChosenDino1() {
        return chosenDino1;
    }

    public Dino getChosenDino2() {
        return chosenDino2;
    }

    public GrowthState getDino1GrowthState() {
        return dino1GrowthState;
    }

    public GrowthState getDino2GrowthState() {
        return dino2GrowthState;
    }

    public double getActualDino1Damage() {
        return actualDino1Damage;
    }

    public double getActualDino2Damage() {
        return actualDino2Damage;
    }

    public double getActualDino1SDamage() {
        return actualDino1SDamage;
    }

    public double getActualDino2SDamage() {
        return actualDino2SDamage;
    }

    public double getActualDino1Bleed() {
        return actualDino1Bleed;
    }

    public double getActualDino2Bleed() {
        return actualDino2Bleed;
    }

    public int getNumberOfBites1() {
        return numberOfBites1;
    }

    public int getNumberOfBites2() {
        return numberOfBites2;
    }

    public int getNumberOfSpecials1() {
        return numberOfSpecials1;
    }

    public int getNumberOfSpecials2() {
        return numberOfSpecials2;
    }
}
