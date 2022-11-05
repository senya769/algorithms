package algorithm.search.sorted.selection;

import java.util.Arrays;

public class SelectionSortApp {
    public static void main(String[] args) {
        int[] arr = {2,8,9,6,5,4,6,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int minEl = arr[minIndex];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minEl) {
                    minEl = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = minEl;
            arr[minIndex] = temp;
        }
        return arr;
    }
}
