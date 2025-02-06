package Collections_SearchNsort;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		ArrayList<String> cities = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			cities.add(sc.next());
		}
		
		Collections.reverse(cities);
		
		System.out.println(cities.toString().replace("[","").replace("]", ""));
		sc.close();
	}
}
