package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class MissingNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(findMissingNumber(arr, n));
		sc.close();
	}
	public static int findMissingNumber(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}
