import java.util.Scanner;

public class Fac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int n = sc.nextInt();
		int fact1=1;
		
		for(int i=n;i>=1;i--) {
			fact1 = fact1*i;
		}
		System.out.println(fact1);
		sc.close();
	}
}
