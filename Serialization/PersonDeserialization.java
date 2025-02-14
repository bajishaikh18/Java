package Serialization;

import java.io.*;
import java.lang.ClassNotFoundException;

public class PersonDeserialization {
    public static void main(String[] args) {

        String path = "C:/Users/bajis/Downloads/Person.ser";

        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Person person = (Person) in.readObject();
            System.out.println("Deserialized User: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
