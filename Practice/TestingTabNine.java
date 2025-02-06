import java.util.Scanner;
public class TestingTabNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age == 0) {
			System.out.println("Doesn't Exists");
		} else if(age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Doesn't Eligible");
		}
		sc.close();
	}
}
