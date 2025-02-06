package Singleton;

class Manager {
	private static Manager instance;
	
	private Manager() {
		System.out.println("Manager is appointed");
	}
	
	public static Manager getInstance() {
		if (instance == null) {
			instance = new Manager();
		}
		return instance;
	}
	
	public void manage() {
		System.out.println("Managing");
	}
}

public class Main {
	public static void main(String[] args) {
		Manager m1 = Manager.getInstance();
		m1.manage();
		
		Manager m2 = Manager.getInstance();
		m2.manage();
		
	System.out.println("Is m1 the same as m2? " + (m1 == m2));
	}
}
