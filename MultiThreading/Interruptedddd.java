class downloadTask implements Runnable {
	@Override
	public void run() {
		System.out.println("Download Started...");
		for(int i=0;i<5;i++) {

			try {
				System.out.println("Done : " + (i*20) + "%");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Download Interrupted");
				return;
			}
			
			if(Thread.currentThread().isInterrupted()) {
				System.out.println("Download Stopped by User..");
				return;
			}
		}

		
	}
}

public class Interruptedddd {
	public static void main(String[] args) {
		Thread downloadThread = new Thread(new downloadTask());
		downloadThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("User Decided to Stop the Download..");
		downloadThread.interrupt();
	}
}
