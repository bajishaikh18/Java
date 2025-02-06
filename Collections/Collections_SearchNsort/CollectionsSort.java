package Collections_SearchNsort;
import java.util.*;

class CollectionsSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			nums.add(sc.nextInt());
		}
		
		Collections.sort(nums, Collections.reverseOrder());
		
		System.out.println("Reverse Order: " + nums);
		sc.close();
	}
}
