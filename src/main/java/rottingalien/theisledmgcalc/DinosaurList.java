package rottingalien.theisledmgcalc;

import rottingalien.theisledmgcalc.wire.*;

import java.util.HashMap;
import java.util.Map;

public class DinosaurList {

    private Map<String,Dino> dinoMap = new HashMap<>();


    public void makeList(){
        dinoMap.put("Carnotaurus",new CarnotaurusWire().wire());
        dinoMap.put("Dilophosaurus", new DilophosaurusWire().wire());
        dinoMap.put("Utahraptor", new UtahraptorWire().wire());
        dinoMap.put("Allosaurus", new AllosaurusWire().wire());
        dinoMap.put("DINOSAUR", new DINOSAURWire().wire());
    }

    public Map<String,Dino> getDinoMap(){
        return dinoMap;
    }

}
