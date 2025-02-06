package Maps;
import java.util.*;
public class HashMapEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> employees = new HashMap<Integer, String>();
		System.out.println("Enter Number of Employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
	 	 	 int id = sc.nextInt();
	 	 	String name = sc.next();
			employees.put(id, name);
			System.out.println("Added ID: " + id + "-> " + name);
		}
		
		System.out.println("Enter the Employee ID:");
		int retriveId = sc.nextInt();
		if(employees.containsKey(retriveId)) {
			System.out.println("Employee Name: " + employees.get(retriveId));
		} else {
			System.out.println("Employee Not Found.");
		}
		
		System.out.println("Enter the Employee ID you want to Remove:");
		int remove = sc.nextInt();
		if(employees.containsKey(remove)) {
			System.out.println("Employee Removed: " + employees.remove(remove));;
		} else {
			System.out.println("Employee Not Found");
		}
		
		System.out.println("Employees Record: ");
		for(Map.Entry<Integer, String> ele : employees.entrySet()) {
			System.out.println("ID: " + ele.getKey() + " Value: " + ele.getValue());
		}
		sc.close();
	}
}
