package String_Basics;
import java.util.Scanner;

public class indexOfEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = sc.next().charAt(0);
		if(s.indexOf(c)== -1) {
			System.out.println("Character Not Found");
		} else {
			System.out.println("The First Occurence " + s.indexOf(c));
		}
		sc.close();
	}
}
