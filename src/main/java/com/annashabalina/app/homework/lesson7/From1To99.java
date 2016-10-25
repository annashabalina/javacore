package com.annashabalina.app.homework.lesson7;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.push;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class From1To99 {
     public static void fillOddArray(){
        int[] oddArray = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,
                          45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,
                          91,93,95,97,99};
        for(int i=0;i<oddArray.length;i++){
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        for(int y = oddArray.length-1; y>=0; y--){
            System.out.print(oddArray[y] + " ");
        }
        System.out.println();
    }
}
