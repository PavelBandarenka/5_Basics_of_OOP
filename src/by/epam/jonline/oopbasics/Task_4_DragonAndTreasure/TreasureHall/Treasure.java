package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.TreasureHall;

import java.util.List;

public class Treasure {
    private static final List<String> variety = List.of("Ring","Trinket","Cup","Necklace","Crown","Bracers","Sword","Shield","Vase","Orb");

    public static List<String> getVariety() {
        return variety;
    }
}
