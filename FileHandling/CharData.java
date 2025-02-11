package FileHandling;
import java.io.*;
public class CharData {
    public static void main(String[] args) {
        try {
            FileReader ip = new FileReader("C:/Users/bajis/OneDrive/Desktop/Baji.txt");
            FileWriter op = new FileWriter("C:/Users/bajis/OneDrive/Desktop/NewBaji.txt");

            int charData;
            while ((charData = ip.read()) != -1) {
                op.write(charData);
            }

            ip.close();
            op.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
