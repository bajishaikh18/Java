import java.util.Scanner;
public class SumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = sc.nextInt();
		System.out.println("Sum of N natural numbers: ");
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
