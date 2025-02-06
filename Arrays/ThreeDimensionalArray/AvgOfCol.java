package ThreeDimensionalArray;
import java.util.Scanner;

public class AvgOfCol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int layers = sc.nextInt();
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int [][][] arr = new int[layers][rows][cols];

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Layer " + (i+1) + ": ");
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]);
					if(k<arr[i].length) {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				int sum =0;
				
				for(int k=0;k<=arr[i][j].length-1;k++) {
					sum += arr[i][j][k];
				}
				double avg = (double)sum/arr[i][j].length;
				System.out.println("Average of ("+i+","+j+")" + avg);
			}
		}
sc.close();



	}
}
