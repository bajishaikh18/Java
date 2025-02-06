package oneDimensionalArray;
import java.util.*;
public class Reverse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n = sc.nextInt();
		
		
		int arr1[] = new int[n];
		
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Original :" + Arrays.toString(arr1));
		
		int arr2[] = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			arr2[i] = arr1[n-i-1];
		}
		
		System.out.println("Reversed Array : " + Arrays.toString(arr2));
		sc.close();
	}
}
