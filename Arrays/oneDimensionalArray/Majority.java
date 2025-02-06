package oneDimensionalArray;
import java.util.*;

public class Majority {
    public static int majorityElement(int []v) {
        int n = v.length;
        int cnt = 0; 
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = sc.nextInt();
        }
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
        sc.close();
    }
}

