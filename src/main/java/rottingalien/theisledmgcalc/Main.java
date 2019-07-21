package rottingalien.theisledmgcalc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import rottingalien.theisledmgcalc.dinoinfo.Dino;
import rottingalien.theisledmgcalc.dinoinfo.GrowthState;
import rottingalien.utils.Maths.FindMidValues;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "/src/main/resources/spring/config.xml"
                );



        Dino carnotaurus = (Dino) context.getBean("carnotaurus");

        for (GrowthState growthState : carnotaurus.getGrowthStateMap().values()){
            System.out.println(carnotaurus.getName() + " " + growthState.getName());
            for (Integer value: growthState.getDinoPropertyMap().values()) {
                System.out.println(value);
            }

        }
    }
}
