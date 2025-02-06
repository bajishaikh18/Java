import java.util.Scanner;
public class Product_of_Even_Nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int product = 1;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				product *= i;
			}
		}
		
		System.out.println(product);
		sc.close();
	}
}
