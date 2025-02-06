package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		System.out.println("Before Swapping: ");
		for (String ele : list) {
			System.out.println(ele + " ");
		}

		int index1 = 0;
		int index2 = 2;

		String temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);

		System.out.println("After Swapping: ");
		for (String ele : list) {
			System.out.println(ele + " ");
		}

		list.add(0, "Brown");
		System.out.println(list);
		sc.close();
	}
}
