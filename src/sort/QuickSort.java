package sort;

/**
 * @author wtiaw
 * @date 2021/3/16 9:25
 */
public class QuickSort {
    int[] arr;

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int left = start;
        int right = end - 1;
        int mid = arr[end];
        while (left < right) {
            while (arr[left] <= mid && left < right) {
                left++;
            }
            while (arr[right] >= mid && left < right) {
                right--;
            }
            swap(arr, left, right);
        }
        if (arr[left] >= arr[end]) {
            swap(arr, left, end);
        } else {
            left++;
        }
        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
}





