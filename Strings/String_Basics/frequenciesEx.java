package String_Basics;

import java.util.Scanner;

public class frequenciesEx {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.println("Please enter a string:");
        String str = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        
        // Convert the string to a char array
        char[] c = str.toCharArray();
        
        // Loop through each character and count frequencies
        for (char c1 : c) {
            int count = 0; // Reset count for each character
            
            // Count occurrences of the current character
            for (char c2 : c) {
                if (c2 == c1) {
                    count++;
                }
            }
            
            // Print the frequency if it's the first time we encounter the character
            // This check avoids counting duplicates
            if (str.indexOf(c1) == str.lastIndexOf(c1)) {
                System.out.println("'" + c1 + "' : " + count);
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
