public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");

        System.out.println("Order Received");

        System.out.println("Preparing Food");
        delay(1000);

        System.out.println("Food is ready to Deliver");

        System.out.println("Main thread Finishing...");
    }


    private static void delay(int milliseconds) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interupted");
        }
    }
}
