package oneDimensionalArray;
import java.util.*;
public class MergeArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Array Size : ");
		int n1 = sc.nextInt();
		
		int arr1[] = new int[n1];
		System.out.println("Enter the 1st Array Elements : ");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the 2nd Array Size : ");
		int n2 = sc.nextInt();
		
		int arr2[] = new int[n2];
		System.out.println("Enter the 2nd Array Elements : ");
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("1st Array :" + Arrays.toString(arr1));
		System.out.println("2nd Array " + Arrays.toString(arr2));
		
		int arr3[] = new int[arr1.length + arr2.length]; 
		for(int i=0;i<n1;i++) {
			arr3[i] =arr1[i];
		}
		
		for(int i=0;i<n2;i++) {
			arr3[i+n1] = arr2[i];
		}
	
		System.out.println("Merge : " + Arrays.toString(arr3));
		sc.close();
	}
}
