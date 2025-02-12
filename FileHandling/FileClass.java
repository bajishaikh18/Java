package FileHandling;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("C:/Users/bajis/Downloads/BufferOutEx.txt");

        //Exists
        System.out.println("Is File: " + file.exists());

        //isFile()
        System.out.println("Is File: " + file.isFile());

        //isDirectory
        System.out.println("Is Directory: " + file.isDirectory());

        //getAbsolutePath
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        //getPath
        System.out.println("Get Path: " + file.getPath());


    }
}
