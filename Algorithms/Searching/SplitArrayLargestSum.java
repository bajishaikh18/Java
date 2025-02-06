package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayLargestSum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the array elements separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        
        System.out.println("Enter the number of subarrays (k):");
        int k = scanner.nextInt();
        
        int low = Arrays.stream(array).max().orElse(0);
        int high = Arrays.stream(array).sum();
        int result = high;
        
        // Binary search to find the minimized largest sum
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canSplit(array, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        // Output the result
        System.out.println("The minimized largest sum is: " + result);
        scanner.close();
    }
    
    // Function to check if the array can be split into k subarrays with maximum sum <= maxSum
    public static boolean canSplit(int[] array, int k, int maxSum) {
        int currentSum = 0;
        int subarrays = 1;
        for (int num : array) {
            if (currentSum + num > maxSum) {
                currentSum = num;
                subarrays++;
                if (subarrays > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        return true;
    }
}