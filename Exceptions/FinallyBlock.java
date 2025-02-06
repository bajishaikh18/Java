public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int result = 10/0;
		} catch (Exception e) {
			System.out.println("Oops! Divide By Zero");
		} finally {
			System.out.println("Operation Attempted ! Cleaning Up....");
		}
	}
}
