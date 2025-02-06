package String_Basics;
import java.util.Scanner;
public class replaceEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		String str1m = str1.replaceAll("[aeiouAEIOU]", "%");
		String str2m = str2.replaceAll("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]", "#");
		String str3m = str3.toUpperCase();
		System.out.println(str1m+str2m+str3m);
		sc.close();
	}
}
