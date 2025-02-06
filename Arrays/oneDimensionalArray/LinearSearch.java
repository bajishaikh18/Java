package oneDimensionalArray;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Elements of the Array :");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Target :");
		int target = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				System.out.println("The target found at : " + i);
			}
		}
		System.out.println("Not Found");
		sc.close();
	}
}
