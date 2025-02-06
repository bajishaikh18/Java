package PriorityQueues;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;
public class reverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			queue.add(sc.nextInt());
		}
		
		queue.add(sc.nextInt());
		
		queue.poll();
		System.out.println("Updated: ");
		while(!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
		sc.close();
	}
}
