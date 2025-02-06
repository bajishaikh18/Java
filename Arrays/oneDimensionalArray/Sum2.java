package oneDimensionalArray;
import java.util.*;

public class Sum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating an array with size of use input;
		int numbers[] = new int[sc.nextInt()];
		
		//populating the array;
		System.out.println("Please Enter your elements:");
		for(int i =0;i<=numbers.length-1;i++) {
			System.out.println("Enter your " + (i+1) + " element: ");
			numbers[i] = sc.nextInt();
		}
		
		//Sum;
		
		int sum = 0;
		for(int number : numbers) {
			sum +=number;
		}
		
		//Display Array  and sum as it is;
		System.out.print("numbers: [");
		for(int i =0;i<=numbers.length-1;i++) {
			System.out.print(numbers[i]);
			if(i<numbers.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		System.out.println("\nsum: " + sum);
		sc.close();
	}
}
