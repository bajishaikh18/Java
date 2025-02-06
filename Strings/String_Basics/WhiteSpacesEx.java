package String_Basics;
import java.util.*;
public class WhiteSpacesEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String m = str.replaceAll("\\s", "");
		System.out.println(m);
		sc.close();
	}
}
