package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(java.util.Arrays.toString(arr).replace("[", "").replace("]", ""));
		sc.close();
	}
}
