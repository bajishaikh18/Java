package String_Basics;
import java.text.SimpleDateFormat;
import java.util.*;

public class dateNformatEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double pi = sc.nextDouble();
		
		System.out.println(String.format("Formatted number: %,d", number ));
		System.out.println(String.format("Formatted Pi: %.2f",pi));
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E, MMM, dd, yyyy");
		System.out.println("date:" + sdf.format(today));
		sc.close();
	}
}
