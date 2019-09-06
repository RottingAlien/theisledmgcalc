package rottingalien.theisledmgcalc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rottingalien.theisledmgcalc.dinos.DINOSAUR;
import rottingalien.theisledmgcalc.dinos.carnivores.*;
import rottingalien.theisledmgcalc.dinos.herbivores.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class DinosaurList {

    public String testText = "Test Success";
    private Map<String, Dino> dinoMap = new LinkedHashMap<>();

    public DinosaurList(){
        makeList();
    }

    void makeList() {
        dinoMap.put("Carnotaurus", new Carnotaurus());
        dinoMap.put("Dilophosaurus", new Dilophosaurus());
        dinoMap.put("Utahraptor", new Utahraptor());
        dinoMap.put("Allosaurus", new Allosaurus());
        dinoMap.put("Ceratosaurus", new Ceratosaurus());
        dinoMap.put("Suchomimus", new Suchomimus());
        dinoMap.put("Giganotosaurus", new Giganotosaurus());
        dinoMap.put("Tyrannosaurus", new Tyrannosaurus());
        dinoMap.put("Austroraptor", new Austroraptor());
        dinoMap.put("Herrerasaurus", new Herrerasaurus());
        dinoMap.put("Baryonyx", new Baryonyx());
        dinoMap.put("Spinosaurus", new Spinosaurus());
        dinoMap.put("Albertosaurus", new Albertosaurus());
        dinoMap.put("Acrocanthosaurus" , new Acrocanthosaurus());

        dinoMap.put("Dryosaurus", new Dryosaurus());
        dinoMap.put("Gallimimus", new Gallimimus());
        dinoMap.put("Pachycephalosaurus", new Pachycephalosaurus());
        dinoMap.put("Diabloceratops", new Diabloceratops());
        dinoMap.put("Maiasaura", new Maiasaura());
        dinoMap.put("Parasaurolophus", new Parasaurolophus());
        dinoMap.put("Triceratops", new Triceratops());
        dinoMap.put("Camarasaurus", new Camarasaurus());
        dinoMap.put("Shantungosaurus", new Shantungosaurus());
        dinoMap.put("Puertasaurus", new Puertasaurus());
        dinoMap.put("Ankylosaurus" , new Ankylosaurus());
        dinoMap.put("Stegosaurus" , new Stegosaurus());
        dinoMap.put("Therizinosaurus", new Therizinosaurus());

        //dinoMap.put("DINOSAUR", new DINOSAUR());

    }

    public Map<String, Dino> getDinoMap() {
        return dinoMap;
    }

}
