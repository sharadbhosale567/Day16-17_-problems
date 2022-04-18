package com.day16_and_day17;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        String[] array = { "Karnataka", "Hyderabad", "Delhi", "Noida", "Goa", "Kerala" };
        mergeSort(array, 0, array.length - 1);
        System.out.println("Result " + Arrays.toString(array));
    }

    public static void mergeSort(String[] array, int low, int high) {

        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(String[] array, int low, int mid, int high) {
        int n = high - low + 1;
        String[] b = new String[n];
        int i1 = low;
        int i2 = mid + 1;
        int j = 0; // next open position in b
        while (i1 <= mid && i2 <= high) {
            if (array[i1].compareTo(array[i2]) < 0) {
                b[j] = array[i1];
                i1++;
            } else {
                b[j] = array[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = array[i1];
            i1++;
            j++;
        }

        while (i2 <= high) {
            b[j] = array[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            array[low + j] = b[j];
        }
    }
}
