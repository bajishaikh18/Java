package String_Basics;
import java.util.Scanner;

public class cases {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("UpperCase: " + str.toUpperCase());
		System.out.println("LowerCase: " + str.toLowerCase());
		sc.close();
	}
}
