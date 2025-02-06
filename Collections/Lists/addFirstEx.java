package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class addFirstEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int temp = sc.nextInt();

		list.add(0, temp);

		System.out.println("Update Array List:");
		for (int ele : list) {
			System.out.print(ele + " ");
		}
		sc.close();
	}
}
