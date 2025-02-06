package String_Basics;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class Regex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = sc.nextLine();
		try {
			 Pattern.compile(regex);
			 System.out.println("The pattern '" + regex+"' is valid");
		} catch (PatternSyntaxException e) {
			System.out.println("The Description: " + e.getDescription());
		}
		sc.close();
	}
}
