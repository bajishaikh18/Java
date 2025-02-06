package TwoDimensionalArray;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter Number of Coloumns: ");
		int cols = sc.nextInt();
		//Creating a New Array
		int arr[][] = new int[rows][cols];
		
		System.out.println("Enter the elements of Array: ");
		//Populating the New Array
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter " +i + ":" + j + " element: ");
				arr[i][j]=sc.nextInt();
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
		
		//Calculating the Avg of Every Row
		for(int i=0;i<=arr.length-1;i++) {
			int sum=0;
			for(int j=0;j<=arr[i].length-1;j++) {
				sum+=arr[i][j];
			}
			double avg = (double)sum/arr[i].length;
			System.out.println("Average of row " + i + " is " + avg);
		}
		sc.close();
	}
}
