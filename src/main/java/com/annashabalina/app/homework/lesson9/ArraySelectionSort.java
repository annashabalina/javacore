package com.annashabalina.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class ArraySelectionSort {
    private static int temp;
    public static int[] fromSmallerToBigger(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr.length; y++) {
                if (arr[i] < arr[y]) {
                    temp = arr[y];
                    arr[y] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] fromBiggerToSmaller(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr.length; y++) {
                if (arr[i] > arr[y]) {
                    temp = arr[y];
                    arr[y] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}