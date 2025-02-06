package Deque;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Character> dq = new ArrayDeque<>();
		
		String name = sc.nextLine();
		
		for(char c: name.toCharArray()) {
			dq.add(c);
		}
		
		StringBuilder reverse = new StringBuilder();
		while(!dq.isEmpty()) {
			reverse.append(dq.pollLast());
		}
		
		System.out.println("Reversed String: " + reverse.toString());
		sc.close();
	}
}
