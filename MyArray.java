package lab4;

import java.util.Arrays;

public class MyArray {
//    Task 1.1
    public static void swap(int[] arr, int index1, int index2) {
        int num = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = num;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

//    Task 1.2
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) swap(arr, j, j+1);
            }
        }
    }

//    Task 1.3
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > key) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

//    Task 2.1
    public static void mergeSorting(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSorting(arr, left, mid);
            mergeSorting(arr, mid+1, right);
            merge(arr, left, mid ,right);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int lengthLeft = m - l + 1;
        int lengthRight = r - m;

        int[] arrL = new int[lengthLeft];
        int[] arrR = new int[lengthRight];

        for (int i = 0; i < arr.length; i++) {
            arrL[i] = arr[l + i];
        }

        for (int j = 0; j < arr.length; j++) {
            arrR[j] = arr[m + 1 + j];
        }

        int i = 0; int j = 0;
        int cursor = l;

        while ( i < lengthLeft && j < lengthRight) {

        }
    }

//    Task 2.2
    public static void quickSort(int arr[]) {
        recursive(arr, 0, arr.length-1);
    }

    public static void recursive(int[] arr, int low, int high) {
        if (low < high) {
            int partiton = partition(arr, low, high);
            recursive(arr, low, partiton-1);
            recursive(arr, partiton+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, high, i);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {23, 1, 23, 43, 65, 12};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
