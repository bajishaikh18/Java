package Maths_Logics;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> arr = new HashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr.toString().replaceAll(" ", ""));
		sc.close();
	}
}
