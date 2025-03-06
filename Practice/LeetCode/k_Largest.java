package Practice.LeetCode;

import java.util.*;

public class k_Largest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() < k) {
                minHeap.poll(); // Remove smallest element
            }
        }

        return minHeap.peek(); // The root is the k-th largest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        int[] nums = Arrays.stream(numStr.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int k = sc.nextInt();

        System.out.println(findKthLargest(nums,k));


    }
}
