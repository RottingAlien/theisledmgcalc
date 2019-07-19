package rottingalien.theisledmgcalc;

import java.util.Map;

public class DinoProperty {

    private String name;
    private double value;

    public DinoProperty(String name, Integer value){
        this.name=name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
