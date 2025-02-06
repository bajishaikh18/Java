package oneDimensionalArray;
import java.util.*;
public class reverseSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 10, 3, 4, 0};
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
