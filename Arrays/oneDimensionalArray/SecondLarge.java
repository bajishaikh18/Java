package oneDimensionalArray;
import java.util.*;

public class SecondLarge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");

		int n = sc.nextInt();
		
		if(n<2) {
			System.out.println("Array should contain Atleast Two Elements");
			sc.close();
			return;
		}

		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		for(int i = n -2; i>=0;i--) {
			if(arr[i] != arr[n-1]) {
				System.out.println(arr[i]);
				sc.close();
				return;
			}
		}
		
		System.out.println("There is No Second Highest Element");
		sc.close();		
	}
}
