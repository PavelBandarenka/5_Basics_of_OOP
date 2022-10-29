package by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.Main;

/*
    Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    выбора сокровищ на заданную сумму.
 */

import by.epam.jonline.oopbasics.Task_4_DragonAndTreasure.FairyTale.FairyTaleNarration;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        FairyTaleNarration fairyTale = new FairyTaleNarration();
        Scanner scanner = new Scanner(System.in);
        fairyTale.waitForPilgrimsChoice(scanner);

    }
}
