package rottingalien.theisledmgcalc;

import rottingalien.theisledmgcalc.wire.CarnotaurusWire;
import rottingalien.theisledmgcalc.wire.DINOSAURWire;
import rottingalien.theisledmgcalc.wire.DilophosaurusWire;

import java.util.HashMap;
import java.util.Map;

public class DinosaurList {

    DilophosaurusWire

    private Map<String,Dino> dinoMap = new HashMap<>();


    public void makeList(){
        dinoMap.put("Carnotaurus",new CarnotaurusWire().wireCarnotaurus());
        dinoMap.put("DINOSAUR", new DINOSAURWire().wireDINOSAUR());
        dinoMap.put("Dilophosaurus", new DilophosaurusWire())
    }

    public Map<String,Dino> getDinoMap(){
        return dinoMap;
    }

}
