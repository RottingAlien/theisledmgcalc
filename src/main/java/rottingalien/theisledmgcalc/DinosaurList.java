package rottingalien.theisledmgcalc;

import rottingalien.theisledmgcalc.wire.DINOSAURWire;
import rottingalien.theisledmgcalc.wire.carnivores.*;
import rottingalien.theisledmgcalc.wire.herbivores.*;

import java.util.HashMap;
import java.util.Map;

public class DinosaurList {

    private Map<String, Dino> dinoMap = new HashMap<>();

    public void makeList() {
        dinoMap.put("Carnotaurus", new CarnotaurusWire().wire());
        dinoMap.put("Dilophosaurus", new DilophosaurusWire().wire());
        dinoMap.put("Utahraptor", new UtahraptorWire().wire());
        dinoMap.put("Allosaurus", new AllosaurusWire().wire());
        dinoMap.put("Ceratosaurus", new CeratosaurusWire().wire());
        dinoMap.put("Suchomimus", new SuchomimusWire().wire());
        dinoMap.put("Giganotosaurus", new GiganotosaurusWire().wire());
        dinoMap.put("Tyrannosaurus", new TyrannosaurusWire().wire());

        dinoMap.put("Dryosaurus", new DryosaurusWire().wire());
        dinoMap.put("Gallimimus",new GallimimusWire().wire());
        dinoMap.put("Pachycephalosaurus", new PachycephalosaurusWire().wire());
        dinoMap.put("Diabloceratops", new DiabloceratopsWire().wire());
        dinoMap.put("Maiasaura", new MaiasauraWire().wire());
        dinoMap.put("Parasaurolophus", new ParasaurolophusWire().wire());
        dinoMap.put("Triceratops", new TriceratopsWire().wire());

        dinoMap.put("DINOSAUR", new DINOSAURWire().wire());

    }

    public Map<String, Dino> getDinoMap() {
        return dinoMap;
    }

}
