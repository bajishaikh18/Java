class PaymentFailedException extends Exception {
	public PaymentFailedException(String message) {
		super(message);
	}
}

class DeliveryFailedException extends Exception {
	public DeliveryFailedException (String message) {
		super(message);
	}
}
public class Swiggy {

	public static void processOrder(String order ) throws PaymentFailedException, DeliveryFailedException {
		if(order.equals("Order 2")) {
			throw new PaymentFailedException("The Payment was Failed...Please try Again");
		} else if (order.equals("Order 2")) {
			throw new DeliveryFailedException("The Deliver is Failed.. Please Contact Support");
		}else if(order.equals("Order 4")) {
			throw new NullPointerException("The Order Details are Missing");
		}else {
			System.out.println("The Order Placed Successfully...");
		}
	}


	public static void main(String[] args) {
		String[] orders = {"Order 1", "Order 2", "Order 3", "Order 4"};
		
		for(String order:orders) {
			try {
				processOrder(order);
			} catch (PaymentFailedException e){
				System.out.println("Payment Failed for order " + order + e.getMessage());
			} catch(DeliveryFailedException e) {
				System.out.println("Delivery Failed for order " + order + e.getMessage());
			} catch (Exception e) {
				System.out.println("Something went Wrong with " + order + e.getMessage());
			}
		}
		System.out.println("All Orders have processed...Thank You.Have a Nice Day");

	}
}
