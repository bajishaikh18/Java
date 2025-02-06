package String_Basics;
import java.util.Scanner;

public class LongestPalindromicSubstringDP {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length 3 or more
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1; // Ending index
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the longest palindromic substring
        String longestPalindrome = longestPalindrome(input);

        // Output the result
        System.out.println("Longest palindromic substring: " + longestPalindrome);

        // Close the scanner
        scanner.close();
    }
}
