package Sets;
import java.util.*;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		for(int i=0;i<n;i++) {
			names.add(sc.next());
		}
		System.out.println("Size of LinkedHashSet: " + names.size());
		System.out.println("Elements of LinkedHashSet: " + names);
		
		sc.close();
		
	}
}
