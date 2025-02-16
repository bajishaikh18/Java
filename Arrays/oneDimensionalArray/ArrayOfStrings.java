package oneDimensionalArray;
import java.util.*;
public class ArrayOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		
		System.out.println("Enter the Names : ");
		for(int i=0;i<n;i++) {
			names[i] = sc.next();
		}
		
		System.out.println("Enter the X Value : ");
		int x = sc.nextInt();
		System.out.println("Enter the Y Value : ");
		int y = sc.nextInt();
		
		if(x >= names.length || y >=names.length) {
			System.out.println("Invalid Index");
			sc.close();
			return;
		}
		
		System.out.println("The length of X Word : " + names[x].length());
		System.out.println("The length of Y Word : " + names[y].length());
		sc.close();
	}
}
