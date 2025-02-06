public class Arthimatic {
	public static void main(String[] args) {
		try {
			int num = 10/0;
			System.out.println(num);
		} catch(ArithmeticException e) {
			System.out.println("Divided By Zero");
		}
	}
}
