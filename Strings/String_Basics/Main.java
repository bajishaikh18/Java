package String_Basics;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String userInput = sc.nextLine();
		
		String str = userInput;
		
		String str2 = new String(userInput);
		
		System.out.println("String created using double quotes: " + str);
		System.out.println("String created using new Keyword: " + str2);
		
		boolean equals = (str==str2);
		System.out.println("== "+equals);
		
		boolean equals2 = str.equals(str2);
		System.out.println("equals: "+equals2);
		sc.close();
	}
}
