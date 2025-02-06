package PriorityQueues;
import java.util.Scanner;
import java.util.PriorityQueue;
public class PriorityQueueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=0;i<n;i++) {
			queue.add(sc.nextInt());
		}
		
		queue.add(sc.nextInt());
		queue.remove();
		
		System.out.println("Updated Queue: ");
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
		sc.close();
	}
}
