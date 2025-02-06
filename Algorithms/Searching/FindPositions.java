package Searching;
import java.util.Scanner;

public class FindPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.println("Enter the sorted array elements separated by space:");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Input the target
        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        // Call the search functions and print results
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
       scanner.close();
    }

    // Function to find first and last positions
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums, target);
        return result;
    }

    // Function to find the first position
    public static int findFirstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstPos = mid;
                right = mid - 1; // Move left to find the first occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstPos;
    }

    // Function to find the last position
    public static int findLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lastPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastPos = mid;
                left = mid + 1; // Move right to find the last occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastPos;
    }
}
