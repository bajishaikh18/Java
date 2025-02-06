package Collections_SearchNsort;
import java.util.*;
public class DisJointExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		Collections.addAll(list1, "Apple", "Banana", "Cat");
		Collections.addAll(list2, "Dog", "Elephant", "Flag");
		
		boolean isDisjoint = Collections.disjoint(list1, list2);
		
		if(isDisjoint) {
			System.out.println("No Common Elements");
		} else {
			System.out.println("Some Common Elements");
		}
		sc.close();
	}
}
