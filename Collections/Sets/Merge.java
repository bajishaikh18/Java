package Sets;
import java.util.TreeSet;
import java.util.Scanner;
public class Merge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.nextLine();
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		for(int i=0;i<n1;i++) {
			nums.add(sc.nextInt());
		}
		
		int n2 = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n2;i++) {
			nums.add(sc.nextInt());
		}
		
		for(Integer ele:nums) {
			System.out.print(ele  + " ");
		}
		sc.close();
	}
}
