package oneDimensionalArray;
import java.util.*;
public class CountPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array :");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		
		System.out.println("Enter the Elements of the Array : ");
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println("Enter the Target : ");
		int x = sc.nextInt();
		
		int count = 0;
		
		for(int i=0;i<n;i++) {
			for(int j= i+1;j<n;j++) {
				if(nums[i] + nums[j] == x) {
					count++;
				}
			}
		}
		
		System.out.println("The Count : "+count);
		sc.close();
	}
}
