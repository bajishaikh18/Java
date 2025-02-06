import java.util.*;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int larger = (num1 > num2) ? num1 : num2;
		System.out.println(larger);
		sc.close();
	}
}
