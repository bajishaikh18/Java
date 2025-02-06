package Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class genericLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Object>  list= new ArrayList<Object>();
		
		String type = sc.nextLine().trim().toLowerCase();
		
		switch(type) {
		case "integer":
			for(int i=0;i<n;i++) {
				list.add(sc.nextInt());
			}
			break;
		case "string":
			for(int i=0;i<n;i++) {
				list.add(sc.next());
			}
			break;
		case "double":
			for(int i=0;i<n;i++) {
				list.add(sc.nextDouble());
			}
			break;
		default:
			System.out.println("Invalid Data type");	
		}
		
		System.out.println("Size: " + list.size());
		
		System.out.print("Elements: ");
		
		for(Object ele:list) {
			System.out.print(ele + " ");
		}
		sc.close();
	}
}
