package Lists;
import java.util.Scanner;
import java.util.LinkedList;
public class LLEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		LinkedList<String> tasks = new LinkedList<String>();
		
		for(int i=0;i<n;i++) {
			String task = sc.nextLine();
			tasks.addFirst(task);
		}
		System.out.println("");
		System.out.println("Number of tasks: " + tasks.size());
		
		System.out.println("");
		System.out.println("Tasks: ");
		for(String ele:tasks) {
			System.out.println(ele);
		}
		sc.close();
	}
}
