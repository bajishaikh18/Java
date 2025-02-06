package Sets;
import java.util.*;
public class SumOfTwoLargeElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		TreeSet<Integer> t = new TreeSet<Integer>();

		for (int i = 0 ; i < n ; i++) {
			t.add(sc.nextInt());
		}
		
		ArrayList<Integer> nums = new ArrayList<Integer>(t);
		
		if(nums.get(0) > 0) {
			System.out.println((t.pollLast()) * (t.pollLast()));
		} else {
			System.out.println(nums.get(0) * nums.get(1));
		}
		sc.close();
		
	}
}
