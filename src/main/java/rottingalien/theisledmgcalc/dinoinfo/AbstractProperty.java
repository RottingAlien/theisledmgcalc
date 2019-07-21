package rottingalien.theisledmgcalc.dinoinfo;

public abstract class AbstractProperty {

    private String name;
    private double value;

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
