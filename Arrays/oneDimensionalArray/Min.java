package oneDimensionalArray;
import java.util.*;

public class Min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size of the array: ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter your " + i + " element: ");
			arr[i] = sc.nextInt();
			}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Min: " + findMin(arr));
		sc.close();
	}
	
	public static int findMin(int arr[]) {
		int min = arr[0];
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}
