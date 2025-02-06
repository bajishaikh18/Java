package String_Basics;

public class Recursive {
	public static void main(String[] args) {
		try {
			recursive();
		} catch (Exception e) {
			
			System.out.println("Statck");
			return;
		}
	}
	public static void recursive() {

		try {
			recursive();
		} catch (Exception e) {
			
			System.out.println("Statck");
			return;
		}
	}
}
