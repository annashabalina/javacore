package com.annashabalina.app.homework.lesson7;

import com.annashabalina.runners.lesson9.ArrayPrint;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class From1To999{
    public static int[] createAndPopulate(){
        int[] arr = new int[15];
        int max=0;
        int min=999;
        for(int i =0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*999);
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.println();
        ArrayPrint.printArraySpaceSeparated(arr);
        System.out.println("Maximum value is "+max);
        System.out.println("Minimum value is "+min);
        return arr;
    }
}
