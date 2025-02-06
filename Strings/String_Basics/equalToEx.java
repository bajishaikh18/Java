package String_Basics;
import java.util.Scanner;

public class equalToEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		boolean isEqual = str.equals(str2);
		System.out.println(isEqual);
		sc.close();
	}
}
