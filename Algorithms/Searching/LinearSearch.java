package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Read input n and k
        System.out.print("Enter the length of the array (n) and the element to search (k): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Step 2: Create and populate the array
        int[] array = new int[n];
        System.out.print("Enter " + n + " space-separated integers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Step 3: Perform linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == k) {
                found = true;
                break;
            }
        }
        
        // Step 4: Output result
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Close the scanner
        scanner.close();
    }
}

