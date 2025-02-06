package Sets;
import java.util.*;

public class UnionIntersectionDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n1 = sc.nextInt();
		sc.nextLine();
		TreeSet<String> set1 = new TreeSet<String>();
		for(int i=0;i<n1;i++) {
			set1.add(sc.next());
		}
		
		int n2 = sc.nextInt();
		sc.nextLine();
		TreeSet<String> set2 = new TreeSet<String>();
		for(int i=0;i<n2;i++) {
			set2.add(sc.next());
		}
		
		TreeSet<String> unionSet = new TreeSet<String>(set1);
		unionSet.addAll(set2);
		print(unionSet);
		
		TreeSet<String> IntersectionSet = new TreeSet<String>(set1);
		IntersectionSet.retainAll(set2);
		print(IntersectionSet);
		
		TreeSet<String> DiffSet = new TreeSet<String>(set1);
		DiffSet.removeAll(set2);
		print(DiffSet);	
		sc.close();
	}
	
	private static void print(TreeSet<String> names) {
		if(names.isEmpty()) {
			System.out.println("NOTHING IS PRESENT");
		} else {
			for(String ele:names) {
				System.out.print(ele + " ");
			}
			System.out.println("");
		}
	}
}