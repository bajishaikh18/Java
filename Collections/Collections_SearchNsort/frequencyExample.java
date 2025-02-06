package Collections_SearchNsort;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class frequencyExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Enter Five Names: ");
		for(int i=0;i<5;i++) {
			names.add(sc.next().toLowerCase());
		}
		System.out.println("Enter The Name you want to know the frequency: ");
		String name = sc.next().toLowerCase();
		int freq = Collections.frequency(names, name);
		
		if(freq!=0) {
			System.out.println(freq);
		} else {
			System.out.println("No Element found.");
		}
		sc.close();
	}
}
