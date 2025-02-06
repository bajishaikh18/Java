class kodnest extends Thread {
	private  String taskName;
	
	public  kodnest(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		System.out.println(taskName + " started...");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted.");
		}
		
		System.out.println(taskName + " completed.");
	}
}

public class kodnestlearn {
	public static void main(String[] args) {
		System.out.println("Main Leaning Journey Started...");
		
		kodnest classThread = new kodnest("Live Class");
		kodnest homeWorkThread = new kodnest("HomeWork Practice");
		kodnest assesmentThread = new kodnest("Assessment");
		
		classThread.start();
		homeWorkThread.start();
		assesmentThread.start();
		
		try {
			classThread.join();
			homeWorkThread.join();
			assesmentThread.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted while waiting..");
		}
		
		System.out.println("All Learning Activities Done...Ready for Next Journey...");
		
	}
}
