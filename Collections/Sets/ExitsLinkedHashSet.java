package Sets;
import java.util.*;
public class ExitsLinkedHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		for(int i=0;i<n;i++) {
			names.add(sc.next());
		}
		
		String name = sc.next();
		
		if(names.contains(name)) {
			System.out.println("Exists");
		} else {
			System.out.println("Does not Exists");
		}
		sc.close();
	}
}
