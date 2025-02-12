package FileHandling;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/OneDrive/Desktop/Baji.txt";
        try(FileInputStream input = new FileInputStream(path)){
            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
