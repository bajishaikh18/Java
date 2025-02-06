package Maps;
import java.util.*;
public class WeakHashMapExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> sessionTokens = new WeakHashMap<Integer, String>();

		int n = sc.nextInt();
		sc.nextLine();

		for(int i=0;i<n;i++) {
			int tokenId = sc.nextInt();
			String tokenName = sc.next();
			sessionTokens.put(tokenId, tokenName);
			System.out.println("Addes Sucessfully: Token Id: " + tokenId + " -> " + tokenName);
		}
		
		int toCheck = sc.nextInt();
		boolean exits = sessionTokens.containsKey(toCheck);
		System.out.println("The Token Id: " + toCheck + " exits -> " + exits);
		
		 System.out.println("All Active Session Tokens:");
	       sessionTokens.forEach((key, value) -> System.out.println(key + " -> " + value));
	       sc.close();
	}
}
