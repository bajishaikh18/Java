package String_Basics;
import java.util.Scanner;
public class RotateStringByNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Left or Right: ");
		String direction = sc.nextLine().toLowerCase();
		System.out.println(rotateString(str, num, direction));
		sc.close();
	}
		public static String rotateString (String str, int num, String direction) {
			if(direction.equals("left")) {
				return str.substring(num)+str.substring(0,num);
			} else if(direction.equals("right")) {
				return str.substring(str.length()-num)+str.substring(0,str.length()-num);
			} else {
				return "Invalid Direction";
			}
	}
}
