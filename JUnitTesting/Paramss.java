package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Paramss {
    @ParameterizedTest
    @CsvSource({
            "1, false",
            "2, true",
            "3, true",
            "4, false",
            "5, true",
            "6, false",
            "7, true",
            "8, false",
            "9, false",
            "10, false",
            "11, true"
    })

    public void testPrime(int number, boolean expectedResult) {
        assertEquals(expectedResult, isPrime(number));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}