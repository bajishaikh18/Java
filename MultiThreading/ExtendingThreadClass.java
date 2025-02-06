public class ExtendingThreadClass  extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread Running :- " + (i+1));
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted..");
			}
			
		}
	}
	
	public static void main(String[] args) {
		ExtendingThreadClass myThread = new ExtendingThreadClass();
		myThread.run();
	}
}
