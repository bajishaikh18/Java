package CompareTo;
import java.util.*;
class Product implements Comparable<Product> {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public int compareTo(Product other) {
		return Double.compare(this.price, other.price);
	}
	
	public String toString() {
		return "Name: " + name + " Price: " + price;
	}
}

public class PriceTrack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		for(int i=0;i<n;i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			
			products.add(new Product(name, price));
		}
		
		Collections.sort(products);
		
		for(Product ele : products) {
			System.out.println(ele);
		}
		sc.close();
	}
}
