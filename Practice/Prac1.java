import java.util.Scanner;

public class Prac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "banana";
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
				continue;
			}
			System.out.println(str.charAt(i) +"- : "+ count);
		}
		sc.close();
	}
}
