package com.annashabalina.app.homework.lesson15;

import com.annashabalina.runners.lesson9.ArrayPrint;

/**
 * Created by Пользователь on 20.11.2016.
 */
public class RandomArrayParametrized extends RandomArrayCreator {
    public int a;
    public int b;

    public RandomArrayParametrized(int a) {
        this.a = a;
    }

    public RandomArrayParametrized(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void createArr(int a) {
        a=this.a;
        int[] newArr = new int[a];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int) (Math.random() * 100);
        }
        ArrayPrint.printArraySpaceSeparated(newArr);
    }

    @Override
    public void createArr(int a, int b) {
        a=this.a;
        b=this.b;
        if(a==0||b==0){
            System.out.println("null");
        }else{
            int[][] newArr = new int[a][b];
            for(int i =0;i<newArr.length;i++){
                for(int y =0;y<newArr[i].length;y++){
                    newArr[i][y]=(int)(Math.random()*100);
                }
            }
            ArrayPrint.printTwoDimensionalArray(newArr);
        }
    }
}
