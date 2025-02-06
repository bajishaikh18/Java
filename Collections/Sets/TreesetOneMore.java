package Sets;
import java.util.*;
public class TreesetOneMore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		TreeSet<String> strings = new TreeSet<String>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			strings.add(sc.next());
		}
		
		for(String ele: strings) {
			System.out.println(ele);
		}
		sc.close();
	}
}
