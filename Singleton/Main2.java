package Singleton;

class Student {
	private static Student instance;
	
	private Student() {
		System.out.println("Stduent is Studying");
	}
	
	public static Student getStudent() {
		if (instance == null) {
			instance = new Student();
		}
		return instance;
	}
	
	public void study() {
		System.out.println("The Student is studying");
	}
}

public class Main2 {
public static void main(String[] args) {
	Student s1 = Student.getStudent();
	s1.study();
	
	Student s2 = Student.getStudent();
	s2.study();
	
	System.out.println("Is s1 the same as s2? " + (s1 == s2));
}
}
