package Practice.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddsEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] nums = input.split(" ");

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for(String numStr:nums) {
            int num = Integer.parseInt(numStr);

            if(num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        List<Integer> results = new ArrayList<>();
        results.addAll(evens);
        results.addAll(odds);

        System.out.println(results);
        System.out.println(results.get(results.size()-1));

    }
}
