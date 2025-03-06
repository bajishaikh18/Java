package Practice.LeetCode;

import java.util.*;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for(int num:nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(singleNumber(arr));
    }
}
