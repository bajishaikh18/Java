package FileHandling;
import java.io.*;
public class Buffer {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/OneDrive/Desktop/Baji.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
