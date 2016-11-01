package com.annashabalina.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class ArraySelectionSort {
    private static int temp;
    public static int[] fromSmallerToBigger(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            for (int y = i+1; y < arr.length; y++) {
                if (arr[indexOfMin] > arr[y]) {
                    indexOfMin=y;
                }
            }
                temp = arr[indexOfMin];
                arr[indexOfMin]=arr[i];
                arr[i]=temp;
        }
        return arr;
    }

    public static int[] fromBiggerToSmaller(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int indexOfMax = i;
            for (int y = i+1; y < arr.length; y++) {
                if (arr[indexOfMax] < arr[y]) {
                    indexOfMax = y;
                }
            }
            temp=arr[indexOfMax];
            arr[indexOfMax]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}