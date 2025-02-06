package TwoDimensionalArray;
import java.util.Scanner;

public class MinNSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		
		//Populating the New Array

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//Printing the Array

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]);
				if(j<arr[i].length-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//Finding min
		int sum =0;
		for(int i=0;i<=arr.length-1;i++) {
			int min = arr[i][0];
			for(int j=0;j<=arr[i].length-1;j++) {
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
			System.out.println("Min of row " + i + " is " + min);
			sum += min;
		}
		System.out.println("Sum of Mins: " + sum);
		sc.close();
	}
}
