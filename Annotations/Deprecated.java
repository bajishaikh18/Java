package Annotations;

class Calc {
    @java.lang.Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }
}

public class Deprecated {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(5,4));;
    }
}
