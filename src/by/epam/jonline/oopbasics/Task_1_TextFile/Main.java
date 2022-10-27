package by.epam.jonline.oopbasics.Task_1_TextFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

    /*
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    вывести на консоль содержимое, дополнить, удалить.
     */

    DirectoryExample dir1 = new DirectoryExample();
    TextFile textFile = new TextFile();

    dir1.createDir("NewFolder");

    textFile.createFile(dir1.getDirectoryPath());

    textFile.setText("This is a new text");

    textFile.renameFile("SomeText");

    textFile.printFileText();

    textFile.addTextToFile(" Lets add some text");

    textFile.printFileText();

    textFile.deleteFile();
    }
}