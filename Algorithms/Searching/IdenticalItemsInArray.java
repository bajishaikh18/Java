package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IdenticalItemsInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = Arrays.stream(scanner.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        int[] array2 = Arrays.stream(scanner.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        List<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("The intersection is : " + commonElements);
        scanner.close();
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> common = new ArrayList<>();

        int previous = Integer.MIN_VALUE;  // To handle duplicates
        for (int num : array1) {
            if (num != previous && binarySearch(array2, num)) {
                common.add(num); // Add only if it hasn't been added before
            }
            previous = num;
        }

        return common;
    }

    public static boolean binarySearch(int[] array, int key) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
