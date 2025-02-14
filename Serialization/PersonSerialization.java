package Serialization;

import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class PersonSerialization {
    public static void main(String[] args) {

        Person person = new Person("Asiya", 20);

        String path = "C:/Users/bajis/Downloads/Person.ser";

        try(FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ){
            out.writeObject(person);
            System.out.println("Serialized data is saved in Person.ser");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
