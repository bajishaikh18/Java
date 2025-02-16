package Annotations;

class Animal {
    public void makeSound() {  // Renamed to camelCase
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {  // Renamed to camelCase
        System.out.println("Boww Bow");
    }
}

public class OverRideAnnotation {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();  // Output: "Boww Bow"
    }
}