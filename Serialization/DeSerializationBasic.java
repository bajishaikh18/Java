package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.IOException;

public class DeSerializationBasic {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/Downloads/Baji.ser";
        ;
        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            User user = (User) in.readObject();
            System.out.println("Deserialized User: " + user.getName() + " Age: " + user.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
