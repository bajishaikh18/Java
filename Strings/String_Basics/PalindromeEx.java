package String_Basics;
import java.util.Scanner;
public class PalindromeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = new StringBuilder(str).reverse().toString();
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
