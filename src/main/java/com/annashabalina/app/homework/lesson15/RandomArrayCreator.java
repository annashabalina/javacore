package com.annashabalina.app.homework.lesson15;

import com.annashabalina.runners.lesson9.ArrayPrint;

/**
 * Created by Пользователь on 19.11.2016.
 */
public class RandomArrayCreator {
    public void createArr(int size){
        int[] newArr = new int[size];
        for(int i =0;i<newArr.length;i++){
            newArr[i]=(int)(Math.random()*100);
        }
        ArrayPrint.printArraySpaceSeparated(newArr);
    }

    public void createArr(int size1,int size2){
        int[][] newDoubleArr = new int[size1][size2];
        for(int i =0;i<newDoubleArr.length;i++){
            for(int y =0;y<newDoubleArr[i].length;y++){
                newDoubleArr[i][y]=(int)(Math.random()*100);
            }
        }
        ArrayPrint.printTwoDimensionalArray(newDoubleArr);
    }
}
