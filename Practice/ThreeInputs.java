import java.util.Scanner;

public class ThreeInputs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+' : System.out.println(x+y); break;
		case '-' : System.out.println(x-y); break;
		case '*' : System.out.println(x*y); break;
		case '/' : 
			if(x/y==0) {
				System.out.println("Divisible by Zero");
			}
			else {
				System.out.println(x/y);
				break;
			}
			default: System.out.println("Invalid operator");
		}
		sc.close();
	}
}
