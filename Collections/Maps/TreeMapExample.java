package Maps;
import java.util.*;
public class TreeMapExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> flights = new TreeMap<String, String>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String name = sc.next();
			String time = sc.next();
			flights.put(time, name);
			System.out.println("Added: " + name + " at " + time);
		}
		
		String ret = sc.next();
		if(flights.containsKey(ret)) {
			System.out.println(flights.get(ret));
		} else {
			System.out.println("Noo");
		}
		
		String rem = sc.next();
		if(flights.containsKey(rem)) {
			System.out.println(flights.remove(rem));
		} else {
			System.out.println("Noo");
		}
		
		for(Map.Entry<String, String> ele: flights.entrySet()) {
			System.out.println("Id: " + ele.getKey() + " Name : " + ele.getValue());
		}
		sc.close();
	}
}
