package JUnitTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int mul(int a, int b){
        return a*b;
    }
}

class CalculatorTest{
    @Test
    public void TestAdd(){
        Calculator calculator = new Calculator();
        int addResult = calculator.add(5,7);
        assertEquals(12,addResult);
    }

    @Test
    public void TestMul(){
        Calculator calculator = new Calculator();
        int mulResult = calculator.mul(4,4);
        assertEquals(16, mulResult);
    }
}
