package Searching;
import java.util.Scanner;
public class Linear_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("\\s");
		String target = sc.nextLine();
		int position = linear(str, target);
		
		if(position==-1) {
			System.out.println("Not Found");
		} else {
			System.out.println("The word '"+target+"' is found at: " + (position+1));
		}
		sc.close();
	}
	
	public static int linear(String[] str, String target) {
		for(int i=0;i<str.length;i++) {
			if(str[i].equalsIgnoreCase(target)) {
				return i;
			}
		}
		return -1;
	}
}
