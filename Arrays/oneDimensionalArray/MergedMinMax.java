package oneDimensionalArray;
import java.util.*;
public class MergedMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array 1 Elements Space-Separated");
		String[] arr1Input = sc.nextLine().split(" ");
		int arr1[]  = new int[arr1Input.length];
		for(int i=0;i<arr1Input.length;i++) {
			arr1[i] = Integer.parseInt(arr1Input[i]);
		}
		
		System.out.println("Enter Array 2 Elements Space-Separated");
		String[] arr2Input = sc.nextLine().split(" ");
		int arr2[]  = new int[arr2Input.length];
		for(int i=0;i<arr2Input.length;i++) {
			arr2[i] = Integer.parseInt(arr2Input[i]);
		}
		
		int arr3[] = new int[arr1Input.length + arr2Input.length];
		
		for(int i=0;i<arr1Input.length;i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0;i<arr2Input.length;i++) {
			arr3[i + arr1Input.length] = arr2[i];
		}
		
		int min = arr3[0];
		int max = arr3[0];
		
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]<min) {
				min = arr3[i];
			} else if(arr3[i]>max) {
				max = arr3[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		sc.close();
		
	}
}
