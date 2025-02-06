package Sorting;
import java.util.*;
public class BubbleSort2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = {"Baji", "Jaideep", "Ram", "allu Arjun"};
		List<String> names = new ArrayList<String>();
		for(int i=0;i<name.length;i++) {
			names.add(name[i]);
		}
		
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
		
		for(String ele:names) {
			System.out.print(ele + " ");
		}
		sc.close();
	}
}
