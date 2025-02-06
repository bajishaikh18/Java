import java.util.Scanner;
import java.util.*;
public class anagramPrac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		boolean areEqual = areAnagram(first, second);
		if(areEqual) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}
	
	public static boolean areAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
}
