package Programmin;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        int n = scanner.nextInt();

        System.out.println("The first " + n + " prime numbers are:");

        int count = 0; // To count the number of prime numbers found
        int num = 2;   // The number to check for primality

        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a factor, not a prime
            }
        }
        return true; // No factors found, it's a prime number
    }
}

