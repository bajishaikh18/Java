package Lambda_Expression;

interface StringConverter {
	String convert(String s);
}

public class Main2 {
public static void main(String[] args) {
	StringConverter toUppercase = s -> s.toUpperCase();
	System.out.println(toUppercase.convert("Hello World!"));
 }
}
