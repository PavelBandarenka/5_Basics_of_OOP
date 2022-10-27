package by.epam.jonline.oopbasics.Task_1_TextFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TextFile extends FileExample {

    /*
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    вывести на консоль содержимое, дополнить, удалить.
     */

    private String text;

    @Override
    public void createFile(Path dirPath) {
        setFileType("txt");
        super.createFile(dirPath);
    }
    public void setText(String text) {
        this.text = text;
    }
    public void renameFile(String name){
        File fileDestination = new File(getFileDir() + "\\" + name + ".txt");
        File fileSource = new File(String.valueOf(this.getFilePath()));

        boolean isSuccess = fileSource.renameTo(fileDestination);
        this.setFileName(name);
        this.setFilePath(getFileDir());
        this.setFileType("txt");
        this.addTypeToFile();

        if(isSuccess){
            System.out.println("File name: " + fileSource.getName() + " successfully renamed to: " + fileDestination.getName());
        }
        try(FileWriter fileWriter = new FileWriter(fileDestination)) {
            fileWriter.write(this.text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void printFileText () {
        try {
            List<String> list = Files.readAllLines(this.getFilePath());
            for (String each : list){
                System.out.println(each);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addTextToFile(String text){
        try {
            Files.write(Paths.get(String.valueOf(getFilePath())),text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteFile(){
        File fileToDelete = new File(String.valueOf(this.getFilePath()));
        if(fileToDelete.delete()){
            System.out.println("File successfully deleted!");
        } else {
            System.out.println("We got some problems while deleting file!");
        }
    }
}
