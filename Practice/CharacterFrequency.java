import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Call the method to count character frequencies
        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);
        
        // Print the character frequencies line by line
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Character, Integer> countCharacterFrequency(String str) {
        // Use a LinkedHashMap to maintain the order of insertion
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
        // Iterate through the string and count each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        return frequencyMap;
    }
}
