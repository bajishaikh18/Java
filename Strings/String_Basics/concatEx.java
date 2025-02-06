package String_Basics;
import java.util.Scanner;

public class concatEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("The Concat: " + str.concat(" ").concat(str2));
		sc.close();
	}
}
