package oneDimensionalArray;

import java.util.*;

public class kSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println("Input: arr = " + Arrays.toString(arr) + ", k = " + k);
		sc.close();
	}
}
