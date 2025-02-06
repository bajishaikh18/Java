package Sorting;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 5, 5, 6};
        int thirdMaxOrMax = findThirdDistinctMaxOrMax(array);
        System.out.println("The third distinct maximum or the maximum is: " + thirdMaxOrMax);
    }

    public static int findThirdDistinctMaxOrMax(int[] array) {
        int distinctCount = 0;
        Integer previousElement = null;
        Integer maxElement = null;

        for (int i = array.length - 1; i >= 0; i--) {
            if (previousElement == null || array[i] != previousElement) {
                distinctCount++;
                previousElement = array[i];
                maxElement = array[i];
                if (distinctCount == 3) {
                    return array[i];
                }
            }
        }
        return maxElement;
    }
}


