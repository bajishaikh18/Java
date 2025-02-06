package FileHandling;
import java.io.*;
import java.util.Scanner;

public class FirstIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array...");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the Elements...");
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    int sum = 0;
        for(int j:arr) {
            sum += j;
        }
        System.out.println("Sum: " + sum);
    }
}
