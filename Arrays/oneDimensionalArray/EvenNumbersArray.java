package oneDimensionalArray;
import java.util.*;
public class EvenNumbersArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array 1 Elements Space-Separated");
		String[] arr1Input = sc.nextLine().split(" ");
		int arr1[]  = new int[arr1Input.length];
		for(int i=0;i<arr1Input.length;i++) {
			arr1[i] = Integer.parseInt(arr1Input[i]);
		}
		
		System.out.println("Enter Array 2 Elements Space-Separated");
		String[] arr2Input = sc.nextLine().split(" ");
		int arr2[]  = new int[arr2Input.length];
		for(int i=0;i<arr2Input.length;i++) {
			arr2[i] = Integer.parseInt(arr2Input[i]);
		}
		
		List<Integer> evenNums = new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				evenNums.add(arr1[i]);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==0) {
				evenNums.add(arr2[i]);
			}
		}
		
		System.out.println(evenNums);
		sc.close();
	}
}
