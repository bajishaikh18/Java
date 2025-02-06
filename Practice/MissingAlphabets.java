import java.util.*;

public class MissingAlphabets {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        String missingAlphabets = findMissingAlphabets(input.toLowerCase());
        System.out.println("Missing Alphabets: " + missingAlphabets);
        sc.close();
    }

    public static String findMissingAlphabets(String word) {
        Set<Character> presentAlphabets = new HashSet<>();
        for (char c : word.toCharArray()) {
            presentAlphabets.add(c);
        }

        StringBuilder missingAlphabets = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!presentAlphabets.contains(c)) {
                missingAlphabets.append(c + ",");
            }
        }

        return missingAlphabets.toString();
    }
}
