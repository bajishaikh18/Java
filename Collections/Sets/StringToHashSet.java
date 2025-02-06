package Sets;
import java.util.*;
public class StringToHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		
		HashSet<String> words = new HashSet<String>();
		
		for(String word:str.split(" ")) {
			words.add(word);
		}
		
		System.out.println("Size: " + words.size());
		sc.close();
	}
}
