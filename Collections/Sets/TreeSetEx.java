package Sets;
import java.util.TreeSet;
import java.util.Scanner;
public class TreeSetEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> names = new TreeSet<String>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			names.add(sc.next().toLowerCase());
		}
		
		for(String name:names) {
			System.out.print(name + " ");
		}
		
		System.out.println("\nNumber of Unique: " + names.size());
		sc.close();
	}
}
