import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of terms:");
		int n = sc.nextInt();
		int num1 =0;
		int num2 = 1;
		System.out.println("First " + n + " terms of fibonacci series: ");
		for(int i=1;i<=n;i++) {
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 =sum;
		}
		
		sc.close();
	}
}
