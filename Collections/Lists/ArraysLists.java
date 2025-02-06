package Lists;
import java.util.*;
public class ArraysLists {
	public static void main(String[] args) {
		ArrayList<Double> animals = new ArrayList<Double>();
		// Create an array of animal names
		
		animals.add( 1.43);
		animals.add(6.3456);
		animals.add(1.453);
		
		Collections.sort(animals);
		Collections.reverse(animals);
		for (double ele:animals) {
			System.out.println(ele);
		}
		
		
	}
}
