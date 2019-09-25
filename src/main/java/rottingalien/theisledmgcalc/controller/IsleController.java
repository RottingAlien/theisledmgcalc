package rottingalien.theisledmgcalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rottingalien.theisledmgcalc.FightSimulator;


@Controller
public class IsleController {



    private FightSimulator fightSimulator;

    @Autowired
    public void setFightSimulator(FightSimulator fightSimulator) {
        this.fightSimulator = fightSimulator;
    }

    @GetMapping("/{dino1}/{dino1Growth}/{dino2}/{dino2Growth}")
    public String home(@PathVariable String dino1, @PathVariable String dino1Growth,@PathVariable String dino2, @PathVariable String dino2Growth, Model model) {
        fightSimulator.fight(dino1,dino1Growth,dino2,dino2Growth);
        model.addAttribute("fightResults",fightSimulator);
        return "fight";
    }

    @GetMapping("/fight")
    public String home( Model model, @RequestParam("dino1") String dino1, @RequestParam(value = "dino1Growth",defaultValue = "Full Adult") String dino1Growth,@RequestParam("dino2") String dino2, @RequestParam(value = "dino2Growth",defaultValue = "Full Adult") String dino2Growth) {
        fightSimulator.resetFighters();
        fightSimulator.getDamageOutcome().clear();
        fightSimulator.getBleedOutcome().clear();
        fightSimulator.getSpeedOutcome().clear();
        fightSimulator.fight(dino1,dino1Growth,dino2,dino2Growth);
        fightSimulator.prepareOutcome();
        model.addAttribute("fighters",fightSimulator.getFighters());
        model.addAttribute("damageResults", fightSimulator.getDamageOutcome());
        model.addAttribute("bleedResults", fightSimulator.getBleedOutcome());
        model.addAttribute("speedResults", fightSimulator.getSpeedOutcome());
        model.addAttribute("dino1",dino1);
        model.addAttribute("dino2",dino2);
        model.addAttribute("growth1",dino1Growth);
        model.addAttribute("growth2",dino2Growth);

        model.addAttribute("dino1Info",fightSimulator.prepareDinoInfo(dino1,dino1Growth));
        model.addAttribute("dino2Info", fightSimulator.prepareDinoInfo(dino2, dino2Growth));
        return "fight";
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("dinoMap",fightSimulator.getDinosaurList());
        model.addAttribute("carnieList", fightSimulator.getDinosaurList().getCarnivoresList());
        model.addAttribute("herbieList",fightSimulator.getDinosaurList().getHerbivoresList());
        return "index";
    }

}
