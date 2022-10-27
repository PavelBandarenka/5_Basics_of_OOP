package by.epam.jonline.oopbasics.Task_1_TextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryExample {

    /*
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    вывести на консоль содержимое, дополнить, удалить.
     */

    Path path;

    public void createDir (String dirPath){
        try {
            path = Path.of(dirPath);
            if(checkIfDirExists()) {
                Files.createDirectory(path);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean checkIfDirExists(){
        if (Files.exists(path)){
            System.out.println("Directory already exists!");
            return false;
        } else {
            return true;
        }
    }
    public Path getDirectoryPath() {
        return path;
    }
}

