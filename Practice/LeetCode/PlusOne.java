package Practice.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int t = 0;
        for(int num : digits){
            t = t * 10 + num;
        }
        t = t+1;
        ArrayList<Integer> list = new ArrayList<>();
        int len = digits.length;
        while (t>0){
            int temp = t%10;
            list.add(temp);
            t = t/10;
        }

        Collections.reverse(list);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
