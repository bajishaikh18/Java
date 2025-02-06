class Score extends Thread{
	private String name;

	public Score(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name + " Scored....");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted..");
		}
		System.out.println(name + " Out....");
	}

}

public class CricBuzz {
	public static void main(String[] args) {
		
		Score abd = new Score("ABD");
		Score vk = new Score("VK");
		Score sehwag = new Score("Sehwag");
		
		abd.start();
		vk.start();
		sehwag.start();
		
		try {
			abd.join();
			vk.join();
			sehwag.join();
		} catch (InterruptedException e) {
			System.out.println("Decision Pending...");
		}
		
		System.out.println("All Out...");
	}
}
