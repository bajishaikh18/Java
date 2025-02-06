package Lambda_Expression;

interface StringConverter2 {
	String convert(String s);
}

public class Main3 {
	public static void main(String[] args) {
		StringConverter2 toLowerCase = s -> s.toLowerCase();
		System.out.println(toLowerCase.convert("HELLO WORLD!"));
	}
}
