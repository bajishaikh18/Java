package Sorting;
import java.util.Scanner;
public class SquaresOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]*arr[i];
		}
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		java.util.Arrays.sort(arr);
		System.out.println("");
		
		for(int num:arr) {
			System.out.print(num +" ");
		}
		sc.close();
	}
}
