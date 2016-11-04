package com.annashabalina.runners.lesson9;

import com.annashabalina.app.homework.lesson9.ArraySelectionSort;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class ArraySelectionSortRunner {
    public static void main(String[] args) {
        int[] arr = {-45, 1, 28, 23, 64, -18};
        ArrayPrint.printArray("Original array is: ", arr);
        ArraySelectionSort.fromBiggerToSmaller(arr);
        ArrayPrint.printArray("Array sorted from bigger to smaller: ", arr);
        ArraySelectionSort.fromSmallerToBigger(arr);
        ArrayPrint.printArray("Array sorted from smaller to bigger: ", arr);
    }
}
