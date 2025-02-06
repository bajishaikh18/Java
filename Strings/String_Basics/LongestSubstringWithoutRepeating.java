package String_Basics;
import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Determine the length of the longest substring without repeating characters
        int length = lengthOfLongestSubstring(input);
        
        // Print the length
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    private static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // Array to store the last index of each character
        for (int i = 0; i < lastIndex.length; i++) {
            lastIndex[i] = -1; // Initialize all indices to -1
        }

        int maxLength = 0;
        int left = 0; // Left pointer for the sliding window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // Update the left pointer if the character was seen
            if (lastIndex[currentChar] >= left) {
                left = lastIndex[currentChar] + 1;
            }
            // Update the last seen index of the current character
            lastIndex[currentChar] = right;
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
