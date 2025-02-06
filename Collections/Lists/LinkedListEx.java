package Lists;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> Queue = new LinkedList<String>();
		
		Queue.addLast("Ride req From Baji");
		Queue.addLast("Ride req From Action");
		Queue.addLast("Ride req From Mulli");
		Queue.addLast("Ride req From Khadar");
		
		System.out.println("Current Queue: ");
		for(String ride:Queue) {
			System.out.println(ride);
		}
		System.out.println("");
		System.out.println("Urgent Ride for Teri Maa ki Chut");
		
		Queue.addFirst("Ride for Teri Maa ki Chu");
		
		System.out.println("");
		for(String ride:Queue) {
			System.out.println(ride);
		}
		
		System.out.println("");
		System.out.println("Processed Req: " + Queue.removeFirst());
		
		System.out.println("");
		for(String ride:Queue) {
			System.out.println(ride);
		}
		
	}
}
