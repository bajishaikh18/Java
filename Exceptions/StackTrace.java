public class StackTrace {
	public static void main(String[] args) {
		try {
			int[] arr= new int[5];
			System.out.println(arr[9]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
