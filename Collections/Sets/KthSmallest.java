package Sets;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
public class KthSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		for(int i=0;i<n;i++) {
			nums.add(sc.nextInt());
		}
		
		int k = sc.nextInt();
		
		System.out.println("Nums: " + nums);
		
		ArrayList<Integer> num = new ArrayList<Integer>(nums);
		
		System.out.println(num.get(k-1));
		sc.close();
	}
}
