package Sets;
import java.util.*;
public class EqualHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<Integer>();
		int n1 = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n1;i++) {
			set1.add(sc.nextInt());
		}
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		int n2 = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n2;i++) {
			set2.add(sc.nextInt());
		}
		
		if(set1.equals(set2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
