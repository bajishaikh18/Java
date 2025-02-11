package FileHandling;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/OneDrive/Desktop/Scores.txt";

        try (DataOutputStream op = new DataOutputStream(new FileOutputStream(path))) {

            op.writeInt(23);
            op.writeInt(20);
            op.writeInt(1020);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream ip = new DataInputStream(new FileInputStream(path))) {
            while (ip.available() > 0) {
                System.out.println(ip.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
