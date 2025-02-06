public class Priority {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		
		System.out.println("Default main thread Priority: " + mainThread.getPriority());
		
		mainThread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Updated main Thread Priority: " + mainThread.getPriority());
		
		System.out.println("Main thread executing high-priority tasks.");
		
		
	}
}
