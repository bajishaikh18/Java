package PriorityQueues;
import java.util.PriorityQueue;
import java.util.Scanner;
public class SizeExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=0;i<n;i++) {
			queue.add(sc.nextInt());
		}
		
		queue.add(sc.nextInt());
		
		System.out.println("Size: " + queue.size());
		sc.close();
	}
}
