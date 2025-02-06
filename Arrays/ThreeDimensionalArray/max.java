package ThreeDimensionalArray;
import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int layers = sc.nextInt();
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][][] = new int[layers][rows][cols];
		
		for(int i=0;i<layers;i++) {
			for(int j=0;j<rows;j++) {
				for(int k=0;k<cols;k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<layers;i++) {
			System.out.println("Layer "+ (i+1) + ":" );
			for(int j=0;j<rows;j++) {
				for(int k=0;k<cols;k++) {
					System.out.print( arr[i][j][k] + " ");
				}
				System.out.println("");
			}
		}
		
		for(int i=0;i<layers;i++) {
			int max = arr[i][0][0];
			for(int j=0;j<rows;j++) {
				for(int k=0;k<cols;k++) {
					if(max<arr[i][j][k]) {
						max = arr[i][j][k];
					}
				}
			}
			System.out.println("Max in Layer " + (i+1) + "is :" + max);
		}
		
		sc.close();
	}
}
