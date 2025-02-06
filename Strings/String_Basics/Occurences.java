package String_Basics;
import java.util.Scanner;

public class Occurences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.next().charAt(0);

		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("Count: " + count);
		sc.close();
	}
}
