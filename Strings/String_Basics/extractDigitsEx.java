package String_Basics;
import java.util.Scanner;
public class extractDigitsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(extract(str));
		sc.close();
	}
	
	public static String extract(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(char c: str.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
