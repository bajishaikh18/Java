package CompareTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return "Student name: " + name + "  Student age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer input

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            // Create a Student object and add it to the list
            students.add(new Student(name, age));
        }

        // Sort the list of students by age
        Collections.sort(students);

        // Print the sorted list
        for (Student ele : students) {
            System.out.println(ele);
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
