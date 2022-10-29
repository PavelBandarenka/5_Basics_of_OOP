package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.TreasureHall;

import java.util.*;

/*
    Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    выбора сокровищ на заданную сумму.
 */

public class TreasureKeeper {

    private final TreasureChest treasureChest;

    public TreasureKeeper(){
        this.treasureChest = new TreasureChest();
    }

    public void replenishTheTreasury (Map<String, Integer> heapOfTreasures){
       this.treasureChest.setHeapOfTreasures(heapOfTreasures);
    }

    public void checkTreasure(){
        int i = 0;
        System.out.println("Dragon treasures are: ");
        for (Map.Entry<String, Integer> each: treasureChest.getHeapOfTreasures().entrySet()){
            i++;
            System.out.println("item " + i + ": " + each.getKey() + ", price: " + each.getValue());
        }
        System.out.println("--------------------------------");

    }

    public void findPricelessTreasure() {
        int cost = 0;
        String name = "";
        for (Map.Entry<String, Integer> each : treasureChest.getHeapOfTreasures().entrySet()) {
            if(each.getValue() > cost){
                cost = each.getValue();
                name = each.getKey();
            }
        }
        System.out.println("The most expensive treasure is: " +  name + " , cost: " + cost );
        System.out.println("--------------------------------");
    }

    public void pileUpABunchOfGoodsForSale (int gold){
        var entries = treasureChest.getHeapOfTreasures().entrySet().stream().map(Map.Entry::copyOf).toList();
        entries = tormentOfChoice(gold, entries);
        System.out.println("This is your treasure, Sir. Deposit < " + gold + " > gold please.");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Item: " + entry.getKey() + ", cost: " + entry.getValue() + " gold");
        }
        System.out.println("--------------------------------");
        }

    private List<Map.Entry<String, Integer>> tormentOfChoice(int totalPrice, List<Map.Entry<String, Integer>> entries){
        List<Map.Entry<String, Integer>> heapOfThings = new ArrayList<>();
        List<Integer> duplicateRegistration = new ArrayList<>();
        Random random = new Random();
        int sum = 0;
        while (sum!=totalPrice){
            int entryIndex = random.nextInt(entries.size());
            int temp = entries.get(entryIndex).getValue();
            sum+= temp;
            if(!duplicateRegistration.contains(temp)){
                duplicateRegistration.add(temp);
                heapOfThings.add(entries.get(entryIndex));
            }

            if(sum>totalPrice){
                sum = 0;
                heapOfThings.clear();
                duplicateRegistration.clear();
            }
        }

        return heapOfThings;
    }
}
