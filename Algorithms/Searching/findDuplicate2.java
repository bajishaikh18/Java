package Searching;
import java.util.*;
public class findDuplicate2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] parts = line.split(" ");
		int[] arr = new int[parts.length];

		for(int i=0;i<parts.length;i++) {
			arr[i] = Integer.parseInt(parts[i]);
		}
		Arrays.sort(arr);
		System.out.print("The Duplicates are: ");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.print(arr[i] + " ");
				continue;
			}
		}
		sc.close();
	}
}
