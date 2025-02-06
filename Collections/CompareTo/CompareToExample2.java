package CompareTo;
import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CompareToExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            persons.add(new Person(name, age));
        }

        // Sort the list of persons by age
        Collections.sort(persons);

        System.out.println("Persons according to their age:");
        for (Person person : persons) {
            System.out.println(person);
        }
        sc.close();
    }
}
