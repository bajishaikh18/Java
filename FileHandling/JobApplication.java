package FileHandling;

import java.io.*;
import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/OneDrive/Desktop/Job.txt";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Company Name :- ");
            String company = sc.nextLine();
            System.out.println("Enter the Date (E.g.. 25th Oct) :- ");
            String date = sc.nextLine();

            String entry = "Applied to " + company + " on " + date + "." + "\n";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
                writer.write(entry);

                System.out.println("Application Logged..");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
