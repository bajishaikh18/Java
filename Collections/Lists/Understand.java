package Lists;
import java.util.ArrayList;
public class Understand {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Baji");
		students.add("Action");
		students.add("Mulli");
		System.out.println(students);
		
		students.add(3,"Teri");
		System.out.println(students);
		
		students.remove(0);
		System.out.println(students);
	}
}
