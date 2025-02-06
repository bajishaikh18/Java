package Maps;
import java.util.*;
public class LinkedHashMapExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		LinkedHashMap<Integer, String> students = new LinkedHashMap<Integer, String>();
		
		for(int i=0;i<n;i++) {
			int roll = sc.nextInt();
			String name = sc.next();
			students.put(roll, name);
			System.out.println("Added Succesfully.");
		}
		
		int retrive = sc.nextInt();
		if(students.containsKey(retrive)) {
			System.out.println("Student Name: " + students.get(retrive));
		} else {
			System.out.println("Student Not Found.");
		}
		
		int remove = sc.nextInt();
		if(students.containsKey(remove)) {
			System.out.println("Student Removed: " + students.remove(remove));
		} else {
			System.out.println("Student Not Found.");
		}
		
		System.out.println("List Of Students");
		for(Map.Entry<Integer, String> ele:students.entrySet()) {
			System.out.println("Roll Number: " + ele.getKey() + " Name: " + ele.getValue());
		}
		sc.close();
	}
}
