import java.util.*;

public class frequenciesEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string from the user
        System.out.println("Please enter a string:");
        String str = sc.nextLine();
        
        char c[] = str.toCharArray();
        
        // Loop through each character in the array
        for (char c1 : c) {
            int count = 0; // Reset count for each character
            
            // Count occurrences of the current character
            for (char c2 : c) {
                if (c2 == c1) {
                    count++;
                }
            }
            
            // Print the frequency if it's the first time we encounter the character
            if (str.indexOf(c1) == str.lastIndexOf(c1)) {
                // Skip printing for duplicate characters
                continue;
            }

            System.out.println("'" + c1 + "' : " + count);
        }
        
        // Close the scanner
        sc.close();
    }
}
