public class nullPointer {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch(NullPointerException e) {
			System.out.println("The given string has null value...");
		}
		System.out.println("Program Continues......");
	}
}
