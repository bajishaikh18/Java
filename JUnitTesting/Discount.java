package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Discount {

    public static void main(String[] args) {
        double amount = 4500;
        double discountedPrice = calculateDiscountedPrice(amount);
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public static double calculateDiscountedPrice(double amount) {
        if (amount > 5000) {
            return roundToTwoDecimals(amount * 0.8);  // 20% discount
        } else if (amount >= 2000) {
            return roundToTwoDecimals(amount * 0.9);  // 10% discount
        } else {
            return roundToTwoDecimals(amount);        // No discount
        }
    }

    private static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Test
    public void testMediumAmountDiscount() {
        assertEquals(4050.0, calculateDiscountedPrice(4500), 0.01);
    }
}

