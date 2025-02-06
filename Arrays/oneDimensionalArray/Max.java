package oneDimensionalArray;
import java.util.*;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size of the array: ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter your " + i + " element: ");
			arr[i] = sc.nextInt();
			}
		
		System.out.print("Array: [");
		for(int i =0; i<=arr.length-1;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		System.out.println("Max: " + findMax(arr));
		sc.close();
	}
	
	public static int findMax(int arr[]) {
		int max = arr[0];
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}
