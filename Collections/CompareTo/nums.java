package CompareTo;
import java.util.*;
public class nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Elements: ");
		int[] nums = new int[n];
		
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		
		System.out.println("Num in Reverse: ");
		for(int i=n-1;i>=0;i--) {
			System.out.print( nums[i] + " ");
		}
		sc.close();
	}
}
