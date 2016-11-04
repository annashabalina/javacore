package com.annashabalina.runners.lesson9;

import java.util.Arrays;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class ArrayPrint {
    public static void printArray(String intro, int[] arr){
       System.out.println(intro + Arrays.toString(arr));
    }

    public static void printArraySpaceSeparated(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayColumn(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void printArrayBackwards(int[]arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void printTwoDimensionalArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int y=0;y<arr[i].length;y++){
                System.out.print(arr[i][y] + " ");
            }
            System.out.println();
        }
    }
}

