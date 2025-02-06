package Lists;
import java.util.LinkedList;
import java.util.Scanner;
public class getFirstgetLastEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		LinkedList<String> names = new LinkedList<String>();
		for(int i=0;i<n;i++) {
			String name = sc.nextLine();
			names.add(name);
		}
		
		System.out.println("First Attendee: " + names.getFirst());
		System.out.println("Last Attendee: " + names.getLast());
		
		System.out.println("Number of Attendees: " + names.size());
		System.out.println("Attendees:");
		for(String ele:names) {
			System.out.println("-" + ele);
		}
		sc.close();
	}
}
