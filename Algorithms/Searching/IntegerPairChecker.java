package Searching;

import java.util.Scanner;

public class IntegerPairChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of pairs
        System.out.println("Enter the number of pairs:");
        int n = scanner.nextInt();

        // Step 2: Initialize an array to store the pairs
        int[][] pairs = new int[n][2];

        // Step 3: Read the pairs
        System.out.println("Enter the pairs:");
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        // Step 4: Read the integers a and b
        System.out.println("Enter the integers a and b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Step 5: Perform the linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if ((pairs[i][0] == a && pairs[i][1] == b) || (pairs[i][0] == b && pairs[i][1] == a)) {
                found = true;
                break;
            }
        }

        // Step 6: Print the result
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Close the scanner
        scanner.close();
    }
}