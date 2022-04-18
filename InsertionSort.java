package com.day16_and_day17;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        String[] array = { "trimph", "benelli", "kawasaki", "honda", "ducati", "bmw", "yamaha", "ktm" };
        System.out.println("Before Insertion Sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print("   "+array[i]);
        }
        System.out.println();

        System.out.println("After Insertion Sort");

        String[] sortedArray = insertionSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print("   "+sortedArray[i]);
        }
    }

    public String[] sort(String array[]) {
        String temp = " ";
        int arrayLength=array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
