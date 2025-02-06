import java.util.*;
public class StringOfArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String names [] = new  String[n];
		for(int i =0; i<n; i++) {
			names[i] = sc.next();
		}

		System.out.println(names.length);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x >= 0 && x < names.length && y >= 0 && y < names.length) {
			System.out.println(names[x].length());
			System.out.println(names[y].length());
		} else {
			System.out.println("Invalid positions. Please enter valid indices.");
		}
		sc.close();
	}
}
