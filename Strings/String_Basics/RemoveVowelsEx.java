package String_Basics;
import java.util.Scanner;
public class RemoveVowelsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strM = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(strM);
		sc.close();
	}
}
