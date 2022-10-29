package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.ItemsTransmutationHall;

import java.util.List;

public class TransmutationRecipes {

    private static final List<String> quality = List.of("wooden","tin","copper","silver","golden","thorium","dwarves","elven","diamond","heaven");

    static List<String> getQuality() {
        return quality;
    }
}
