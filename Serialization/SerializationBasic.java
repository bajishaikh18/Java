package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class User implements Serializable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class SerializationBasic {
    public static void main(String[] args) {
        User user = new User("Baji", 22);
        try (FileOutputStream fileOut = new FileOutputStream("C:/Users/bajis/Downloads/Baji.ser");
             ObjectOutputStream Out = new ObjectOutputStream(fileOut)) {
            Out.writeObject(user);
            System.out.println("Serialized data is saved in Baji.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
