package Searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int target = sc.nextInt();

		int position = binary(arr, target);

		if (position == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println((position + 1) + " Found");
		}
		sc.close();

	}

	public static int binary(int arr[], int target) {

		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}
}
