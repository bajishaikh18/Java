package String_Basics;
import java.util.Scanner;
public class StringBufferEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(str).append(" ").append(str2).append(" ").append(str3);
		
		System.out.println("Concat: " + sb.toString());
		sc.close();
	}
}
