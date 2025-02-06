package Sets;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.SortedSet;
public class subSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> prices = new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			prices.add(sc.nextInt());
		}
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		SortedSet<Integer> result = prices.subSet(min, true, max, true);
		
		if(result.isEmpty()) {
			System.out.println("No Products");
		} else {
			for(Integer ele: result) {
				System.out.print(ele + " ");
			}
		}
		sc.close();
	}
}
