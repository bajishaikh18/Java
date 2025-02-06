package oneDimensionalArray;
import java.util.*;
public class LongestSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int longestStreak = 0;
		int currentStreak = 0;
		
		for(int i=1;i<n;i++) {
			
			if(arr[i] == arr[i-1]+1) {
				currentStreak++;
			} else {
				currentStreak = 1;
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}	
		longestStreak = Math.max(longestStreak, currentStreak);

		System.out.println(longestStreak);
		sc.close();
	}
}
