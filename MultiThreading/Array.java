import java.util.*;

class searchTask implements Runnable {
    private int arr[];
    private int num;

    public searchTask(int arr[], int num) {
        this.arr = arr;
        this.num = num;
    }

    @Override
    public void run() {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Found.. at index :" + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found..");
        }
    }
}

class sortTask implements Runnable {
    private int arr[];

    public sortTask(int arr[]) {
        this.arr = arr;
    }

    @Override
    public void run() {
        Arrays.sort(arr);

        System.out.println("After Sorting" + Arrays.toString(arr));
    }
}

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array..");
        int n = sc.nextInt();
        System.out.println("Enter The Number to Search");
        int num = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element " + i);
            arr[i] = sc.nextInt();
        }

        Thread sortThread = new Thread(new sortTask(arr));
        sortThread.start();

        try {
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread searchThread = new Thread(new searchTask(arr, num));
        searchThread.start();

        try {
            searchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
