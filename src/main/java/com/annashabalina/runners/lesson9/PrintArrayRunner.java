package com.annashabalina.runners.lesson9;

import com.annashabalina.app.classwork.lesson9.ArrayBubbleSort;
import com.annashabalina.app.homework.lesson9.ArrayPrint;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class PrintArrayRunner {
    public static void main(String[] args) {
        int[] arr = {887,4,56,23,10,-598};
        ArrayPrint.printArray("Original array is: ",arr);

        ArrayBubbleSort.fromSmallerToBigger(arr);
        ArrayPrint.printArray("Array sorted from smaller to bigger: ", arr);

        ArrayBubbleSort.fromBiggerToSmaller(arr);
        ArrayPrint.printArray("Array sorted from bigger to smaller: ", arr);
    }
}
