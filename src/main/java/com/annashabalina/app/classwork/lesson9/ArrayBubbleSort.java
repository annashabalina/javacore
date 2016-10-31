package com.annashabalina.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class ArrayBubbleSort {
    private static int temp;
    private static int flag = 1;

    public static int[] fromSmallerToBigger(int[] arr){
        while(flag==1){
            flag=0;
            for(int i =0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    flag=1;
                }
            }
        }
        flag =1;
        return arr;
    }

    public static int[] fromBiggerToSmaller(int[] arr){
        while(flag==1){
            flag=0;
            for(int i=0; i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    flag=1;
                }
            }
        }
        flag=1;
        return arr;
    }
}
