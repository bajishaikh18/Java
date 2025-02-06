package String_Basics;
import java.util.Scanner;

public class subStringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		if(s1>s.length() || s2>s.length()) {
			System.out.println("Out of Index.");
		}
		else {
			System.out.println("The Sub String: " + s.substring(s1, s2));
		}
		
		System.out.println("The Sub String: \"" + s.substring(s1, s2) + "\"");
		sc.close();
	}
}
