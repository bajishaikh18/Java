package Searching;

import java.util.Scanner;

public class EmployeeRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of working days
        System.out.println("Enter the number of working days:");
        int N = scanner.nextInt();

        // Step 2: Get the workload for each day
        int[] workload = new int[N];
        System.out.println("Enter the hours worked each day:");
        for (int i = 0; i < N; i++) {
            workload[i] = scanner.nextInt();
        }

        // Step 3: Find the longest interval where hours worked > 6
        int maxStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < N; i++) {
            if (workload[i] > 6) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        // Print the result
        System.out.println("The employee's rating (longest interval of working more than 6 hours): " + maxStreak);
        scanner.close();
    }
}