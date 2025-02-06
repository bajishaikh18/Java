package Sorting;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		selectionSort(arr);
		
		System.out.println("Sorted Array: ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
