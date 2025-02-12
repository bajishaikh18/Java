package FileHandling;

import java.io.*;

public class BufferOut {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/Downloads/BufferOutEx.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("This is First Line");
            writer.newLine();
            writer.write("This is Second Line..");
            System.out.println("Content Writted Succesfully to " + path);
        } catch (IOException e) {
            System.out.println("An Error Ocuured While Writing the Files..");
            e.printStackTrace();
        }
    }
}
