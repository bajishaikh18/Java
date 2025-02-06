package String_Basics;
import java.util.Scanner;

public class containsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String main = sc.nextLine();
		String sub = sc.nextLine();
		
		if(main.contains(sub)) {
			System.out.println("Main contains Sub");
		} else {
			System.out.println("Main doesn't Contains Sub");
		}
		sc.close();
	}
}
