package rottingalien.theisledmgcalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rottingalien.theisledmgcalc.Dino;
import rottingalien.theisledmgcalc.FightSimulator;
import rottingalien.theisledmgcalc.api.Outcome;

import java.util.List;
import java.util.Map;


@Controller
public class IsleController {


    private FightSimulator fightSimulator;

    @Autowired
    public void setFightSimulator(FightSimulator fightSimulator) {
        this.fightSimulator = fightSimulator;
    }

    /*
    @GetMapping("api/{dino1}/{dino1Growth}/{dino2}/{dino2Growth}")
    public Map<String,String > home(@PathVariable String dino1, @PathVariable String dino1Growth, @PathVariable String dino2, @PathVariable String dino2Growth, Model model) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }
    */

    @GetMapping("/fight")
    public String fight(Model model, @RequestParam("dino1") String dino1, @RequestParam(value = "dino1Growth", defaultValue = "Full Adult") String dino1Growth, @RequestParam("dino2") String dino2, @RequestParam(value = "dino2Growth", defaultValue = "Full Adult") String dino2Growth) {
        fightSimulator.resetFighters();
        fightSimulator.getDamageOutcome().clear();
        fightSimulator.getBleedOutcome().clear();
        fightSimulator.getSpeedOutcome().clear();
        fightSimulator.fight(dino1, dino1Growth, dino2, dino2Growth);
        fightSimulator.prepareOutcome();
        model.addAttribute("fighters", fightSimulator.getFighters());
        model.addAttribute("damageResults", fightSimulator.getDamageOutcome());
        model.addAttribute("bleedResults", fightSimulator.getBleedOutcome());
        model.addAttribute("speedResults", fightSimulator.getSpeedOutcome());
        model.addAttribute("dino1", dino1);
        model.addAttribute("dino2", dino2);
        model.addAttribute("growth1", dino1Growth);
        model.addAttribute("growth2", dino2Growth);
        model.addAttribute("dino1pic", fightSimulator.getChosenDino1().getGrowthStates().get(dino1Growth).getImage());
        model.addAttribute("dino2pic", fightSimulator.getChosenDino2().getGrowthStates().get(dino2Growth).getImage());

        model.addAttribute("dino1Info", fightSimulator.prepareDinoInfo(dino1, dino1Growth));
        model.addAttribute("dino2Info", fightSimulator.prepareDinoInfo(dino2, dino2Growth));
        return "fight";
    }

    @GetMapping(value = "/apifight", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Outcome fightApi(@RequestParam("dino1") String dino1, @RequestParam("dino2") String dino2) {
        Outcome outcome = new Outcome();
        fightSimulator.resetFighters();
        fightSimulator.getDamageOutcome().clear();
        fightSimulator.getBleedOutcome().clear();
        fightSimulator.getSpeedOutcome().clear();
        fightSimulator.fight(dino1, "Full Adult", dino2, "Full Adult");
        fightSimulator.prepareOutcome();
        outcome.setDamageOutcome(fightSimulator.getDamageOutcome());
        outcome.setBleedOutcome(fightSimulator.getBleedOutcome());
        outcome.setSpeedOutcome(fightSimulator.getSpeedOutcome());
        outcome.setDino1Name(dino1);
        outcome.setDino2Name(dino2);
        outcome.setDino1Health(fightSimulator.getChosenDino1().getGrowthStates().get("Full Adult").getHealth());
        outcome.setDino2Health(fightSimulator.getChosenDino2().getGrowthStates().get("Full Adult").getHealth());

        return outcome;
    }

    @GetMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Dino api(@RequestParam("dino") String dino) {
        return fightSimulator.getDinosaurList().getDinoMap().get(dino);
    }

    @GetMapping(value = "/apidinolist", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Dino> apiDinoList() {
        return fightSimulator.getDinosaurList().getDinoMap();
    }

    @GetMapping(value = "/apidinolist/herbivores", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Dino> apiHerbivoreList() {
        return fightSimulator.getDinosaurList().getHerbivoresList();
    }

    @GetMapping(value = "/apidinolist/carnivores", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Dino> apiCarnivoreList() {
        return fightSimulator.getDinosaurList().getCarnivoresList();
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("dinoMap", fightSimulator.getDinosaurList());
        model.addAttribute("carnieList", fightSimulator.getDinosaurList().getCarnivoresList());
        model.addAttribute("herbieList", fightSimulator.getDinosaurList().getHerbivoresList());
        return "index";
    }

}
