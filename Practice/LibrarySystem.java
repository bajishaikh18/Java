package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {

    // Function to check out a book1
    public static void checkOutBook(ArrayList<String> availableBooks, String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            System.out.println("Successfully checked out: " + bookTitle);
        } else {
            System.out.println("Sorry, book " + bookTitle + " is not available.");
        }
    }

    // Function to return a book
    public static void returnBook(ArrayList<String> availableBooks, String bookTitle) {
        if (!availableBooks.contains(bookTitle)) {
            availableBooks.add(bookTitle);
            System.out.println("The book " + bookTitle + " has been successfully returned.");
        } else {
            System.out.println("The book " + bookTitle + " is already in the library.");
        }
    }

    // Function to view available books
    public static void viewBooks(ArrayList<String> availableBooks) {
        if (!availableBooks.isEmpty()) {
            System.out.println("\nAvailable Books:");
            for (String book : availableBooks) {
                System.out.println(" - " + book);
            }
        } else {
            System.out.println("No books are currently available.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> availableBooks = new ArrayList<>();
        availableBooks.add("1984");
        availableBooks.add("To Kill a Mockingbird");
        availableBooks.add("The Great Gatsby");
        availableBooks.add("Moby Dick");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Checkout System");
            System.out.println("1. View Available Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");

            System.out.print("Enter 1-4: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewBooks(availableBooks);
                    break;
                case 2:
                    System.out.print("Enter the title of the book you want to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    checkOutBook(availableBooks, checkOutTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book you want to return: ");
                    String returnTitle = scanner.nextLine();
                    returnBook(availableBooks, returnTitle);
                    break;
                case 4:
                    System.out.println("Thank you for choosing our library!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please select 1-4 only.");
                    break;
            }
        }
    }
}
