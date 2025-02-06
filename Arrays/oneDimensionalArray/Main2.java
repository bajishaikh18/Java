package oneDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your array size: ");
		int array[] = new int[sc.nextInt()];
		
		for(int i =0; i <=array.length-1; i++) {
			System.out.println("Enter your " + i  + " element: ");
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<=array.length-1;i++) {
			System.out.println("Your " + i + " element is : " + array[i]);
		}
		System.out.println("Array: ");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Min: " + array[0]);
		sc.close();
	}
}
