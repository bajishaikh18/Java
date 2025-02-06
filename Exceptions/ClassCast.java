public class ClassCast {
	public static void main(String[] args) {
		Object obj = new Integer(100);
		try {
			String str = (String)obj;
		} catch(ClassCastException e) {
			System.out.println("Cannot Convert....");
		}
	}
}
