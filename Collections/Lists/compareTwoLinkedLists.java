package Lists;
import java.util.LinkedList;
import java.util.Scanner;
public class compareTwoLinkedLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		int n1 = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n1;i++) {
			list1.add(sc.nextInt());
		}
		
		int n2 = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n2;i++) {
			list2.add(sc.nextInt());
		}
				
		if(list1.equals(list2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		sc.close();
	}
}
