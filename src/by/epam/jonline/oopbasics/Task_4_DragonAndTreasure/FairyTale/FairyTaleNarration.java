package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.FairyTale;

import by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.ItemsTransmutationHall.Alchemist;
import by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.TreasureHall.TreasureKeeper;

import java.util.Scanner;

/*
    Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    выбора сокровищ на заданную сумму.
 */

public class FairyTaleNarration {
    Alchemist alchemist;
    TreasureKeeper keeper;

    public FairyTaleNarration(){
        alchemist= new Alchemist();
        alchemist.transmuteTreasure();
        keeper = new TreasureKeeper();
        keeper.replenishTheTreasury(alchemist.putTreasure());
    }

    private int menu(Scanner key) {

        System.out.println("DRAGON'S LAIR");
        System.out.println("Please, choose your option");
        System.out.println("1) Look at the treasure");
        System.out.println("2) Find a priceless treasure");
        System.out.println("3) Buy treasure");
        System.out.println("4) Leave dragons lair");
        System.out.println("----------------------");

        int choice;

        do{
            System.out.print("Enter your choice: -> ");
            choice = key.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }

    public void waitForPilgrimsChoice(Scanner key){
        int choice;
        do {
            choice = menu(key);
            System.out.println();
            if(choice == 1){
                keeper.checkTreasure();
            }
            if(choice == 2){
                keeper.findPricelessTreasure();
            }
            if(choice == 3){
                int gold = enterSumOfGold(key);
                keeper.pileUpABunchOfGoodsForSale(gold);
            }
            if(choice == 4){
                System.out.print("Bye bye! )");
            }
        } while (choice !=4);
    }

    private int enterSumOfGold(Scanner key){

        int choice;
        do{
            System.out.print("Enter gold amount -> ");
            choice = key.nextInt();
        } while (choice == 0 || choice <0);
        return choice;
    }

}
