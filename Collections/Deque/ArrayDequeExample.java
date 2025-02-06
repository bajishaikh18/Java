package Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i=0;i<n;i++) {
			dq.add(sc.nextInt());
		}
		
		dq.addFirst(sc.nextInt());
		
		dq.addLast(sc.nextInt());
		
		dq.removeFirst();
		
		for(Integer ele:dq) {
			System.out.print(ele + " ");
		}
		sc.close();
	}

}
