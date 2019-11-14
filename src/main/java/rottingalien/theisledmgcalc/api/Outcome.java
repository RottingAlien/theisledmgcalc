package rottingalien.theisledmgcalc.api;

import java.util.List;

public class Outcome {

    String dino1Name;
    String dino2Name;

    double dino1Health;
    double dino2Health;

    public double getDino1Health() {
        return dino1Health;
    }

    public void setDino1Health(double dino1Health) {
        this.dino1Health = dino1Health;
    }

    public double getDino2Health() {
        return dino2Health;
    }

    public void setDino2Health(double dino2Health) {
        this.dino2Health = dino2Health;
    }

    List<String> damageOutcome;
    List<String> bleedOutcome;
    List<String> speedOutcome;

    public List<String> getDamageOutcome() {
        return damageOutcome;
    }

    public void setDamageOutcome(List<String> damageOutcome) {
        this.damageOutcome = damageOutcome;
    }

    public List<String> getBleedOutcome() {
        return bleedOutcome;
    }

    public void setBleedOutcome(List<String> bleedOutcome) {
        this.bleedOutcome = bleedOutcome;
    }

    public List<String> getSpeedOutcome() {
        return speedOutcome;
    }

    public void setSpeedOutcome(List<String> speedOutcome) {
        this.speedOutcome = speedOutcome;
    }

    public String getDino1Name() {
        return dino1Name;
    }

    public String getDino2Name() {
        return dino2Name;
    }

    public void setDino1Name(String dino1Name) {
        this.dino1Name = dino1Name;
    }

    public void setDino2Name(String dino2Name) {
        this.dino2Name = dino2Name;
    }

}
