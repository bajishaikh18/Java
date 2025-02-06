package Searching;
import java.util.Scanner;
public class SearchString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String str = sc.nextLine().toLowerCase();
			char c = sc.next().charAt(0);
			boolean found = false;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==c) {
					System.out.println(i);
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("-1");
			}
			sc.close();
	}
}
