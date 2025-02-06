import java.util.Scanner;
public class VowelPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Count: " + vowels(str));
		sc.close();
	}
	
	public static int vowels(String str) {
		str = str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}
}
