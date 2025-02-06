public class Sleep {
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Main Thread Resumed after sleep");
		
		System.out.println("Performing another task in Main Thread...");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted again...");
		}
		
		System.out.println("Main thread finishing...");
	}
}
