package CompareTo;
import java.util.*;
class newStringCompare  implements Comparable<newStringCompare>  {
	private String str;
	
	public newStringCompare(String str) {
		this.str = str;
	}
	@Override
	public int compareTo(newStringCompare other) {
		return other.str.compareTo(this.str);
	}
	
	public String toString() {
		return str;
	}
}

public class DescCompre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<newStringCompare> strings = new ArrayList<newStringCompare>();
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			strings.add(new newStringCompare(str));
		}
		
		Collections.sort(strings);
		
		System.out.println("In Desc Order:");
		for(newStringCompare ele: strings) {
			System.out.println(ele);
		}
		sc.close();
	}
}
