package oneDimensionalArray;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size of the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter your " + (i+1) + " element: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("You Entered the following elements: ");
		
		for(int i = 0; i < size; i++) {
			System.out.println("Element " + (i+ 1) + ": "+array[i]);
		}
		sc.close();
	}
}
