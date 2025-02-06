package oneDimensionalArray;
import java.util.*;

public class Reverse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//SIZE OF ARRAY;
		System.out.println("Enter the size of the array: ");
		int arr[] = new int[sc.nextInt()];
		
		//INSERTING ELEMENTS;
		System.out.println("Enter your " + arr.length + " elements");
		for(int i = 0; i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		//PRINTING ORIGINAL ARRAY;
		System.out.print("Original Array: [");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		
		//Reversing an array;
		int arr2[] = new int[arr.length];
		int j = arr2.length-1;
		
		for(int i =0; i<=arr2.length-1;i++) {
			arr2[j] = arr[i];
			j--;
		}
		
		//Printing the reversed array
		System.out.print("Reversed Array: [");
		
		for(int i =0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]);
			if(i<arr2.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		sc.close();
	}
}
