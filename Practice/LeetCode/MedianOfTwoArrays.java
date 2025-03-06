package Practice.LeetCode;

import java.util.*;

public class MedianOfTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        long startTime = System.currentTimeMillis();
        System.out.println(findMedianSortedArrays(arr1, arr2));
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: " + (endTime - startTime));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int n = nums1.length;
        int m = nums2.length;
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, n, m);
        Arrays.sort(nums);
        int mid = (n + m) / 2;

        if (nums.length % 2 == 0) {
            double avg = (nums[mid] + nums[mid - 1]) / 2.0;
            return avg;
        } else {
            return nums[mid];
        }
    }
}
