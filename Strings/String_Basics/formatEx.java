package String_Basics;
import java.util.Scanner;
public class formatEx {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int age = sc.nextInt();
	String newStr = String.format("Hello my name is %s and am %d years old..",name, age);
	System.out.println(newStr);
	sc.close();
}
}
