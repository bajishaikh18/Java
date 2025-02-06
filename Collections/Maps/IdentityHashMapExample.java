package Maps;
import java.util.IdentityHashMap;
import java.util.Scanner;
public class IdentityHashMapExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IdentityHashMap<Integer, String> strings = new IdentityHashMap<Integer, String>();
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int id = sc.nextInt();
			String name = sc.next();
			strings.put(id, new String(name));
			System.out.println("Added user: " + id + " -> " + name);
		}
		
		int id1 = sc.nextInt();
		int id2 = sc.nextInt();
		String user1 = strings.get(id1);
		String user2 = strings.get(id2);
		
		boolean areSame = user1 == user2;
        System.out.println("Are the two users with the same data identical? " + areSame);
        sc.close();

	}
}
