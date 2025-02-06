package Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			int element = sc.nextInt();
			nums.add(element);
		}
		
		System.out.println("Size of the ArrayList: " + nums.size());
		
		System.out.print("Elements: ");
		for(int ntg:nums) {
			System.out.print(ntg + " ");
		}
		
		System.out.println("");
		
		
		System.out.println(nums.get(2));
		sc.close();
	}
}
