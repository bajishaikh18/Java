package String_Basics;
import java.util.Scanner;

public class Concat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		String suffix = sc.nextLine();
		String newUsername = username + suffix;
		System.out.println("Original: " + username);
		System.out.println("Updated: " + newUsername);
		sc.close();
	}
}
