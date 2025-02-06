package String_Basics;
import java.util.Scanner;

public class LengthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("The Length of the String " + str.length()+".");
		sc.close();
	}
}
