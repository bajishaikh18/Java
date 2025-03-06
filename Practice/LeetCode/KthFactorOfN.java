package Practice.LeetCode;

import java.util.ArrayList;

public class KthFactorOfN {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> ai = new ArrayList<>();
        for(int i =1; i<=n;i++) {
            if( i % n == 0) {
                ai.add(i);
            }
        }

        if(k<= ai.size()) {
            return ai.get(k-1);
        }
        return -1;
    }

//    public static int kthFactor(int n, int k) {
//
//        ArrayList<Integer> al = new ArrayList<Integer>();
//
//        for (int i = 1; i <= n; i++) {
//
//            if(n % i ==0) {
//                al.add(i);
//            }
//
//        }
//
//        if(k<= al.size()) {
//            return al.get(k-1);
//        }
//
//        return -1;
//    }
}
