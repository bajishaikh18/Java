package String_Basics;
import java.util.Scanner;

public class vowelEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Count: " + vowel(str));
		sc.close();
	}
	
	public static int vowel(String str) {
		str = str.toLowerCase();
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}
}
