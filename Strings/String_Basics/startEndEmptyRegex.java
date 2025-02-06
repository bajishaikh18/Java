package String_Basics;
import java.util.Scanner;

public class startEndEmptyRegex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(str.startsWith("H"));
		
		System.out.println(str.endsWith("!"));
		
		System.out.println(str.isEmpty());
		
		String  regex = "[a-zA-Z]+";
		
		System.out.println(str.matches(regex));
		sc.close();
	}
}
