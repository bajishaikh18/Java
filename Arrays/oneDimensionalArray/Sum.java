package oneDimensionalArray;

import java.util.*;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size: ");
		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter your " + i);
			arr[i] = sc.nextInt();
		}
		System.out.print("Your Elements: [");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");

		System.out.println("Sum: " + Sum.findSum(arr));
		sc.close();
	}

	public static int findSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
