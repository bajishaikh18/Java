import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		
		int t=num;
		
		int rem,rev=0;
		
		while(num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		if(rev==t) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
