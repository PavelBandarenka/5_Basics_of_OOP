package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.TreasureHall;

/*
    Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    выбора сокровищ на заданную сумму.
 */

import java.util.HashMap;
import java.util.Map;

public class TreasureChest {
    private Map<String, Integer> heapOfTreasures = new HashMap<>();
    private final static int AMOUNT_OF_TREASURE = 100;

    protected Map<String, Integer> getHeapOfTreasures() {
        return heapOfTreasures;
    }

    protected void setHeapOfTreasures(Map<String, Integer> heapOfTreasures) {
        this.heapOfTreasures = heapOfTreasures;
    }

    public static int getAMOUNT_OF_TREASURE() {
        return AMOUNT_OF_TREASURE;
    }

    @Override
    public String toString() {
        return "TreasureChest{" +
                "heapOfTreasures=" + heapOfTreasures +
                '}';
    }
}
