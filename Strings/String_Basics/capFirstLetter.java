package String_Basics;
import java.util.Scanner;
public class capFirstLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(capital(str));
		sc.close();
	}
	
	public static String capital(String str) {
		String words[] = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(String word:words) {
			if(word.length()>0) {
				String modified = Character.toUpperCase(word.charAt(0)) + word.substring(1);
				sb.append(modified).append(" ");
			}
		}
		return sb.toString().trim();
	}
}
