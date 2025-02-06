package Searching;

import java.util.*;

public class binarySearch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int target = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			list.add(i);
		}
		System.out.println(Collections.binarySearch(list, target));
		sc.close();
	}
}
