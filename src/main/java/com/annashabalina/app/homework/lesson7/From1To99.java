package com.annashabalina.app.homework.lesson7;

import static jdk.nashorn.internal.objects.NativeArray.push;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class From1To99 {
    public static int[] createArray(){
        int[] arr = new int[50];
        int i=1;
        for(int y =0;y<50;y++){
            if(i%2 !=0){
                arr[y]=i;
            }
            i+=2;
        }
        return arr;
    }
}
