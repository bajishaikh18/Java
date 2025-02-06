public class NumberFormat {
	public static void main(String[] args) {
		String str = "abc";
		try {
			int num = Integer.parseInt(str);
		} catch(NumberFormatException e) {
			System.out.println("Cannot conver str to int");
		}
	}
}
