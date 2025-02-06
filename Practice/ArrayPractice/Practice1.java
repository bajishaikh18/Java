package ArrayPractice;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter the Size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = -1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==n) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		sc.close();
	}
}
