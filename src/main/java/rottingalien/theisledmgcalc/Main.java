package rottingalien.theisledmgcalc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "/src/main/resources/spring/config.xml"
                );

        Dino carnotaurus = (Dino) context.getBean("carnotaurus");

        System.out.println(carnotaurus.getGrowthStateMap().get("freshJuvi").getDinoPropertyMap().get("health"));
        System.out.println(carnotaurus.getGrowthStateMap().get("fullJuvi").getDinoPropertyMap().get("health"));
        //AbstractDino.CARNOTAURUS.addGrowth("freshJuvenile",AbstractGrowthState.FRESHJUVI);
        //AbstractDino.CARNOTAURUS.getGrowthStateMap().get("freshJuvenile").addDinoProperty("Weight",AbstractDinoProperty.WEIGHT);

    }
}
