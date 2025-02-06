package String_Basics;
import java.util.Scanner;
public class ASCII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int asci = (int) ch;
		System.out.println("Ascii: " + asci);
		sc.close();
	}
}
