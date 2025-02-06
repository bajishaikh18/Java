package Lists;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		
		students.add("Baji");
		students.add("Kittu");
		students.add("Dinesh");
		students.add("Mulli");
		
		Iterator<String> it = students.iterator();
		System.out.println("Students List:");
		System.out.println("");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("");
		
		for(String name:students) {
			System.out.println(name);
		}
	}
}
