import java.util.Scanner;

public class NBallsKboxes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int min = K * (K + 1) / 2;

			if (N >= min) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
