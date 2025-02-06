package ThreeDimensionalArray;
import java.util.Scanner;

public class ThreeDimensional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Layers: ");
		int layers = sc.nextInt();
		System.out.println("Enter Rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter Cols: ");
		int cols = sc.nextInt();
		
		int arr[][][] = new int[layers][rows][cols];
		
		//Populating Array
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		
		//Printing Array
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]);
					if(k<arr[i][j][k]) {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		//sum
		for(int i=0;i<=arr.length-1;i++) {
			int sum=0;
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					sum += arr[i][j][k];
				}
			}
			System.out.println("Sum of Layer " + (i+1) + ": " + sum);
		}
		
		sc.close();
	}
}
