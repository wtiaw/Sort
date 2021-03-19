import sort.HeapSort;
import sort.MergeSort;
import sort.QuickSort;

import java.util.Arrays;

/**
 * @author wtiaw
 * @date 2021/3/16 8:47
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 9, 8, 3, 6};
        HeapSort.HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
