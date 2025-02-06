package Sets;
import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		for(int i=0;i<n;i++) {
			nums.add(sc.nextInt());
		}
		
		for(Integer ele:nums) {
			System.out.print(ele + " ");
		}
		sc.close();
	}
}
