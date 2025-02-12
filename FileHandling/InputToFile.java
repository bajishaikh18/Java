package FileHandling;

import java.io.*;
import java.util.Scanner;

public class InputToFile {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/Downloads/BufferOutEx.txt";
        try (Scanner sc = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            System.out.println("Enter text to save to file (type 'exit' to finish):");

            String input;

            while (!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
