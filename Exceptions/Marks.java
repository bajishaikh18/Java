class MarksException extends Exception {
	public MarksException(String message) {
		super(message);
	}
}
public class Marks {
	private int marks;

	public Marks(int marks) {
		this.marks = marks;
	}

	public void checkMarks() throws MarksException {
		if(marks<30) {
			throw new MarksException("You Fucking Failed");
		} else {
			System.out.println("Ok You Border Passed");
		}
	}
	
	public static void main(String[] args) {
		Marks student1 = new Marks(50);
		Marks student2 = new Marks(29);
		
		try {
			student1.checkMarks();
		} catch (MarksException e ) {
			System.out.println(e.getMessage());
		}
		
		try {
			student2.checkMarks();
		} catch (MarksException e ) {
			System.out.println(e.getMessage());
		}
	}
}
