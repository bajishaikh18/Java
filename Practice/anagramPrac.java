import java.util.Scanner;
import java.util.*;

public class anagramPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine().toLowerCase();
		String str2 = sc.nextLine().toLowerCase();
		if(areAnagrams(str1, str2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
		sc.close();
	}
	
	public static boolean areAnagrams(String str1, String str2 ) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char c1[] =str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
	}
}
