package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.ItemsTransmutationHall;

import by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.TreasureHall.TreasureChest;

import java.util.HashMap;
import java.util.Map;

public class Alchemist {
    public Alchemist(){
    }


    private final TransmutationTable transmutationTable = new TransmutationTable();
    private final Map <String, Integer> alchemistChest = new HashMap<>();
    private boolean checkItems(Map<String, Integer> distiller){
        return !alchemistChest.containsKey(distiller.get(0));
    }

    public void transmuteTreasure() {
        while (alchemistChest.size() < TreasureChest.getAMOUNT_OF_TREASURE()) {
            Map<String, Integer> distiller = transmutationTable.generateItems();
            if (checkItems(distiller)) {
                alchemistChest.putAll(distiller);
            }
        }
    }
    public Map <String, Integer> putTreasure(){
        return alchemistChest;
    }
}
