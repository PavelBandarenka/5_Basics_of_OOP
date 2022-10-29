package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.ItemsTransmutationHall;

import by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.TreasureHall.Treasure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TransmutationTable {
    Random random = new Random();


        Map<String, Integer> generateItems(){
        Map<String, Integer> map = new HashMap<>();
        int rangeInItems = random.nextInt(Treasure.getVariety().size());
        int rangeInQuality = random.nextInt(TransmutationRecipes.getQuality().size());
        map.put((TransmutationRecipes.getQuality().get(rangeInQuality) + Treasure.getVariety().get(rangeInItems)), rangeInItems+rangeInQuality);
        return map;
    }
}
