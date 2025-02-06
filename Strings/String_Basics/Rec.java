package String_Basics;
import java.util.Scanner;
public class Rec {    
	public static void main(String[] args) {        
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();        
		int i = sc.nextInt();        
		if(i>s.length()-1) {            
			System.out.println("Invalid.");        
		} else {            
			System.out.println("The character at index " + i + " is '" + s.charAt(i) + "'.");        
		}    
		sc.close();
	}
}
