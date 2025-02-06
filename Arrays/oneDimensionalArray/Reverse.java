package oneDimensionalArray;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter " + arr.length + " elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Original Array: ");
		System.out.println(Arrays.toString(arr));
		
		int arr2[] = new int[arr.length];
		int j = arr2.length-1;
		
		for(int i=0;i<=arr.length-1;i++) {
			arr2[j] = arr[i];
			j--;
		}
		
		System.out.print("Reverse Array: ");
		System.out.println(Arrays.toString(arr2));
		sc.close();
	}
}
