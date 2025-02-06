package String_Basics;
import java.util.Scanner;
public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();

		if(areAnagrams(first, second)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	public static boolean areAnagrams (String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if(str1.length()!=str2.length()) {
			return false;
		}

		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();

		java.util.Arrays.sort(c1);
		java.util.Arrays.sort(c2);
		return java.util.Arrays.equals(c1,c2);
	}
}
