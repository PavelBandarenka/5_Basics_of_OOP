package by.epam.jonline.oopbasics.Task_1_TextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {

    /*
        Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
        вывести на консоль содержимое, дополнить, удалить.
         */
    private String fileName;
    private Path filePath;
    private Path fileDir;
    private String fileType;

    FileExample () {
        fileName = "newFile";
    }

    public void createFile(Path dirPath){
        try {
            fileDir = dirPath;
            setFilePath(fileDir);
            addTypeToFile();
            if(checkIfFileExists()){
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    protected void setFilePath(Path dirPath){
        filePath = Path.of(dirPath + "\\" + fileName);
    }
    protected void addTypeToFile(){
        filePath = Path.of(filePath + "." + fileType);
    }
    private boolean checkIfFileExists(){
        if (Files.exists(filePath)){
            System.out.println("File already exists!");
            return false;
        } else {
            return true;
        }
    }
    protected void setFileType(String fileType) {this.fileType = fileType;}
    public void setFileName(String fileName) {this.fileName = fileName;}
    public Path getFilePath() {return filePath;}
    public Path getFileDir() {return fileDir;}

}

