package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        // Step 1: Input the Number of Elements
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Step 2: Input the Elements
        System.out.println("Enter " + n + " elements:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Implement Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }


        // Step 4: Print the Sorted Array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
