package Lists;
import java.util.Scanner;
import java.util.ArrayList;
public class mightdlt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> animals = new ArrayList<String>();
		
		for(int i=0;i<n;i++) {
			String animal = sc.next();
			animals.add(animal);
		}
	
		for(String ele:animals) {
			System.out.println(ele);
		}
		
		animals.remove(0);
		
		for(String ele:animals) {
			System.out.println(ele);
		}
		sc.close();
	}
}
