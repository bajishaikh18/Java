package String_Basics;

import java.util.Scanner;

public class Permutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		// Call the permutation function
		generatePermutations(str, 0, str.length() - 1);

		sc.close();
	}

	private static void generatePermutations(String str, int start, int end) {
		if (start == end) {
			System.out.println(str);
		} else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				generatePermutations(str, start + 1, end);
				str = swap(str, start, i); // backtrack
			}
		}
	}

	// Helper function to swap characters in a string
	private static String swap(String str, int i, int j) {
		char[] ch = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
}