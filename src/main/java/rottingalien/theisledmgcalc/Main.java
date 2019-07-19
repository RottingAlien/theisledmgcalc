package rottingalien.theisledmgcalc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "/src/main/resources/spring/config.xml"
                );

        Dinos.CARNOTAURUS.addGrowth("freshJuvenile",GrowthState.FRESHJUVI);
        Dinos.CARNOTAURUS.getGrowthStateMap().get("freshJuvenile").getDinoPropertyMap().add(new DinoProperty("damage",50));

    }
}
