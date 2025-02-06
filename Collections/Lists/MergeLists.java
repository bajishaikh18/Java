package Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class MergeLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		for(int i=0;i<n1;i++) {
			list1.add(sc.next());
		}
		
		int n2 = sc.nextInt();
		for(int i=0;i<n2;i++) {
			list2.add(sc.next());
		}
		
		System.out.print("List of First Array: ");
		for(String ele:list1) {
			System.out.print(ele +" ");
		}
		
		System.out.print("\nList of Second Array: ");
		for(String ele:list2) {
			System.out.print(ele +" ");
		}
		
		ArrayList<String> newList = new ArrayList<String>(list1);
		
		newList.addAll(list2);
		
		System.out.print("\nUpdated List: ");
		for(String ele:newList) {
			System.out.print(ele +" ");
		}
		sc.close();
	}
}
