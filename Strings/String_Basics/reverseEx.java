package String_Basics;
import java.util.Scanner;

public class reverseEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringBuilder reverse = new StringBuilder(str).reverse();
		System.out.println("Reversed String: " + reverse);
		sc.close();
	}
}
