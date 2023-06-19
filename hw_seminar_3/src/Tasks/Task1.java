package Tasks;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    // Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
    public static void execute() {
        Random rnd = new Random();
        int length = 10;
        int lowBound = -10;
        int upBound = 10;
        int[] myArray = new int[length];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(lowBound, upBound);
        }

        System.out.println(Arrays.toString(myArray));

        SortUnsorted(myArray, 0, myArray.length - 1);

        System.out.println(Arrays.toString(myArray));
    }

    private static void SortUnsorted(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;
        int mid = startIndex + (endIndex - startIndex) / 2;
        SortUnsorted(arr, startIndex, mid);
        SortUnsorted(arr, mid + 1, endIndex);

        int[] buf = Arrays.copyOf(arr, arr.length);

        for (int k = startIndex; k <= endIndex; k++)
            buf[k] = arr[k];

        int i = startIndex, j = mid + 1;
        for (int k = startIndex; k <= endIndex; k++) {

            if (i > mid) {
                arr[k] = buf[j];
                j++;
            } else if (j > endIndex) {
                arr[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                arr[k] = buf[j];
                j++;
            } else {
                arr[k] = buf[i];
                i++;
            }
        }
    }

    /*
     * private void SortUnsorted(int[] a, int lo, int hi) {
     * 
     * if (hi <= lo)
     * return;
     * int mid = lo + (hi - lo) / 2;
     * SortUnsorted(a, lo, mid);
     * SortUnsorted(a, mid + 1, hi);
     * 
     * int[] buf = Arrays.copyOf(a, a.length);
     * 
     * for (int k = lo; k <= hi; k++)
     * buf[k] = a[k];
     * 
     * int i = lo, j = mid + 1;
     * for (int k = lo; k <= hi; k++) {
     * 
     * if (i > mid) {
     * a[k] = buf[j];
     * j++;
     * } else if (j > hi) {
     * a[k] = buf[i];
     * i++;
     * } else if (buf[j] < buf[i]) {
     * a[k] = buf[j];
     * j++;
     * } else {
     * a[k] = buf[i];
     * i++;
     * }
     * }
     * }
     */

}
