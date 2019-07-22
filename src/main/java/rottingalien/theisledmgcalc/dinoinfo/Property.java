package rottingalien.theisledmgcalc.dinoinfo;

public enum Property {

    BLEEDSTANDRESIST("Standing Bleed Resistance"),
    BLEEDSITRESIST("Sitting Bleed Resistance"),
    BLEEDWALKRESIST("Walking Bleed Resistance"),
    BLEEDRUNRESIST("Running Bleed Resistance"),
    WEIGHT("Weight"),
    HEALTH("Health"),
    BITEFORCE("Bite Force"),
    BLEED("Bleed Damage");

    private String name;
    private double value;

    Property(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }


}
