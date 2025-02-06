package Lists;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstNNLastIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of books
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Create a LinkedList to store book titles
        LinkedList<String> bookList = new LinkedList<>();

        // Read book titles
        System.out.println("Enter book titles:");
        for (int i = 0; i < n; i++) {
            bookList.add(sc.next());
        }

        // Read the specific book title to search for
        System.out.println("Enter the book title to search for:");
        String searchTitle = sc.next();

        // Find first and last occurrences
        int firstIndex = bookList.indexOf(searchTitle);
        int lastIndex = bookList.lastIndexOf(searchTitle);

        // Print results
        if (firstIndex != -1) {
            System.out.println("First occurrence of " + searchTitle + ": " + firstIndex);
            System.out.println("Last occurrence of " + searchTitle + ": " + lastIndex);
        } else {
            System.out.println("\"" + searchTitle + "\"" + " not found in the list.");
        }

        sc.close();
    }
}
