package TwoDimensionalArray;
import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]);
				if(j<arr[i].length-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		int transpose[][] = new int[rows][cols];
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(transpose[i][j]);
				if(j<transpose[i].length-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
