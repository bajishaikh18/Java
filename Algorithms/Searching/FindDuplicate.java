package Searching;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array, separated by spaces:");
        String input = scanner.nextLine();

        // Step 2: Parse Input
        String[] inputArray = input.split(" ");
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        // Step 3: Binary Search Initialization
        int low = 1;
        int high = nums.length - 1;

        // Step 4: Binary Search Logic
        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Step 5: Print Result
        System.out.println("The duplicate number is " + low);
        scanner.close();
    }
}