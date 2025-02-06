package String_Basics;
import java.util.Scanner;

public class SplitNjoinEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Sentence: ");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		
		System.out.println("Spiltted Words: ");
		for(String word:words) {
			System.out.println(word);
		}
		
		String c = sc.nextLine();
		String newStr = String.join(c, words);
		System.out.println("After Joining: " + newStr);
		sc.close();
	}
}
