import java.util.Scanner;
public class reverseEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.println(sb);
		sc.close();
	}
}
