package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class RandomNumbersFrom0To9 {
    public static int[] createAndPopulate(){
        int[] arr = new int[15];
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*9);
            System.out.print(arr[i] + " ");
            if(arr[i]%2==0){
                counter++;
            }
        }
        System.out.println();
        System.out.print("There are "+counter+" even numbers");
        System.out.println();
        return arr;
    }
}
