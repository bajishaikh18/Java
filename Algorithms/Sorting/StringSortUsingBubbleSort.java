package Sorting;
import java.util.Scanner;
public class StringSortUsingBubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		int n = str.length();
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(c[j]>c[j+1]) {
					char ch = c[j];
					c[j] = c[j+1];
					c[j+1] = ch;
				}
			}
		}
		for(char word : c) {
			System.out.print(word + " ");
		}
		sc.close();
	}
}
