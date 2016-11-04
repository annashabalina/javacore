package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class From2To20Array {
    public static int[] createEvenNumsArray(){
        int[] resultArr=new int[11];
        int counter=0;
        for(int i=0;i<=20;i++){
            if(i%2==0){
                resultArr[counter]=i;
                counter++;
            }
        }
        return resultArr;
    }
}
