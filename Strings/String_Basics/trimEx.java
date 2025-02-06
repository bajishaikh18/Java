package String_Basics;
import java.util.Scanner;

public class trimEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Trimmed: \"" + str.trim()+"\"");
		sc.close();
	}
}
