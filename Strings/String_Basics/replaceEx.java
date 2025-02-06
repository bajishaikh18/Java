package String_Basics;
import java.util.Scanner;

public class replaceEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String str2 = str.replace(word1, word2);
		System.out.println(str2);
		sc.close();
	}
}
