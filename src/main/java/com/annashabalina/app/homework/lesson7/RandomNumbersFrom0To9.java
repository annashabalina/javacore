package com.annashabalina.app.homework.lesson7;

import com.annashabalina.runners.lesson9.ArrayPrint;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class RandomNumbersFrom0To9 {
    public static int[] createAndPopulate(){
        int[] arr = new int[15];
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*9);
            if(arr[i]%2==0){
                counter++;
            }
        }
        ArrayPrint.printArraySpaceSeparated(arr);
        System.out.print("There are "+counter+" even numbers");
        System.out.println();
        return arr;
    }
}
