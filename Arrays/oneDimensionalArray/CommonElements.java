package oneDimensionalArray;
import java.util.*;
public class CommonElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array 1 Elements Space-Separated : ");
		String[] arr1Input = sc.nextLine().split(" ");
		int arr1[] = new int[arr1Input.length];
		for(int i=0;i<arr1Input.length;i++) {
			arr1[i] = Integer.parseInt(arr1Input[i]);
		}
		
		System.out.println("Enter Array 2 Elements Space-Separated : ");
		String[] arr2Input = sc.nextLine().split(" ");
		int arr2[] = new int[arr2Input.length];
		for(int i=0;i<arr2Input.length;i++) {
			arr2[i] = Integer.parseInt(arr2Input[i]);
		}
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> commonElements = new HashSet<Integer>();
		
		for(int ele : arr1) {
			set1.add(ele);
		}
		
		for(int ele : arr2) {
			set2.add(ele);
		}
		
		for(int ele : arr1) {
			if(set2.contains(ele)) {
				commonElements.add(ele);
			}
		}
		System.out.println("Hash Set : " + commonElements);
		List<Integer> commonElementsList = new ArrayList<Integer>(commonElements);
		Collections.reverse(commonElementsList);
		System.out.println(commonElementsList);
		
		sc.close();
	}
}
