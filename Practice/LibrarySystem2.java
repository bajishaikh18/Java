import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem2 {

	public static void showBooks(ArrayList<String > available_books) {
		if(!available_books.isEmpty()) {
			for(String book:available_books) {
				System.out.println("- "+book);
			}
		} else {
			System.out.println("The Library Doesnt have any Books");
		}
	}
	
	public static void checkout(ArrayList<String > available_books, String booktitle) { 
		if(available_books.contains(booktitle)) {
			System.out.println("The Book " + booktitle + " Sucessfully checked out");
			available_books.remove(booktitle);
		} else {
			System.out.println("Sorry We Dont Have  that Book.....");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> available_books =new ArrayList<>();
		available_books.add("1984");
		available_books.add("Lady Bird");
		available_books.add("The Happyyyness");


		while(true) {
			System.out.println("Welcome to Library System:");
			System.out.println("1 - Show Available Books");
			System.out.println("2- Check Out Book");
			System.out.println("3- Return Book");
			System.out.println("4- Exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice) {
			case 1:
				showBooks(available_books);
				break;
			case 2:
				System.out.println("Enter The Book Name: ");
				String booktitle = sc.nextLine();
				sc.nextLine();
				checkout(available_books, booktitle);
				break;
			}
			sc.close();
		}
	}
}
