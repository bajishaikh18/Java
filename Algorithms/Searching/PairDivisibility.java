package Searching;
import java.util.Scanner;
public class PairDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Step 2: Read the pairs and store them
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        // Step 3: Check each pair
        for (int i = 0; i < n; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];
            int sum = a + b;

            // Step 4: Check if sum is divisible by k
            if (sum % k == 0) {
                // Step 5: Print valid pairs
                System.out.println("(" + a + ", " + b + ")");
            }
        }

        scanner.close();
    }
}
