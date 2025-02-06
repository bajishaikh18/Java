package oneDimensionalArray;
import java.util.*;

class kLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
     
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input value of k
        int k = sc.nextInt();
        System.out.println("Input: arr = " + Arrays.toString(arr) + ", k = " + k);
        Arrays.sort(arr, Collections.reverseOrder());
        if(k>n) {
        	
        }
        System.out.print("Output: [");
        for(int i=0;i<k;i++) {
        	System.out.print(arr[i]);
			if(i<k-1) {
				System.out.print(",");
			}
        }
     System.out.print("]");
     sc.close();
    }
}
