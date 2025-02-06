
public class MyRunnable implements Runnable {
	@Override 
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread Running :- " + (i+1));
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted..");
			}
		}
	}
	
	public static void main(String[] args) {
		MyRunnable myrunnable = new MyRunnable();
		
		Thread myThread = new Thread(myrunnable);
		
		myThread.start();
	}
}
