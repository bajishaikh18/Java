package Collections_SearchNsort;
import java.util.*;
public class BinarySearchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			nums.add(sc.nextInt());
		}
		
		System.out.println(Collections.binarySearch(nums, sc.nextInt()));
		sc.close();
	}
}
