package String_Basics;
import java.util.Scanner;	
public class rotationEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String str2 = sc.nextLine().toLowerCase();
		if(rotate(str, str2)) {
			System.out.println("The String " + str2 + "is the rotation of " + str);
		} else {
			System.out.println("False");
		}
		sc.close();
	}
	
	public static boolean rotate(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		String m = str1 + str1;
		return m.contains(str2);
	}
}